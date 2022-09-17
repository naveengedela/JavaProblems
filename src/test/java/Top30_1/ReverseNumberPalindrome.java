package Top30_1;

public class ReverseNumberPalindrome {

	public static void main(String[] args) {
		int num = 16461;
		int num1 = 12345;
		System.out.println(isPalNum(num));
		System.out.println(isPalNum(num1));
	}

	private static boolean isPalNum(int num) {
		int copyOfNumber = num;
		int revNum = 0;
		
		while (num != 0) {
			revNum = (revNum * 10) + num % 10;
			num = num /10;
		}
		return copyOfNumber == revNum;
		
	}

}
