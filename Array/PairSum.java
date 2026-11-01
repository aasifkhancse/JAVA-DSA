import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        
        int i = 0;
        int j = arr.size() - 1;
        int t = 11;
        
        boolean found = true;
        while(i < j){
            
            int x = arr.get(i);
            int y = arr.get(j);
            
            if(x+y == t){
                System.out.println("Found");
                found = false;
                break;
            }
            else if((x+y) < t){
                i++;
            }
            else{
                j--;
            }
        }
        if (found) {
            System.out.println("Not Found");
        }
    }
}