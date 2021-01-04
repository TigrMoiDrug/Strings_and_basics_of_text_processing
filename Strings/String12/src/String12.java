/*    Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
    Например, если было введено "abc cde def", то должно быть выведено "abcdef".
*/

public class String12 {
    public static void main (String[]args){
        String str = "   hheeell  oo !!";
        System.out.print(deletedDubs(deletedSpaces(str)));
    }


    private static String deletedSpaces (String spaceX){
        return spaceX.replaceAll(" ", "");
    }


    private static String deletedDubs (String x){
        String deleted = "";

        for (int i = 0; i < x.length(); i++){
            String s = "" + x.charAt(i);
            if (deleted.contains(s)){
            }
            else {
                deleted += x.charAt(i);
            }
        }
        return deleted;
    }
}
