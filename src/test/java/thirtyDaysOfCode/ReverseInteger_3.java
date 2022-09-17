package thirtyDaysOfCode;

public class ReverseInteger_3 {
    public static void main(String[] args) {

        int num = 123456;
        int result = 0;

        while (num > 0){
            result = result * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse number :: "+ result);



        // String Buffer
        int num1 = 123456;
        System.out.println("Reverse number :: " + new StringBuffer(String.valueOf(num1)).reverse());
    }
}
