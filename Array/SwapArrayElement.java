import java.util.*;

public class SwapArrayElement{
    static void swap(ArrayList<Integer>arr,int i,int j){
        int a = arr.get(i);
        int b = arr.get(j);
        arr.set(i,b);
        arr.set(j,a);
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int i = 3;
        int j = 4;
        swap(arr,i,j);
        
        System.out.println(arr);
    }
}