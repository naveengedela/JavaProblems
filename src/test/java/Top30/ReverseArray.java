package Top30;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3,2, 1};
        System.out.println(Arrays.toString(reverseArr(arr)));
    }

    private static int[] reverseArr(int[] arr) {
        int j = arr.length -1;

        for (int i=0; i<=arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[j - i];
            arr[j-i] = temp;
        }
        return arr;
    }

}
