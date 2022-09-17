package Top30_1;

public class LinearSearch {

	public static void main(String[] args) {
		int[] intArr = { 10, 20, 30, 40, 50 };
		int num = 35;

		linearSearch(intArr, num);
	}

	private static void linearSearch(int[] intArr, int num) {
		boolean isFound = false;
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == num) {
				System.out.println("Number is found " + num);
				isFound = true;
				break;
			}
		}

		if (!isFound) {
			System.out.println("Number is not found");
		}

	}

}
