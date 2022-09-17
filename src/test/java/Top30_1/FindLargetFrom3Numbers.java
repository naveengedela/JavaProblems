package Top30_1;

public class FindLargetFrom3Numbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 14;
		int c = 20;
		
		if (a > b && a > c) {
			System.out.println(a + " is larget number");
		}
		else if (b > c && b > a) {
			System.out.println(b + " is larget number");
		}
		else if (c > a && c > b) {
			System.out.println(c + " is larget number");
		}
	}

}
