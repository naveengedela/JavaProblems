package Top30_1;

public class PalindromeStr {

	public static void main(String[] args) {
		String str = "madam";
		isPalStr(str);
	}

	private static void isPalStr(String str) {
		String copyOfStr = str;
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}

		if (copyOfStr.equals(revStr)) {
			System.out.println(str + " is palindome string");
		}
		else {
			System.out.println(str + " is not a palindome string");
		}
	}

}
