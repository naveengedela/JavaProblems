package codetech;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr3 = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
        findMissingNumber(arr);
        findMissingNumber(arr1);
        findMissingNumber(arr2);
        findMissingNumber(arr3);

    }

    private static void findMissingNumber(int[] arr) {
        //n * (n+1) / 2
        int sum = (10 * 11) / 2;

        int actualTotal = 0;

        for (int i = 0; i < arr.length; i++) {
            actualTotal = actualTotal + arr[i];
        }
        System.out.println("Missing number is ::" + (sum - actualTotal));
    }


}
