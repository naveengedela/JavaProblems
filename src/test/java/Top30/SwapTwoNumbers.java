package Top30;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a = a + b; // 25;
        b = a - b;
        a = a - b;

        System.out.println("a is ::" + a + " " + "b is ::" + b);
    }
}
