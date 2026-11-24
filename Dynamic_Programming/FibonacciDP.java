import java.util.*;
public class FibonacciDP {

	public static int fibMemorization(int n,int arr[]) {
		if(n == 0 || n==1) {
			return n;
		}

		if(arr[n] != 0) {
			return arr[n];
		}

		arr[n] = fibMemorization(n-1,arr)+fibMemorization(n-2,arr);
		return arr[n];
	}

	public static int fibTabulation(int n) {
		int []arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}
	public static void main(String[] args) {
		int n = 5;
		int []arr = new int[n+1];
		System.out.println(fibMemorization(n,arr));
		System.out.println(fibTabulation(n));
	}
}