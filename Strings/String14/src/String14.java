/*   Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
       Учитывать только английские буквы
*/
public class String14 {
    public static void main (String [] args){
        String cases = "My name is Dima. I have two dogs and a turtle";
        System.out.println(cases);
        System.out.print("Заглавных букв: "+uppers(cases)+". Прописных: "+lows(cases));

    }


    private static int uppers (String x){
        int upperCounter = 0;
        for (int i = 0; i < x.length(); i++){
            if (Character.isUpperCase(x.charAt(i))){
                upperCounter++;
            }
        }
        return upperCounter;
    }


    private static int lows (String x){
        int lowerCounter = 0;
        for (int i = 0; i < x.length(); i++){
            if (Character.isLowerCase(x.charAt(i))){
                lowerCounter++;
            }
        }
        return lowerCounter;
    }
}
