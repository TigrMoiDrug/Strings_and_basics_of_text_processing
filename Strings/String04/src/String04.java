// 3. Strings and basics of text processing.
// Работа со строкой как с массивом символов.
//                     Задача 4

public class String04 {

    public static void main (String[]args){
        String lineOfSomething = "0235he93is1a4n8d2a7n6y5";
        print(numberOfDigits(lineOfSomething));
    }


    private static int numberOfDigits (String x){
        int numSum = 0;
        char [] converted = x.toCharArray();

        for (int i = 0; i < converted.length - 1; i++) {
            if (Character.isDigit(converted[i])) {
                if (Character.isDigit(converted[i + 1])){
                    continue;
                }
                else {
                    numSum++;
                }
            }
        }
        if(Character.isDigit(converted[converted.length - 1])){
            numSum++;
        }
        return numSum;
    }


    public static void print (int x){
        System.out.print(x);
    }
}
