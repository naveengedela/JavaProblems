package codetech;

public class lowerAndUpper {

    public static void main(String[] args) {
        String str = "This is Docusign This is docusign";
        convertLowerAndUpperCase(str);
    }

    private static void convertLowerAndUpperCase(String str) {
        int mid = str.length() / 2;

        String lowerCase = "";
        String upperCase = "";

//        lower = str.substring(0, mid).trim().toLowerCase();
//        upper = str.substring(mid).toUpperCase();


        for(int i=0; i<str.length(); i++){
            if (i < mid){
                lowerCase += Character.toLowerCase(str.charAt(i));
            }
            else {
                upperCase += Character.toUpperCase(str.charAt(i));
            }
        }

        System.out.println(lowerCase + upperCase);
    }


}
