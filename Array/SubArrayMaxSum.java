import java.util.*;

public class SubArrayMaxSum {
    public static void subArray(int arr[]){
        int curr = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int ans = 0;
                for(int k=i;k<=j;k++){
                    ans += arr[k];
                }
                if (curr < ans){
                    curr = ans;
                }
            }
        }
        System.out.println(curr);
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        subArray(arr);
    }
}