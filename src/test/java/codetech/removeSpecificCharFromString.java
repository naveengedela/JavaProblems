package codetech;

public class removeSpecificCharFromString {
    public static void main(String[] args) {
        String str = "cloudTech";
        char ch = 'c';
        System.out.println(removeSpecificeChar(str, ch));
        System.out.println(withReplaceAll(str));
    }


    // 1 way with for loop
    private static String removeSpecificeChar(String str, char chr) {
        String newStr = str.toLowerCase();

        StringBuilder output = new StringBuilder();

        for (char ch : str.toCharArray()){
            if (ch != chr){
                output.append(ch);
            }
        }
        return output.toString();
    }


    //2 way with replaceAll
    private static String withReplaceAll(String str) {
        return str.replaceAll("c", "");
    }
}
