package Top30_1;

public class MissingNumber {

	public static void main(String[] args) {
		int[] intArr = {1,2,3, 5, 6,7, 8, 9, 10};
		missingNum(intArr);
		
	}

	private static int missingNum(int[] intArr) {
		int actualSum = 0;
		int sum = 0;
		
		for (int i = 0; i < intArr.length; i++) {
			actualSum += intArr[i];
		}
		
		for (int i = 0; i <= intArr.length+1; i++) {
			sum += i;
		}
		
		System.out.println("Actual "+ actualSum + " " + "Sum of " + sum);
		
		System.out.println("Missing number " + (sum -actualSum));
		return actualSum;
	}

}
