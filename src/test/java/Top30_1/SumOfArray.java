package Top30_1;

public class SumOfArray {

	public static void main(String[] args) {
		int[] inArr = {1, 2, 3, 4, 5}; // 15
		System.out.println(sumOfArr(inArr));
	}

	private static int sumOfArr(int[] inArr) {
		int sum = 0;
		for (int i = 0; i < inArr.length; i++) {
			sum += inArr[i];
		}
		
		return sum;
	}

}
