package AMyQu;

import java.util.LinkedHashMap;
import java.util.Map;

public class frequencyOfChar {

    // Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static String method1(String str){

        String string="";
        int x=0;
        for(int i =0;i<str.length(); i+=x){
            x=1;
            for(int k=i+1 ; k<str.length();k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    ++x;
                }
            }

            string +=""+str.charAt(i)+x;
        }

        return string;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChar.method1("AAABBCDD"));
    }
}
