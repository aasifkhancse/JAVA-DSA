import java.util.*;

public class ReverseStack{
     

	public static void pushBottem(Stack<Integer>st,int data){
	     if(st.empty()){
	          st.push(data);
	          return;
	     }
	     int top = st.pop();
	     pushBottem(st,data);
	     st.push(top);
	     
	}
	
	public static void reverseStack(Stack<Integer>st){
          if(st.empty()){
               return;
          }
          int top = st.pop();
          reverseStack(st);
          pushBottem(st,top);
          
     }

	public static void main(String[] args) {
		Stack<Integer>st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		reverseStack(st);
		while(!st.empty()){
		     System.out.println(st.pop());
		}
		

	}
}