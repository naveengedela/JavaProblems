package Top30_1;

public class CountCharOccurance {

	public static void main(String[] args) {
		String str = "Welcome to selenium";
		countTheCharOccurence(str);
	}

	private static void countTheCharOccurence(String str) {
		int total_count = str.length();
		int after_remove_count = str.replaceAll("e", "").length();
		System.out.println(total_count-after_remove_count);
	}

}
