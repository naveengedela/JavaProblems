package thirtyDaysOfCode;

public class ArmstrongNumber_1 {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(371));
    }

    private static String isArmstrongNumber(int num) {
        int result = num;
        int cube  = 0;
        int remainder;

        while (num > 0){
            remainder = num % 10;
            cube = cube + (remainder * remainder * remainder);
            num = num / 10;
        }

        if (result == cube){
            return "Armostrg";
        }
        else {
            return "no";
        }
    }
}
