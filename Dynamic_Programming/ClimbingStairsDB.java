import java.util.*;
public class ClimbingStairsDB {

	public static int countWays(int n) {
		if(n == 0) {
			return 1;
		}
		if(n < 0) {
			return 0;
		}

		return countWays(n-1)+countWays(n-2);
	}

	public static int countWaysMemorization(int n,int arr[]) {
		if(n == 0) {
			return 1;
		}
		if(n <0 ) {
			return 0;
		}

		if(arr[n] != -1) {
			return arr[n];
		}

		arr[n] = countWaysMemorization(n-1,arr)+countWaysMemorization(n-2,arr);
		return arr[n];
	}

	public static int countWaysTabulation(int n) {
		int []arr = new int[n+1];
		arr[0] = 1;
		if(n >= 1) {
			arr[1] = 1;
		}
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}
	public static void main(String[] args) {
		int n = 6;
		int []arr = new int[n+1];
		Arrays.fill(arr,-1);
		System.out.println(countWays(n));
		System.out.println(countWaysMemorization(n,arr));
		System.out.println(countWaysTabulation(n));
	}
}