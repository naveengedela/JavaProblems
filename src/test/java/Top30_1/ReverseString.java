package Top30_1;

public class ReverseString {

	public static void main(String[] args) {
		String str = "DocuSign";
		System.out.println(reverseStr(str));
	}

	// 1st way
	private static String reverseStr(String str) {
		String revStr = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			revStr += str.charAt(i);
		}
		
		return revStr;
	}
	
	

}
