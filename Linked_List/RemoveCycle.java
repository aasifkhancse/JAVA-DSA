import java.util.*;

public class RemoveCycle {

	//create Node
	public static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;

		}
	}
	public static Node head;
	public static Node tail;
	public static int size;

	public static boolean removeCycle() {
		Node slow = head;
		Node fast = head;

		boolean b = false;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				b = true;
				break;
			}

		}
		if(!b) {
			return false;
		}
		Node prev = null;
		slow = head;
		while(slow != fast) {
			prev = fast;
			slow = slow.next;
			fast = fast.next;
		}
		prev.next = null;
		return true;
	}

	public static void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		return;
	}

	//Main Function
	public static void main(String[] args) {

		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = head.next;

		System.out.println(removeCycle());
		print();

	}
}