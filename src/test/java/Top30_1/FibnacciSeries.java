package Top30_1;

public class FibnacciSeries {
	private static long[] fibonacciCache;

	public static void main(String[] args) {
		int num = 50;
		fibonacciCache = new long[num + 1];
		System.out.println(fibonacciSeries(num));
	}

	private static long fibonacciSeries(int num) {
		if (num <= 1)
			return num;

		if (fibonacciCache[num] != 0) {
			return fibonacciCache[num];
		}
		long nthFibnacciSeries = fibonacciSeries(num - 1) + fibonacciSeries(num - 2);
		fibonacciCache[num] = nthFibnacciSeries;
		return nthFibnacciSeries;

	}

}
