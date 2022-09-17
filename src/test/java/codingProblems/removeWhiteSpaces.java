package codingProblems;

public class removeWhiteSpaces {
    public static void main(String[] args) {
        String str = "a b c d";
        System.out.println(removeWhiteSpac(str));
    }

    private static String removeWhiteSpac(String str) {
       StringBuilder sb = new StringBuilder();
       char[] chArray = str.toCharArray();

       for(char ch: chArray){
           if (!Character.isWhitespace(ch)){
               sb.append(ch);
           }
       }
       return sb.toString();
    }

}
