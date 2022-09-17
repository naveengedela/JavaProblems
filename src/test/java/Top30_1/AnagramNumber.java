package Top30_1;

public class AnagramNumber {

	public static void main(String[] args) {
		int num = 153;
		System.out.println(anrmstrongNum(num));
	}

	private static String anrmstrongNum(int num) {
		int rem = 0;
		int temp = num;
		int cube = 0;
		while (num != 0) {
			rem = num % 10;
			cube += rem * rem * rem;
			num = num / 10;
		}
		if (temp == cube) {
			return "Armostong number";
		} else {
			return "Not an Armostong number";
		}

	}

}
