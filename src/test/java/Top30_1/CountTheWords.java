package Top30_1;

public class CountTheWords {

	public static void main(String[] args) {
		String str = "Welcome to selenium";
		countTheWords(str);
	}

	private static void countTheWords(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
				count++;
			}
		}
		System.out.println("Number of words in string " + count);
	}

}
