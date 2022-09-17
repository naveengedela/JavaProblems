package codingProblems;

import java.util.Arrays;
import java.util.List;

public class CheckingOddNumbersInList {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 4, 6, 8, 10);

        System.out.println(isOddNumbers(intList));

    }

    private static boolean isOddNumbers(List<Integer> intList) {
        for(int number : intList){
            if (number % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
