package recursion;
import java.util.Scanner;
public class ComputeFactorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative number :");
        int n = scanner.nextInt();


        System.out.println("Factorial of "+ n + ":: is " + factorial(n));
    }


    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
