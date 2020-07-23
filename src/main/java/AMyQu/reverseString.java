package AMyQu;

public class reverseString {

    public static String method1(String str){

        StringBuilder stb = new StringBuilder(str);
        stb = stb.reverse();

        return stb.toString();
    }
    public static String method2(String str){
        String result = "";
        int length = str.length()-1;
        for(int i=0;i<=length;length--){
          //  System.out.println(str.charAt(length));
            result +=str.charAt(length);
        }
        return result;
    }

    public static String StrReverse(String str) {
        String reverse="";
        for(int i=str.length()-1; i >= 0; i--)
            reverse += str.toCharArray()[i];
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseString.method1("kumar"));
        System.out.println(reverseString.method2("kumar"));

    }
}
