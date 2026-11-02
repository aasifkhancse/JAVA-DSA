import java.util.*;

public class Power {
    static int power(int n,int i){
        if(i == 0){
            return 1;
        }
        return n * power(n,i-1);
    }
    public static void main(String[] args) {
        int n = 1;
        int i = 10;
        System.out.println("Power "+n+" ^ "+i+" : "+power(n,i));
    }
}