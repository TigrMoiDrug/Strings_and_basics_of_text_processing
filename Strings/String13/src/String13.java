/*Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести
    его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
*/

public class String13 {
    public static void main (String [] args){
        String theLongestWord = "Меня зовут Дима, у меня две собаки и черепаха";
        System.out.print(splitted(theLongestWord));
    }


    private static String splitted (String x){
        String [] arr = x.split(" ");
        String max = "";
        for ( int i = 0; i < arr.length; i++){
            if (arr[i].length() > max.length()){
                max = arr[i];
            }
        }
        return max;
    }
}
