import java.util.*;

public class MinimumNumber{
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int min = arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(min > arr.get(i)){
                min = arr.get(i);
            }
        }
        System.out.println(min);
    }
}