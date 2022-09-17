package Top30;

import java.util.Scanner;

public class CountEvenAndOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = input.nextInt();

        int evenCount = 0;
        int oddCount = 0;
        while (num > 0){
            int rem = num % 10;
            if (rem % 2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
            num =  num / 10;
        }

        System.out.println("Even count :: "+ evenCount + " " + "Odd count :" + oddCount);
    }
}
