import java.util.*;

public class BinomialCoefficient {

	static int factorial(int n) {
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		return fact;
	}

	static int binomialCoefficient(int n, int r) {
		if (r < 0 || r > n) {
			return 0;
		}

		return factorial(n) /
		       (factorial(r) * factorial(n - r));
	}

	public static void main(String[] args) {
		int n = 5;
		int r = 2;

		System.out.println("Binomial Coefficient = " + binomialCoefficient(n, r));
	}
}
