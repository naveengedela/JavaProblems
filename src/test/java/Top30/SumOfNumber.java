package Top30;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = input.nextInt();

        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
