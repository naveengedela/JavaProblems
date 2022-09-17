package Top30_1;

public class MaxAndMin {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		maxElement(intArr);
	}

	private static void maxElement(int[] intArr) {
		int max = intArr[0];

		for (int i = 0; i < intArr.length; i++) {
			if (max < intArr[i]) {
				max = intArr[i];
			}
		}

		System.out.println(max);

		int min = intArr[0];
		for (int i = 0; i < intArr.length; i++) {
			if (min > intArr[i]) {
				min = intArr[i];
			}
		}
		System.out.println(min);
	}

}
