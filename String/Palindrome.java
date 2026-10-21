import java.util.*;

public class Palindrome{
    public static String palindrome() {
        String pal = "abcdcba";
        int i=0;
        int j=pal.length() -1;
        while(i<=j){
            if(pal.charAt(i) != pal.charAt(j)){
                return "Not Palindrome";
            }
            i++;
            j--;
        }
        return "Palindrome";
    }
    public static void main(String[] args) {
        System.out.println(palindrome());
    }
}