
import java.util.*;

public class MargeSort {

    static void margeAscendingOrder(int arr[], int s, int m, int e) {
        int temp[] = new int[e - s + 1];

        int i = s;
        int j = m + 1;
        int k = 0;

        // Compare left and right halves
        while (i <= m && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining left elements
        while (i <= m) {
            temp[k++] = arr[i++];
        }

        // Copy remaining right elements
        while (j <= e) {
            temp[k++] = arr[j++];
        }

        // Copy temp into the original array
        for (i = s, j = 0; i <= e; i++, j++) {
            arr[i] = temp[j];
        }
    }

    static void margeSort(int arr[], int s, int e) {

        // Base case
        if (s >= e) {
            return;
        }

        int m = s + (e - s) / 2;

        // Divide into two halves
        margeSort(arr, s, m);
        margeSort(arr, m + 1, e);

        // Merge both sorted halves
        //margeAscendingOrder(arr, s, m, e);
        margeDescendingOrder(arr,s,m,e);
    }
    
    static void margeDescendingOrder(int arr[], int s, int m, int e) {
        int temp[] = new int[e - s + 1];

        int i = s;
        int j = m + 1;
        int k = 0;

        // Compare left and right halves
        while (i <= m && j <= e) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining left elements
        while (i <= m) {
            temp[k++] = arr[i++];
        }

        // Copy remaining right elements
        while (j <= e) {
            temp[k++] = arr[j++];
        }

        // Copy temp into the original array
        for (i = s, j = 0; i <= e; i++, j++) {
            arr[i] = temp[j];
        }
    }
    

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {9, 5, 8, 3, 7, 2, 0, 11};

        margeSort(arr, 0, arr.length - 1);

        print(arr);
    }
}
