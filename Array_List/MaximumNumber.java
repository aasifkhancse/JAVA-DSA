import java.util.*;

public class MaximumNumber{
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int max = arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(max < arr.get(i)){
                max = arr.get(i);
            }
        }
        System.out.println(max);
    }
}