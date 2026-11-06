import java.util.*;
public class StackUsingDeque {

	static class Stack {

		static Deque <Integer> q = new LinkedList<>();

		public void empty() {
			if(q.isEmpty()) {
				System.out.println("Stack Empty");
			}
		}

		public void push(int data) {
			q.addLast(data);
			return;
		}

		public void pop() {
			if(q.isEmpty()) {
				System.out.println("Stack Empty");
				return;
			}

			int top = q.removeLast();
			System.out.println("Remove Data : "+top);
		}

		public void peek() {
			if(q.isEmpty()) {
				System.out.println("Stack Empty");
				return;
			}
			int top = q.getLast();

			System.out.println("Peek Data : "+top);
		}


	}
	public static void main(String[] args) {
		Stack s = new Stack();
		s.empty();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.peek();
		s.pop();
		s.pop();
		s.pop();
	}
}