import java.util.*;

public class DuplicateParentheses {

	public static boolean valid(String str) {

		Stack<Character> st = new Stack<>();

		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);

			if(ch == ')') {
				int cnt = 0;
				while(!st.empty() && st.peek() != '(') {
					cnt++;
					st.pop();
				}
				if(st.empty()) {
					return false;
				}
				if(cnt == 0) {
					return true;
				}
					st.pop();
			}
			else {
				st.push(ch);
			}

		}
		for (char ch : st) {
			if (ch == '(') {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "(1(2(3))))";
		System.out.println(valid(str));
	}
}