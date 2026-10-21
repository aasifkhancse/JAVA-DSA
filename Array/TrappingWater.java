import java.util.*;

public class TrappingWater{
    public static void trapingWater(int arr[]){
        int n = arr.length;
        
        //left
        int left[] = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(arr[i],arr[i-1]);
        }
                
        //right
        int right[] = new int[n];
        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(arr[i+1],arr[i]);
        }
        
        //Trapping Water
        int trappwater = 0;
        for(int i=0;i<n;i++){
            int level = Math.min(left[i],right[i]);
            trappwater += level - arr[i];
        }
        System.out.println(trappwater);
    }
    public static void main(String[] args) {
        int []arr = {6,5,7,4,8,0,9};
        trapingWater(arr);
    }
}