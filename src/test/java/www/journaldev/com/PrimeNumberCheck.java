package www.journaldev.com;

import static com.google.common.math.IntMath.isPrime;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPrimeShown(19));
        System.out.println(isPrimeShown(49));
    }

    private static boolean isPrimeShown(int i) {
        if (i == 0 || i == 1) return false;
        if (i == 2) return true;
        for (int j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
