import java.util.*;

public class LargestInt {
    public static int largestInt(int arr[]){
        int a = arr[0];
        for(int i=1;i<arr.length;i++){
            if(a < arr[i]){
                a = arr[i];
            }
        }
        return a;
    }
        
    public static void main(String[] args){
        int[] arr = {1,2,3,4,55,6,7,8,9,0};
        int ans = largestInt(arr);
        System.out.print("Ans :-  "+ ans);
    }
}