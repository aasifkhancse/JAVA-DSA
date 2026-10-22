import java.util.*;

public class PowerOfTwo {
    public static void powerOfTwo(int n){
      int mask = n-1;
      if((mask & n) == 0){
          System.out.printf("Yes\n");
      }
      else{
          System.out.println("No\n");
      }
    }
    public static void main(String[] args){
      powerOfTwo(10);
      powerOfTwo(8);
    }
}