package Top30_1;

public class CountSumOfDigits {

	public static void main(String[] args) {
		int num = 12345; // 15
		System.out.println(sum(num));
	}

	private static int sum(int num) {
		int sum = 0;
		
		while (num != 0) {
			int rem = num % 10;
			sum += rem;
			num = num /10;
		}
		return sum;
	}

}
