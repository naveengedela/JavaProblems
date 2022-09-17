package Top30_1;

public class ReverseANumber {

	public static void main(String[] args) {
		int a = 12345;
		System.out.println(reverseNum(a));
	}
	
	private static int reverseNum(int num) {
		int reverseNumber = 0;
		while (num != 0){
			reverseNumber  = (reverseNumber * 10) + num % 10;
			num = num / 10;
		}
		return reverseNumber;
	}

}
