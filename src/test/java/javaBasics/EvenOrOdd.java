package javaBasics;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the any number :");
        int num = scanner.nextInt();

        if (num % 2 == 1){
            System.out.println("Given number is Odd");
        }
        else {
            System.out.println("Given number is Even");
        }
    }
}
