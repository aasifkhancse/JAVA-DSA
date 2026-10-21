import java.util.*;

public class BinarySerach {
    public static int binarySerach(int arr[]){
        int s = 0;
        int e = arr.length;
        int f = 9;
        while(s<=e){
            int m = (s+e)/2;
            if(arr[m] == f){
                return m;
            }
            if(arr[m] < f){
                s = m;
            }
            else{
                e = m;
            }
        }
        return -1;
    }
        
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int ans = binarySerach(arr);
        System.out.print("Ans :-  "+ ans);
    }
}