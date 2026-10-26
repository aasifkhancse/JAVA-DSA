import java.util.*;

public class StairsProblem {
     
	public static void main(String[] args) {
		int[][] arr = {
			{11,12,13,14,15},
			{21,22,23,24,25},
			{31,32,33,34,35},
			{41,42,43,44,45},
			{51,52,53,54,55}
		};
		int r = 0;
		int c = arr.length-1;
		int key = 55;
		boolean f = true;

		while(r < arr.length && c < arr[0]. length) {
			if(arr[r][c] == key) {
				f = false;
				System.out.println("Found : "+r+" "+c);
				return;
			}

			if(key < arr[r][c]) {
				c++;
			}
			else {
				r++;
			}
		}
		if(f) {
			System.out.println("Not Found ");
		}

	}
}
