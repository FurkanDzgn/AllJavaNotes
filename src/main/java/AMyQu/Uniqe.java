package AMyQu;

public class Uniqe {

    // Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static String method1(String string){

        String str = "";


        for(int i=0; i<string.length();i++){
            int num = 0;
           for (int k=0 ;k<string.length(); k++){
               if(string.charAt(i) == string.charAt(k)){
                   num++;
               }
           }
           if(num == 1){
               str+=string.charAt(i);
           }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(Uniqe.method1("AAABBBCCCDEF"));
    }
}
