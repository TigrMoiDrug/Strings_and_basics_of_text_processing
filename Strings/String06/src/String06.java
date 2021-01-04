public class String06 {

    // Подсчет пробелов
    public static void main (String [] args){
        String sentence = " All   ypu     need is love ";
        System.out.print(spaceCount(sentence));

    }
    private static int spaceCount (String x){         // аналогичный метод был в модуле Алгоритмизация
        int current = 0;
        int max = 0;
        for (int i = 0; i < x.length();i++){
            if(x.charAt(i) == ' '){
                current ++;
            }
            else {
                if (current > max){
                    max = current;
                }
                current = 0;           // оюнуляем счётчик
            }
        }
        return max;
    }
}
