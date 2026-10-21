import java.util.*;

public class InsertionSort{
    static void insertionSortAscendingOrder(int arr[]) {
        int n = arr.length;
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    
    static void insertionSortDescendingOrder(int arr[]) {
        int n = arr.length;
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev <= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    
    static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int []arr = {9,8,5,7,6,4,2,3,1,0};
        //insertionSortAscendingOrder(arr);
        insertionSortDescendingOrder(arr);
        print(arr);
    }
}