package codingProblems;
/*
* This program prints out the first 20 numbers in the fibonacci series.
* Each term is formed by adding together the previous last two terms in the sequence
* starting with term 1 and 1.
*/

public class Fibonacci {
    public static void main(String[] args) {
        int num = 18;
        int n0 =1, n1=1, n2; // Initialize variables
        System.out.println(n0 + " " + n1 + ""); // Print first and second terms of series
//
//        for (int i=0; i<num; i++){ // Loop for the next 18 terms
//            n2 = n0 + n1; // Next term is sum of previous two
//            System.out.println(n2 + " "); // // Print it out
//            n0 = n1; // First previous becomes 2nd previous
//            n1 = n2; // And current number becomes previous
//        }
//        System.out.println(); // Terminate the line

        for (int i=0; i <num; i++){
            n2 = n0 + n1;
            System.out.println(n2 +  "");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();

    }
}