import java.util.*;

public class FirstOccasion {
    static int firstOccasion(int arr[],int i,int key){
        if(i == arr.length - 1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccasion(arr,i+1,key);
    }
    public static void main(String[] args) {
        int []arr = {0,1,2,3,4,5,6,7};
        System.out.println("First Occasion Index : "+firstOccasion(arr,0,6));
    }
}