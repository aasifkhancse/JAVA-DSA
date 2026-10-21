import java.util.*;

public class PrintNumber {
    static void print(int n){
        if(n==0){
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        print(10);
    }
}