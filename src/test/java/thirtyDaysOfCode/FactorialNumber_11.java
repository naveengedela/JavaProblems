package thirtyDaysOfCode;

public class FactorialNumber_11 {
    public static void main(String[] args) {
        System.out.println(factRecursion(5));
    }

    private static int factorialNumber(int num) {
        if (num == 0) {
            return 1;
        }
        if (num == 1) {
            return 1;
        }

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // with recursion
    private static int factRecursion(int num){
        if (num == 0)
            return 1;
        return num * factRecursion(num -1);
    }
}
