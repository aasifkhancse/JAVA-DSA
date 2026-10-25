import java.util.*;

public class StackWithLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static class Stack {
		Node head = null;

		public boolean empty() {
			return head == null;
		}

		public void push(int data) {

			Node temp = new Node(data);
			if(head == null) {
				head = temp;
				return;
			}
			temp.next = head;
			head = temp;
		}

		public void pop() {
			if(empty()) {
				System.out.println("Empty");
				return;
			}
			int top = head.data;
			head = head.next;
			System.out.println(top);
		}

		public void peek() {
			if(empty()) {
				System.out.println("Empty");
				return;
			}
			System.out.println(head.data);
			return;
		}
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.peek();

		while(!st.empty()) {
			st.peek();
			st.pop();
		}

	}
}