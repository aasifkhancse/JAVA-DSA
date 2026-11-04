import java.util.*;

public class QuickSort {
	public static int partition(int arr[],int s,int e) {
		int m = s+(e-s)/2;
		
		int a = arr[m];
        int b = arr[e];
        arr[m] = b;
        arr[e] = a;
		
		int privt = arr[m];
		int i = s-1;
		for(int j = s; j < e; j++) {
			if(arr[j] >= privt) {
				i++;
				a = arr[i];
				b = arr[j];
				arr[i] = b;
				arr[j] = a;
			}
		}
		i++;
		a = arr[i];
		b = arr[e];
		arr[e] = a;
		arr[i] = b;
        return i;

	}

	public static void quickSort(int arr[],int s,int e) {
		if(s >= e) {
			return;
		}

		int m = partition(arr,s,e);
		quickSort(arr,s,m+1);
		quickSort(arr,m+1,e);
	}
	public static void print(int arr[]){
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
	public static void main(String[] args) {
		int []arr = {1,0,2,9,3,8,4,7,4,6,5};
		quickSort(arr,0,arr.length-1);
		print(arr);
	}
}
