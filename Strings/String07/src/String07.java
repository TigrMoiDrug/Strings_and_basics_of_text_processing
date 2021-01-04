// вставить b после каждой буквы а

public class String07 {
    public static  void main (String [] args){
        String old = "I am a happy astronaut";
        System.out.print(replaced(old));
    }
    private static String replaced (String a){
        return a.replaceAll("a","ab");
    }
}
