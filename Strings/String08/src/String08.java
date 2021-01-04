import java.util.Scanner;

public class String08 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String usersWord = sc.nextLine();
        checkingPalindrome(usersWord);
    }


    private static void checkingPalindrome (String x){
        StringBuilder reversedString = new StringBuilder(x).reverse();
        if (x.equalsIgnoreCase(reversedString.toString())){
            System.out.print("Слово является палиндромом.");
        }
        else {
            System.out.print("Слово не является палиндромом.");
        }
    }
}
