package thirtyDaysOfCode;

public class LargeAndSmallNumberInArray_7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        largest(arr);

    }

    public static void largest(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Largest number :: " + max);
        System.out.println("Smallest number :: " + min);
    }
}
