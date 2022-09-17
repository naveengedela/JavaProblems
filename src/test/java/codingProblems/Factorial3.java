package codingProblems;

import java.util.*;
import java.math.BigInteger;

public class Factorial3 {
    protected static ArrayList table = new ArrayList(); // create cache

    static { // Initialize the first element of the cache with !0 = 1.
        table.add(BigInteger.valueOf(1));
    }

    public static synchronized BigInteger factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("x must be >= 0");
        for (int size = table.size(); size <= x; size++) {
            BigInteger lastFact = (BigInteger) table.get(size - 1);
            BigInteger nextFact = lastFact.multiply(BigInteger.valueOf(size));
            table.add(nextFact);
        }
        return (BigInteger) table.get(x);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "! =" + factorial(i));
        }
    }
}
