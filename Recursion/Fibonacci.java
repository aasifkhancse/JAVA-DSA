import java.util.*;

public class Fibonacci{
    static int fiboserice(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fiboserice(n-1) + fiboserice(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci Serice "+n+"th Term : "+fiboserice(n));
    }
}