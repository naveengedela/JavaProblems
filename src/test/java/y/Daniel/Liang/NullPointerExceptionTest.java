package y.Daniel.Liang;

public class NullPointerExceptionTest {
    private String text;

    public NullPointerExceptionTest(String s) {
        String text = s;
    }

    // text declared in Line 4 is data field, but redeclared in Line 7 as local variable.
    // The local variable is assigned with the string passed to the constructor, but the data field is still null
    // In Line 15 nullPointerExceptionTest.text is null, which causes NULLPOINTEREXCEPTION when invoking the toLowerCase() method.
    public static void main(String[] args) {
        NullPointerExceptionTest nullPointerExceptionTest = new NullPointerExceptionTest("ABC");
        System.out.println(nullPointerExceptionTest.text.toLowerCase());
    }
}
