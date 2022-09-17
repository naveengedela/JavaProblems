package Top30;

import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(120));
    }

    private static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for (int i=1; i<=n;i++){
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;

    }
}
