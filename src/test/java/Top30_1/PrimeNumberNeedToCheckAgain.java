package Top30_1;

// Natual number > 1
// Which has only 2 factors 1 and itself

// 19 > 1 and 19 >> prime number
// 28 > 1 ,2, 4 , 7, 14 , 29 > Not a prime number
public class PrimeNumberNeedToCheckAgain {

	public static void main(String[] args) {
		int num = 28;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println("Prime number");
			} else {
				System.out.println("Not a prime number");
			}
		}
		else {
			System.out.println("Not a prime number");
		}


	}

}
