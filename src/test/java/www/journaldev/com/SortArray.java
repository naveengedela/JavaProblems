package www.journaldev.com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arrNum = {6, 5, 2, 1, 9, 10, 0};
        System.out.println(Arrays.toString(arrNum));
        sSort(arrNum);
        System.out.println(Arrays.toString(arrNum));
    }

    private static int[] sSort(int[] arrNum) {
        for (int i = 0; i < arrNum.length; i++) {
            int min = arrNum[i];
            int mIndex = i;

            for (int j = i + 1; j < arrNum.length; j++) {
                if (min > arrNum[j]) {
                    min = arrNum[j];
                    mIndex = j;
                }
            }

            int temp = arrNum[i];
            arrNum[i] = arrNum[mIndex];
            arrNum[mIndex] = temp;
        }
        return arrNum;
    }
}
