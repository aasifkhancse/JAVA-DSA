import java.util.*;

public class SubSetString {

	public static void subSet(String str, String arr,int i) {
		if(i == str.length()) {
		     if(arr.length() == 0){
			   System.out.println("null");
		     }
		     else{
		          System.out.println(arr);
		     }
		     return;
		}
		
		subSet(str,arr+str.charAt(i),i+1);
		subSet(str,arr,i+1);
	}

	public static void main(String[] args) {
		subSet("abc","",0);
	}
}