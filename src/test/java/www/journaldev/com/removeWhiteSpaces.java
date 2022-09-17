package www.journaldev.com;

public class removeWhiteSpaces {
    public static void main(String[] args) {
        String str = "j a v a";
        System.out.println(removeWhiteSpaces(str));
    }

    private static String removeWhiteSpaces(String str) {
        StringBuilder output = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                output.append(ch);
            }
        }
        return output.toString();
    }
}
