package Top30_1;

public class PrintEvenAndOddFromArrayNeedToCheck {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		evenAndOddFromArray(intArr);
	}

	private static void evenAndOddFromArray(int[] intArr) {

		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] % 2 == 0) {
				System.out.println(intArr[i]);
			}
		}

		System.out.println();
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] % 2 != 0) {
				System.out.println(intArr[i]);
			}
		}

	}

}
