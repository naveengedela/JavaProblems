package Top30_1;

import java.util.Arrays;

public class CheckingEqualityOfArraysNeeds {

	public static void main(String[] args) {
		int[] intArr1 = { 1, 2, 3, 4, 5 };
		int[] intArr2 = { 1, 2, 3, 4, 5 };
		System.out.println(isEqual(intArr1, intArr2));
		System.out.println(isEqualWithInbuild(intArr1, intArr2));

	}

	private static boolean isEqual(int[] intArr1, int[] intArr2) {

		for (int i = 0; i < intArr1.length; i++) {
			if (intArr1[i] != intArr2[i]) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isEqualWithInbuild(int[] intArr1, int[] intArr2) {
		return  Arrays.equals(intArr1, intArr2);
	}

}
