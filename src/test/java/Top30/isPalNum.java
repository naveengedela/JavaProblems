package Top30;

public class isPalNum {
    public static void main(String[] args) {
        System.out.println(isPalNu(400));
    }

    private static boolean isPalNu(int num) {
        int copyOfNumber = num;
        int reverseNumber = 0;

        while (num > 0){
            reverseNumber = (reverseNumber * 10) + num % 10;
            num = num / 10;
        }

        return reverseNumber == copyOfNumber;
    }
}
