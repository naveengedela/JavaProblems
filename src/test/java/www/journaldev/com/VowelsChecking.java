package www.journaldev.com;


public class VowelsChecking {

    public static void main(String[] args) {
        String str = "TV";
        String str2 = "Master";
        System.out.println(isVowelsShown1(str));
        System.out.println(isVowelsShown1(str2));
    }

    private static boolean isVowelsShown1(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
