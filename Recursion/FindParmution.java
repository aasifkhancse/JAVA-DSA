import java.util.*;

public class FindParmution{

	public static void permutation(String str, String arr) {
		
		if(0 == str.length()) {
			System.out.println(arr);
			return;
		}
		for(int j=0;j<str.length();j++){
		     char s = str.charAt(j);
		     String newStr = str.substring(0,j)+str.substring(j+1);
		     permutation(newStr,arr+s);
		}
	}

	public static void main(String[] args) {
		permutation("abc","");
	}
}