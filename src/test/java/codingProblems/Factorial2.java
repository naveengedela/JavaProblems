package codingProblems;

/**
 * This class shows a recursive method to compute factorials.  This method
 * calls itself repeatedly based on the formula: n! = n * (n-1)!
 **/
public class Factorial2 {
    public static void main(String[] args) throws IllegalArgumentException {
        int num = 30;
//        System.out.println(factorialOfNumber1(num));
        System.out.println(fact(num));
    }

    private static long factorialOfNumber1(long x) throws IllegalArgumentException {
        if (x < 0) throw new IllegalArgumentException("x must me >= 0");
        if (x <= 1) {        // Stop recurring here
            System.out.println("Factorial (" + x + ") = 1");
            return 1;
        } else {
            System.out.println("Factorial (" + x + ")  =" + x + "* factorial(" + (x - 1) + ")");
            return x * factorialOfNumber1(x - 1);    // Recurse by calling ourselves
        }
    }

    private static long fact(int x) {
        if (x < 0) throw new IllegalArgumentException("x must be >= 0");
        if (x <= 1) {
            return 1;
        } else {
            return  x * fact(x -1);
        }
    }
}
