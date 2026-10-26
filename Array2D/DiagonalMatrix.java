import java.util.*;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {11,12,13,14,15},
            {21,22,23,24,25},
            {31,32,33,34,35},
            {41,42,43,44,45},
            {51,52,53,54,55}
        };
        int sum = 0;
        for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[0].length;j++){
                  if(i==j){
                       sum += arr[i][j];
                       //System.out.println(arr[i][j]);
                  }
                  if(i+j == arr.length-1 && i==j){
                       continue;
                  }
                  if(i+j == arr.length-1){
                       sum += arr[i][j];
                       //System.out.println(arr[i][j]);
                  }
             }
        }
        System.out.println(sum);
        
    }
}
