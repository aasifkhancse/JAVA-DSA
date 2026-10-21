import java.util.*;

public class SelectionSort{
    static void selectionSortAscendingOrder(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int m = i;
            for(int j=i+1;j<n;j++){
                if(arr[m] > arr[j]){
                    m = j;
                }
            }
            int a = arr[m];
            int b = arr[i];
            arr[m] = b;
            arr[i] = a;
        }
    }
    
    static void selectionSortDescendingOrder(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int m = i;
            for(int j=i+1;j<n;j++){
                if(arr[m] < arr[j]){
                    m = j;
                }
            }
            int a = arr[m];
            int b = arr[i];
            arr[m] = b;
            arr[i] = a;
        }
    }
    
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int []arr = {1,5,3,2,8,9,6,7,4,0};
        //selectionSortAscendingOrder(arr);
       // print(arr);
        selectionSortDescendingOrder(arr);
        print(arr);
    }
}