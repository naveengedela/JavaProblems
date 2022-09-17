package Top30;

public class isPal {
    public static void main(String[] args) {
        System.out.println(isPal("anna"));
    }

    private static boolean isPal(String str) {
        int left = 0;
        int right = str.length()-1;

        while (left > right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
