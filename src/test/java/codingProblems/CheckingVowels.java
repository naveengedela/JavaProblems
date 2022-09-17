package codingProblems;

public class CheckingVowels {
    public static void main(String[] args) {
        System.out.println(isVowelsShown("java"));
        System.out.println(isVowelsShown("TV"));
    }

    private static boolean isVowelsShown(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
