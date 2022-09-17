package Top30;

import java.util.Scanner;


public class factorialOfNumber {
    private static long factorialCache;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int num = input.nextInt();

        System.out.println(factorial(num));
    }

    private static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);

    }
}
