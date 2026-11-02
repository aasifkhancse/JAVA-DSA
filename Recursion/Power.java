import java.util.*;

public class Power {
    static int power(int n,int i){
        if(i == 0){
            return 1;
        }
        if(i%2==0){
           return power(n,i/2) * power(n,i/2);
        }
        else{
            return n * power(n,i/2) * power(n,i/2);
        }
    }
    public static void main(String[] args) {
        int n = 9;
        int i = 3;
        System.out.println("Power "+n+" ^ "+i+" : "+power(n,i));
    }
}