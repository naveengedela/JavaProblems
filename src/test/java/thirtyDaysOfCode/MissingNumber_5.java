package thirtyDaysOfCode;

public class MissingNumber_5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};

        int original = 0;
        for (int i = 0; i < arr.length; i++) {
            original += arr[i];
        }
        int sum = 0;
        for (int i = 0; i <= arr.length+1; i++) {
            sum  += i;
        }

        System.out.println("Missing number is :: " + (sum - original));
    }
}
