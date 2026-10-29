import java.util.*;

public class ValidParentheses {

	public static boolean valid(String str) {

		Stack<Character> st = new Stack<>();

		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			}
			else {
				if(st.empty()) {
					return false;
				}
				if ((ch == ')' && st.peek() == '(')
				        || (ch == '}' && st.peek() == '{')
				        || (ch == ']' && st.peek() == '[')) {
					st.pop();
				}
				else {
					return false;
				}
			}
		}
		if(st.empty()) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		String str = "[{()}]";
		System.out.println(valid(str));
	}
}