package www.journaldev.com;

public class ReverseString {

    public static void main(String[] args) {
        String str = "techmahindra";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString.append(str.charAt(i));
        }
        return reverseString.toString();
    }
}
