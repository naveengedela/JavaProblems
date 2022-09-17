package thirtyDaysOfCode;

public class IsStringContainsONlyDigits_13 {
    public static void main(String[] args) {
        System.out.println(isDigitsContainInString("134"));
        System.out.println(isDigitsContainInString(""));
        System.out.println(isDigitsContainInString(null));
    }

    public static boolean isDigitsContainInString(String str){
        if (isEmpty(str))
            return false;
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(CharSequence cs){
        return cs == null || cs.length() == 0;
    }
}
