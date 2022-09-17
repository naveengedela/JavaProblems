package thirtyDaysOfCode;

public class SwapTwoNumbersWithoutThirdVar_9 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // without third variable
//        b = b - a; // 10
//        a = a + b;
//        System.out.println("a value :: " + a + " b value ::"+ b);


        // with third var
//        int temp = a;
//        a = b;
//        b = temp; // 10

        System.out.println("a value :: " + a + " b value ::"+ b);


        // using xor ^ operator

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a value :: " + a + " b value ::"+ b);

    }
}
