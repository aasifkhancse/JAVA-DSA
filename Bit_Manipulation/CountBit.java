import java.util.*;

public class CountBit {
    public static void countBit(int n){
        int cnt = 0;
        while(n != 0){
          if((n & 1) == 1){
              cnt ++;
            }
            n = n>>1;
        }
        System.out.printf("Count:-  "+cnt+"\n");
      
    }
    public static void main(String[] args){
      countBit(10);
      countBit(8);
    }
}