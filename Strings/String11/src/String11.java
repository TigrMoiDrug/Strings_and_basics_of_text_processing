// удвоить все символы
public class String11 {
    public static void main (String [] args){
        String one = "Hi ! My name is";
        System.out.print(dubling(one));
    }

    private static String dubling (String x){
        StringBuilder dub = new StringBuilder();
        for (int i = 0; i < x.length(); i++){
            dub.append(x.charAt(i)).append(x.charAt(i));
        }
        return dub.toString();
    }
}
