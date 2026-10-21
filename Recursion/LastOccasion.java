import java.util.*;

public class LastOccasion {
    static int lastOccasion(int arr[],int i,int key){
        if(i == -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccasion(arr,i-1,key);
    }
    public static void main(String[] args) {
        int []arr = {0,1,2,3,4,5,6,7,6};
        System.out.println("Last Occasion Index : "+lastOccasion(arr,arr.length-1,6));
    }
}