package Top30_1;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		int num = 143;
		System.out.println(countNumbers(num));
	}

	private static int countNumbers(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}
	
	

}
