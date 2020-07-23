package AMyQu;

import java.util.*;

public class sameStrs {

    /*
       Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:
     */
    public static boolean method1(String str,String str2){

        char[] ch1 = str.toCharArray();
        char[] ch2 = str2.toCharArray();

        boolean result = true;

        if(ch1.length != ch2.length){
            return !result;
        }
        else {
          OUTHER:
          for(int i=0; i<ch1.length; i++){
               INNER:
                for(int k=0; k<ch2.length; k++){
                     if(ch1[i] == ch2[k]){
                         result = true;
                         continue OUTHER;
                     }else{
                         result = false;
                     }

                }
            }
            return result;
        }
    }

    public static boolean method2(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String res1 = "";
        String res2 = "";
        if(ch1.length != ch2.length){
            return false;
        }

        for(int i=0;i<ch1.length;i++){
            res1 += ch1[i];
            res2 += ch2[i];
        }
        return res1 == res2;
    }

    public static boolean method3(String str1, String str2){

        Set<String> set1 = new TreeSet<>(Arrays.asList(str1.split("")));
        Set<String> set2 = new TreeSet<>(Arrays.asList(str2.split("")));

        List<String> list1 = new ArrayList<>(set1);
        List<String> list2 = new ArrayList<>(set2);

        return list1.containsAll(list2);


    }

    public static void main(String[] args) {
        System.out.println(sameStrs.method1("abc","abb"));
        System.out.println(sameStrs.method2("abc","abb"));
        System.out.println(sameStrs.method3("abc","cab"));
    }
}
