package Arrays;

import java.util.Scanner;

public class ArraysCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        1 2 3
        4 5 6
        7 8 9

         */

        int[][] array2D = new int[3][3];
        System.out.println(array2D.length);

        System.out.println("Enter size of array ");
        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {
                array2D[row][col] = scanner.nextInt();
            }
        }

//        for (int i = 0; i < array2D.length; i++) {
//            for (int col = 0; col < array2D[i].length; col++) {
//                System.out.print(array2D[i][col] + " ");
//            }
//            System.out.println();
//        }

        for(int[] a: array2D)
        {
            System.out.println(java.util.Arrays.toString(a));
        }

    }
}
