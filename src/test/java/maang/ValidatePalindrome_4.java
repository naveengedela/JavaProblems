package maang;

public class ValidatePalindrome_4 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        validatePal(str);
    }

    private static void validatePal(String str) {
        String newStr = str.replaceAll("[0-9 ]", "").toLowerCase();
        System.out.println(newStr);
    }
}
