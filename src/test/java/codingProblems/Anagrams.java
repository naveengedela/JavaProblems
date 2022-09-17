package codingProblems;

import java.util.Arrays;

public class Anagrams {

    public static boolean anagramWithoutBuiltins(String a, String b){
        if (a.length() != b.length()){
            return false;
        }

        int count[] = new int[256];

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0 ) return false;
        }
        return true;
    }

    public static boolean anagram(String str1, String str2){
        char[] a = str1.toLowerCase().toCharArray();
        char[] b = str2.toLowerCase().toCharArray();

        if (a.length != b.length){
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(anagramWithoutBuiltins("naveen", "naveen"));
        String s1 = "naveen";
        String s2 = "naveen";
        System.out.println(anagram(s2, s2));
    }
}
