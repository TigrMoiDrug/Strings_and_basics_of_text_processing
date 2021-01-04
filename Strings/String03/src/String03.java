// 3. Strings and basics of text processing.
// Работа со строкой как с массивом символов.
//                     Задача 3
public class String03 {

    public static void main (String[]args){
        String lineOfSomething = "0235he9is1a4n8d2a7n6d5";
        print(numberOfDigits(lineOfSomething));
    }


    private static int numberOfDigits (String x){
        int dig = 0;
        char [] converted = x.toCharArray();
        for (char c : converted) {
            if (c > 47 && c < 58) {
                dig++;
            }
        }
        return dig;
    }


    public static void print (int x){
        System.out.print(x);
    }
}
