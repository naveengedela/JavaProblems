package www.journaldev.com;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] intArr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(isArraySorted(intArr)));
    }

    private static int[] isArraySorted(int[] intArr) {
        int j = intArr.length - 1;


        for (int i = 0; i < intArr.length / 2; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[j - i];
            intArr[j - i] = temp;
        }
        return intArr;
    }


}
