package thirtyDaysOfCode;

public class NullArgument_16 {
    public static void main(String[] args) {
        test(0.0);
    }

    public static void test(int s){
        System.out.println("String argument");
    }

    public static void test(Object o){
        System.out.println("Object argument");
    }
}
