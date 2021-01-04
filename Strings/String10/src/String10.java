// посчитать количество букв а

public class String10 {
    public static void main (String [] args){
        String str = "аабаббаввваа";
        System.out.print(aCounter(str));
    }
    private static int aCounter (String a){
        StringBuilder x = new StringBuilder(a);
        int count = 0;
        for (int i = 0; i < x.length(); i++){
            if (x.charAt(i) == 'a' || x.charAt(i) == 'а' ){       // для латиницы и кириллицы
                count++;
            }
        }
        return count;
    }
}
