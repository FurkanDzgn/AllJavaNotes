package AMyQu;

import java.util.*;

public class removeDublicate {

    // Ex: removeDup("AAABBBCCC") ==> ABC
    public static String method1(String str){

        Set<String> set = new LinkedHashSet<>(Arrays.asList(str.split("")));
        List<String> list = new ArrayList<>(set);
        String res = "";
        for(String ll:list){
            res += ll;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(removeDublicate.method1("AAABBBCCC"));
    }
}
