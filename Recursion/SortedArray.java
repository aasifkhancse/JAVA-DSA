import java.util.*;

public class SortedArray{
    static boolean sortedArray(int arr[],int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sortedArray(arr,i+1);
    }
    public static void main(String[] args) {
        int []arr = {0,1,2,3,4,5,6,7};
        System.out.println("Fibonacci Serice "+sortedArray(arr,0));
    }
}