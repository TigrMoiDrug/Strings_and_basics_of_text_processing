import java.util.Arrays;
import java.util.Scanner;

/* Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее
   выполнять с текстом три различных операции: отсортировать абзацы по количеству
   предложений; в каждом предложении отсортировать слова по длине; отсортировать
   лексемы в предложении по убыванию количества вхождений заданного символа,
   а в случае равенства – по алфавиту.
 */

public class String16 {
    public static void main(String[] args) {
        String text = "\n"+
                "   Platform 9 and 3⁄4, from which the Hogwarts Express left London, was\n"+
        "commemorated in the real-life King's Cross railway station with a sign and a trolley apparently\n"+
                "passing through the wall. \n"+
        "\n"+
        "   Bloomsbury accepted the book, paying Rowling a £2,500 advance, and Cunningham sent proof copies\n"+
        "to carefully chosen authors, critics and booksellers in order to obtain comments that\n"+
        "could be quoted when the book was launched. He was less concerned about the book's length\n"+
                "than about its author's name, since the title sounded like a boys' book to him,\n"+
                "and he believed boys preferred books by male authors. \n"+
        "\n"+
                "   In 1997 the UK edition won a National Book Award and a gold medal in the 9- to 11-year-olds\n"+
                "category of the Nestlé Smarties Book Prize. The Smarties award, which is voted for by\n"+
        "children, made the book well known within six months of publication, while most children's books\n"+
                "have to wait for years. The following year, Philosopher's Stone won almost all the other\n"+
                "major British awards that were decided by children. "+
                "\n";
        System.out.println(text);
        menu(text);
    }


    private static void menu (String x){
        System.out.println("1 - отсортировать абзацы по кол-ву предложений.");
        System.out.println("2 - отсортировать слова в предложениях по длине.");
        System.out.println("3 - отсортировать лексемы в предложениях ко количеству вхождений введенного символа.");
        System.out.print("Введите номер операции: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1){
            sortingParagraphs(x);
        }
        else if (choice == 2){
            sortingWords(x);
        }
        else if (choice == 3){
            lexSorting(x);
        }
        else {
            System.out.println("Введён номер несуществующей операции!");
        }
    }


    private static void swap (String [] arr, int one, int two ){                 // метод для перестановки в массиве
        String temp = "";
        temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }


    // регулярные выражения с методом сплит
    private static String [] splittedToParagraphs (String x){
        return x.split("(?m)(?=^\\s{4})");
    }
    private static String [] splittedToSentences (String x){
        return x.split("(?<=[a-zA-Z][!?.]\\s)");
    }
    private static String [] splittedToWords (String x) {
        return x.split("\\s+");
    }


    private static void sortingParagraphs (String x){                   // метод принимает текст из нескольких абзацев
        String[] paragraphs = splittedToParagraphs(x);
        for ( int i =0; i < paragraphs.length; i++){
           int min = i;
           for (int j = i; j < paragraphs.length; j++){
               if(splittedToSentences(paragraphs[j]).length > splittedToSentences(paragraphs[min]).length){
                   min = j;
               }
           }
           swap(paragraphs, i, min);
        }
        for (String paragraph : paragraphs) {
            System.out.print(paragraph);
        }
    }


    private  static void sortingWords (String x) {             // этот метод принимает текст из нескольких предложений
        String [] sentences = splittedToSentences(x);
        for (int i = 0 ; i < sentences.length; i++) {
            System.out.println();
            System.out.println("Предложение номер "+i+":");
            String[] words = splittedToWords(sentences[i].replaceAll("\\.", ". " ));
            for (int j = 0; j < words.length; j++) {
                int min = j;
                for (int k = j; k < words.length; k++) {
                    if (words[k].length() > words[min].length()){
                        min = k;
                    }
                }
                swap(words, j, min);
            }
            for (String word : words) {
                System.out.println(word + " ");
            }
        }
    }


    private static void lexSorting(String x) {                          // Сортировка лексем
        System.out.print("Введите букву для сортировки: ");
        Scanner sc = new Scanner(System.in);
        char wanted = sc.next().charAt(0);                              // достаём именно чар , а не строку
        String [] sentences = splittedToSentences(x.toLowerCase());     // меняем регистр для правильной сортировки
        for (int i = 0 ; i < sentences.length; i++) {
            String [] temp = splittedToWords(sentences[i]);
            Arrays.sort(temp);
            System.out.println();                                       // отступы, просто для более читаемого вывода строк
            System.out.println();
            for(int k = temp.length - 1; k > 0; k--) {                  //  сортировка пузырьком
                for( int j = 0; j < k; j++){
                    int curr = numOfSymbols(temp[j], wanted);
                    int next = numOfSymbols(temp[j + 1], wanted);
                    if (curr > next){
                        String swapper = temp[j];
                        temp[j] = temp[j+1];
                        temp[j+1] = swapper;
                    }
                }
            }
            for (int s = 0; s < temp.length; s++){
                System.out.print(temp[s]+" ");
            }
        }
    }


    private static int numOfSymbols (String word, char x){              // кол-во включений заданного символа  в слове
        int count = 0;                                                  // используется в методе по сортировке лексем
        char [] charWord = word.toCharArray();
        for (int i = 0; i < charWord.length; i++){
            if (Character.toLowerCase(charWord[i]) == Character.toLowerCase(x)){
                count++;
            }
        }
        return  count;
    }
}
