// Поститать количество предложений

public class String15 {
    public static void main (String [] args){
        String sentences = "My name is Dima! I have two dogs and a turtle. Do you have a pet?";
        System.out.println(sentences);
        System.out.println("В этой строке столько предложений: "+sentenceNum(sentences));
    }
    private static int sentenceNum (String x){
        int counter = 0;
        for (int i = 0; i < x.length(); i++){
            if (x.charAt(i) == '?' || x.charAt(i) == '!' || x.charAt(i) == '.' ){
                counter++;
            }
        }
        return counter;
    }
}
