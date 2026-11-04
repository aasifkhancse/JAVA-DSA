import java.util.*;

public class MaxArea {

	public static int maxArea(int arr[]) {
		int n = arr.length;
		int []smallLeft = new int[n];

		Stack<Integer>sl = new Stack<>();
		for(int i=0; i<n; i++) {
			while(!sl.empty() && arr[sl.peek()] >= arr[i]) {
				sl.pop();
			}
			if(sl.empty()) {
				smallLeft[i] = -1;
			}
			else {
				smallLeft[i] = sl.peek();
			}

			sl.push(i);
		}


		int []smallRight = new int[n];

		Stack<Integer>sr = new Stack<>();
		for(int i=n-1; i>-1; i--) {
			while(!sr.empty() && arr[sr.peek()] >= arr[i]) {
				sr.pop();
			}
			if(sr.empty()) {
				smallRight[i] = n;
			}
			else {
				smallRight[i] = sr.peek();
			}

			sr.push(i);
		}

		print(smallLeft);
		print(smallRight);

		int max = 0;
		for(int i=0; i<n; i++) {
			int h = arr[i];
			int w = smallRight[i] - smallLeft[i] - 1;
			int ans =  h * w;
			max = Math.max(max,ans);
		}
		return max;


	}
	public static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int []arr = {9,8,1,7,5};

		System.out.println("Max Area : " + maxArea(arr));
	}
}