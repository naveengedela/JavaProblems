package www.journaldev.com;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println("Before Swp a = " + a + " b = " + b);
        b = a + b; //25
        a = b - a; // 25 - 10 ==> 15
        b = b -a;

        System.out.println("After Swap a = " + a + " b = " + b);

    }
}
