package thirtyDaysOfCode;

public class ReverseString_4 {
    public static void main(String[] args) {
        String str = "Selenium";
        System.out.println(reverseStringWithSb(str));

    }
    private static String reverseStringWithSb(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    private static String reverseString(String str){
        String reverseStr = null;

        for (int i = str.length() -1 ; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        return reverseStr;
    }


}
