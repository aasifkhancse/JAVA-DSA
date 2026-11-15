import java.util.*;

public class DoubleLinkedListMathed {

	//create Node
	public static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;

		}
	}

	public static Node head;
	public static Node tail;
	public static int size;

	// add head
	public void addHead(int data) {
		size++;
		Node temp = new Node(data);
		if(head == null) {
			head = tail = temp;
			return;
		}
		temp.next = head;
		head.prev = temp;
		head = temp;
	}

	// remove Head
	public void removeHead() {
		if(size == 0) {
			System.out.println("Linked List Empty");
			return;
		}
		else if(size == 1) {
			System.out.println("Remove Data : " + head.data);
			size = 0;
			head = tail = null;
			return;
		}
		System.out.println(head.data);

		head = head.next;
		head.prev = null;
		size--;
		return;
	}


	// add middle
	public void addMiddle(int data,int k) {
		if (k < 0) {
			System.out.println("Invalid index");
			return;
		}

		if(k == 0) {
			addHead(data);
			return;
		}

		Node mid = new Node(data);
		Node temp = head;
		int i = 0;

		while(i < k-1 && temp != null) {
			temp = temp.next;
			i++;
		}

		if(temp == null) {
			addTail(data);
			return;
		}
		mid.next = temp.next;
		temp.next = mid;

		size++;

		if (mid.next == null) {
			tail = mid;
		}

	}

	//add tail
	public void addTail(int data) {
		size++;
		Node temp = new Node(data);
		if(head == null) {
			head = tail = temp;
			return;
		}
		tail.next = temp;
		tail = temp;
	}

	//remove Tail
	public void removeTail() {
		if(size == 0) {
			System.out.println("Linked List Empty");
			return;
		}
		else if(size == 1) {
			System.out.println("Remove Data : " + head.data);
			size = 0;
			head = tail = null;
			return;
		}
		Node prev = head;
		while(prev.next.next != null) {
			prev = prev.next;
		}
		System.out.println("Remove Data : " + tail.data);
		size--;
		prev.next = null;
		tail = prev;
	}

	// search linked List
	public void linearSearch(int key) {
		Node temp = head;
		int i=1;
		while(temp != null) {
			if(temp.data == key) {
				System.out.println("Value Found This Position : " + i);
				return;
			}
			temp = temp.next;
			i++;
		}
		System.out.println("Value Not Found");
	}

	//linear Search Recursion
	public void linearSearchRecursion(Node temp,int key,int i) {
		if(temp == null) {
			System.out.println("Value Not Found");
			return;
		}

		if(temp.data == key) {
			System.out.println("Value Found This Position : " + i);
			return;
		}

		linearSearchRecursion(temp.next,key,i+1);
	}

	// reverse Linked List
	public void reverseLinkedList() {
		Node prev = null;
		Node curr = head;
		Node next;

		tail = head;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			curr.prev = next;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	//Nth delect node
	public void removeNthHead(int k) {
		if(size == 0 || k > size) {
			System.out.println("Linked List Empty");
			return;
		}
		else if(size == 1) {
			System.out.println("Remove Data : " + head.data);
			size = 0;
			head = tail = null;
			return;
		}

		Node temp = head;
		int i=1;
		while(temp != null && i<k-1) {
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
		return;

	}

	//remove Nth Tail
	public void removeNthTail(int k) {
		int cnt = 0;
		Node temp = head;

		while(temp != null) {
			temp = temp.next;
			cnt++;
		}

		if(cnt == k) {
			head = head.next;
			return;
		}

		int n = cnt-k;
		int i=1;
		Node prev = head;
		while(i<n) {
			prev = prev.next;
			i++;
		}
		prev.next = prev.next.next;
		return;


	}

	// print
	public void print() {
		Node temp = head;
		if(temp == null) {
			System.out.println("Linked List Empty");
			return;
		}
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	//Main Function
	public static void main(String[] args) {
		DoubleLinkedListMathed dll = new DoubleLinkedListMathed();
		dll.print();
		dll.addHead(30);
		dll.print();
		dll.addHead(20);
		dll.print();
		dll.addHead(10);
		dll.print();
		dll.removeHead();
		dll.print();
		dll.reverseLinkedList();
		dll.print();

	}
}