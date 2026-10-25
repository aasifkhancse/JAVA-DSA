import java.util.*;

public class StackWithArrayList{

	static class Stack{
		ArrayList<Integer>list = new ArrayList<>();
		
		public boolean empty(){
		     return list.size()==0;
		}
		
		public void push(int data){
		     list.add(data);
		}
		
		public void pop(){
		     int top = list.get(list.size()-1);
		     list.remove(list.size()-1);
		     System.out.println(top);
		}
		
		public void peek(){
		     System.out.println(list.get(list.size()-1));
		}
	}

	public static void main(String[] args) {
	     Stack st = new Stack();
	     st.push(10);
	     st.push(20);
	     st.push(30);
	     st.push(40);
	     st.push(50);
	     
	     while(!st.empty()){
	          st.peek();
	          st.pop();
	     }
	     
	}
}