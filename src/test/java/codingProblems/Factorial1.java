package codingProblems;

public class Factorial1 {
    public static void main(String[] args) throws IllegalAccessException {
        int number = 10;
        System.out.println(factorialOfNumber(number));

    }

    private static int factorialOfNumber(int x) throws IllegalAccessException {
        if (x < 0) {
            throw new IllegalAccessException("x must be >= 0");
        }
        int fact = 1;
        for (int i = 2; i < x; i++) {
            fact *= i;
        }
        return fact;
    }
}
