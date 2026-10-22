import java.util.*;

public class EvenAndOdd {
    public static void evenAndOdd(int n){
      int mask = 1;
      if((n&mask) == 0){
          System.out.printf("Even Number\n");
      }
      else{
          System.out.println("Odd Number\n");
      }
    }
    public static void main(String[] args){
      evenAndOdd(10);
      evenAndOdd(11);
    }
}