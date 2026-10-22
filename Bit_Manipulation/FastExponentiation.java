import java.util.*;

public class FastExponentiation {
    public static void fastExponentiation(int n,int p){
        int ans = 1;
        while(p > 0){
          if((p & 1) == 1){
              ans = ans * n;
            }
            n = n * n;
            p = p>>1;
        }
        System.out.printf("Fast Exponentiation:-  "+ans+"\n");
      
    }
    public static void main(String[] args){
      fastExponentiation(10,5);
      fastExponentiation(8,3);
    }
}