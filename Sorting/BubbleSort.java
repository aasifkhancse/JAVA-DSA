import java.util.*;

public class BubbleSort{
    static void bubbleSortAscendingOrder(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int a = arr[j];
                    int b = arr[j+1];
                    arr[j] = b;
                    arr[j+1] = a;
                }
            }
        }
    }
    
    static void bubbleSortDescendingOrder(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] < arr[j+1]){
                    int a = arr[j];
                    int b = arr[j+1];
                    arr[j] = b;
                    arr[j+1] = a;
                }
            }
        }
    }
    
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int []arr = {1,5,3,2,8,9,6,7,4,0};
        //bubbleSortAscendingOrder(arr);
       // print(arr);
        bubbleSortDescendingOrder(arr);
        print(arr);
    }
}