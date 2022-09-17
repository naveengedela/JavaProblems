package Top30_1;

public class NumberOfEvenAndOdd_NeedToCheckAgain {

	public static void main(String[] args) {
		int num = 145678;
		countEvenAndOdd(num);
	}

	private static void countEvenAndOdd(int num) {
		int countEven = 0;
		int countOdd = 0;
		
		while (num != 0) {
			int rem =  num % 10;
			if (rem % 2 == 0) {
				countEven++;
			}
			else {
				countOdd++;
			}
			num = num / 10;
		}
		
		System.out.println("Even count " + countEven + " " + "Odd count " + countOdd);
	}

}
