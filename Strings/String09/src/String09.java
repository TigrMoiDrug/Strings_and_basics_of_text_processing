
// из слова информатика собрать торт
public class String09 {
    public static void main (String [] args){
        String informatica = "информатика";
        System.out.print(makingCake(informatica));
    }
    private static String makingCake (String x){
        String t = x.substring(7, 8);
        String or = x.substring(3, 5);
        return t + or + t;
    }
}
