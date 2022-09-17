package codingProblems;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "aaaaaaaa";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        while (right > left){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
