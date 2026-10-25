import java.util.*;

public class LinearSerach2D {
    static boolean search(int arr[][],int key){
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(key == arr[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]arr = {
            {0,1,2,3},
            {4,5,6,7},
            {8,9,10,11}
        };
        System.out.println(search(arr,99));
    }
}