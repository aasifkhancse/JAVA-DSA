import java.util.*;

public class StringCompression {
    public static String stringCompression(String str) {
        String arr = "";
        for(int i=0;i<str.length();i++){
            Integer cnt = 0;
            
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                cnt++;
                i++;
            }
            arr += str.charAt(i);
            if(cnt > 0){
                arr += cnt.toString();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
      System.out.println(stringCompression("abbcccddddeeeee"));
    }
}