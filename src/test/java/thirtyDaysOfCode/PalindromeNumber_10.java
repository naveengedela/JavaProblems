package thirtyDaysOfCode;

public class PalindromeNumber_10 {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(343));
    }

    private static boolean isPalindromeNumber(int num) {
        int rev = 0;
        int result = num;

        while (num > 0) {
            rev = (rev * 10) + num % 10;
            num = num / 10;
        }

        if (result == rev){
            return true;
        }
        else {
            return false;
        }
    }
}
