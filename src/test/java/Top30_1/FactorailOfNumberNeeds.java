package Top30_1;

public class FactorailOfNumberNeeds {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(factorial(num));
		System.out.println(factorail1(num));
	}

	private static int factorial(int num) {
		if (num <= 1)
			return num;
		return num * factorial(num - 1);
	}

	private static long factorail1(int num) {
		long factorail = 1;

		for (int i = 1; i <= num; i++) {
			factorail *= i;
		}

		return factorail;
	}

}
