// 3. Strings and basics of text processing.
// Работа со строкой как с массивом символов.
//                     Задача 5
public class String05 {

    public static void main (String [] args){
        String givenSentence = " All   ypu    need is love ";
        String trimmed = givenSentence.trim();
        deleteSpaces(trimmed);
    }


    private static void deleteSpaces (String s){
        char[] charArray = s.toCharArray();
        char prev = s.charAt(0);
        for (char cur : charArray) {
            if (cur == ' ' && prev == ' ') {

            } else {
                System.out.print(cur);
            }
            prev = cur;
        }
    }


}
