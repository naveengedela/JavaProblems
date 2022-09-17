package Top30;

import java.util.Scanner;

public class FibnacciSeries {

    private static long[] fibonacciCache;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int num = scanner.nextInt();
        fibonacciCache = new long[num + 1];

        System.out.println(fibonacci(num));

//        for (int i=0; i<num; i++){
//            System.out.println(fibonacci(i));
//        }

    }

    private static long fibonacci(int n){
        if (n <= 1) return  n;

        if (fibonacciCache[0] != 0)
            return fibonacciCache[n];

        long nthFibonacciSeries = fibonacci(n- 1) + fibonacci(n -2);
        fibonacciCache[n] = nthFibonacciSeries;
        return nthFibonacciSeries;
    }
}
