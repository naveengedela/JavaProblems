package hackerank;

import java.util.Scanner;

public class Java1dArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Declare array a here
        int a[]=new int[n];
        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            a[i]=val;
            // Fill array a here
        }
        scan.close();
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
