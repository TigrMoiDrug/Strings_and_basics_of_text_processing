// 3. Strings and basics of text processing.
// Работа со строкой как с массивом символов.
//                     Задача 1
public class String01 {

    public static void main (String [] args){
        String [] camels = {"JavaIntro", "OnceUponATime", "YouOnlyLiveOnce", "WildRose"};
        camelCycle(camels);
    }


    public static void camelCycle (String [] camels){
        for (String camel : camels) {
            System.out.print(camelToSnake(camel+ ", "));
        }
    }


    public static String camelToSnake(String snake) {
        String result = "";
        char c = snake.charAt(0);
        result = result + Character.toLowerCase(c);

        for (int i = 1; i < snake.length(); i++) {
            char ch = snake.charAt(i);
            if (Character.isUpperCase(ch)) {
                result = result.concat("_");
                result = result + Character.toLowerCase(ch);
            }
            else {
                result = result + ch;
            }
        }
        return result;
    }
}
