import java.util.*;

public class MaxStoreWater {
	public static int storeWater(ArrayList<Integer> arr) {
		int n = arr.size();

		int maxArea = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int height = Math.min(arr.get(i),arr.get(j));
				int width = j - i;
				int area = height * width;
				maxArea = Math.max(area,maxArea);
			}
		}
		return maxArea;
	}
	public static int storeWaterTwoPointer(ArrayList<Integer> arr) {
		int j = arr.size() - 1;
		int i = 0;
		int maxArea = 0;
		while(i<j) {
			int height = Math.min(arr.get(i),arr.get(j));
			int width = j - i;
			int area = height * width;
			maxArea = Math.max(area,maxArea);
			if(arr.get(i) > arr.get(j)) {
				j--;
			}
			else {
				i++;
			}

		}
		return maxArea;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(10);
		arr.add(30);
		arr.add(40);
		arr.add(60);
		arr.add(20);
		arr.add(50);
		arr.add(80);
		arr.add(70);
		arr.add(90);

		System.out.println(storeWater(arr));
		System.out.println(storeWaterTwoPointer(arr));

	}
}