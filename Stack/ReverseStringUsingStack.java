import java.util.*;

public class ReverseStringUsingStack{
     public static String reverseString(String str){
          Stack<Character> s = new Stack<>();
          
          StringBuilder ch = new StringBuilder("");
          
          for(int i=0;i<str.length();i++){
               s.push(str.charAt(i));
          }
          while(!s.empty()){
               char a = s.pop();
               ch.append(a);
          }
          return ch.toString();
     }
	public static void main(String[] args) {
		System.out.println(reverseString("abcde"));
	}
}