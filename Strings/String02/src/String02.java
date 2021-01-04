// 3. Strings and basics of text processing.
// Работа со строкой как с массивом символов.
//                     Задача 2

public class String02 {

    public static void main (String [] args){
        String words = "Word is a number of chars, word is not a sparrow.";
        String word = "word";
        String letter = "letter";
        print(wordToLetter(words, word, letter));
    }


    private static String [] wordToLetter(String x, String wor, String lett){
        String [] ofLetters = x.split(" ");
        for (int i = 0; i < ofLetters.length; i++){
            if (ofLetters[i].equalsIgnoreCase(wor)){
                ofLetters[i] = lett;
            }
        }
        return ofLetters;
    }


    public static void print (String [] x){
        for (String s : x) {
            System.out.print(s + " ");
        }
    }
}
