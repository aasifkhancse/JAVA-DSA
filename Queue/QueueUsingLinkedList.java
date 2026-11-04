import java.util.*;
public class QueueUsingLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	static class Queue {

		static Node head;
		static Node tail;

		public boolean empty() {
			return head == null && tail == null;
		}


		public void add(int data) {
			Node temp = new Node(data);
			if(head == null) {
				head = tail = temp;
				return;
			}
			tail.next = temp;
			tail = temp;
		}

		public void remove() {
			if(empty()) {
				System.out.print("Queue Is Empty");
				return;
			}

			int data = head.data;

			if(head.next == null) {
				head = tail = null;
			}
			else {
				head = head.next;
			}
			System.out.println("Remove Data : "+data);
		}

		public void peek() {
			if(empty()) {
				System.out.println("Empty");
				return;
			}
			System.out.println("Peek Data : "+ head.data);
		}


	}
	public static void main(String[] args) {
		Queue cq = new Queue();
		System.out.print(cq.empty());
		System.out.println();
		cq.add(00);
		cq.add(10);
		cq.add(20);
		cq.add(30);
		cq.add(40);
		cq.add(50);
		cq.add(60);
		cq.add(70);
		cq.add(80);
		cq.add(90);
		cq.add(100);
		cq.add(110);
		cq.peek();
		cq.remove();
		cq.remove();
	}
}