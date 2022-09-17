package Top30_1;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str = "Java is my world";
		System.out.println(reverseWords(str));
	}

	private static String reverseStr(String str) {
		String[] words = str.split(" ");

		StringBuffer reversedString = new StringBuffer();

		for (String word : words) {
			StringBuffer reversedWord = new StringBuffer();

			for (int i = word.length() - 1; i >= 0; i--) {
				reversedWord.append(word.charAt(i));
			}
			reversedString.append(reversedWord + " ");
		}
		return reversedString.toString();
	}
	
	public static String reverseWords(String str) {

		 String[] words = str.split(" ");
		 StringBuilder reversedString = new StringBuilder();

		 for (String word: words) {
		   StringBuilder reverseWord = new StringBuilder();

		   for (int i = word.length() - 1; i >= 0; i--) {
		     reverseWord.append(word.charAt(i));
		   }

		   reversedString.append(reverseWord).append(" ");
		 }

		 return reversedString.toString();
		}

}
