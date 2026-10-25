import java.util.*;

public class PushBottem {

	public static void pushBottem(Stack<Integer>st,int data){
	     if(st.empty()){
	          st.push(data);
	          return;
	     }
	     int top = st.pop();
	     pushBottem(st,data);
	     st.push(top);
	     
	}

	public static void main(String[] args) {
		Stack<Integer>st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		pushBottem(st,100);
		while(!st.empty()){
		     System.out.println(st.pop());
		}
		

	}
}