import java.util.*;

public class QueueWithArray {
	public static class Queue {
		int arr[];
		int size;
		int real;

		Queue(int size) {
			this.arr = new int[size];
			this.size = size;
			this.real = -1;
		}

		public boolean empty() {
			return real == -1;
		}

		public void add(int data) {

			if(real == size-1) {
				System.out.println("Full");
				return;
			}
			real++;
			arr[real] = data;
			return;
		}

		public void remove() {
			if(empty()) {
				System.out.println("Empty");
				return;
			}
			int data = arr[0];
			for(int i=0; i<real; i++) {
				arr[i] = arr[i+1];
			}
			System.out.println(data);
			arr[real] = -1;
			real--;
			return;
		}

		public void peek() {
			if(!empty()) {
				System.out.println(arr[0]);
				return;
			}
			System.out.println("Empty");
			return;

		}
		public void print() {
			for(int i=0; i<=real; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.add(10);
		q.print();
		q.add(20);
		q.print();
		q.add(30);
		q.remove();
		q.print();
		q.add(40);
		q.print();
		q.add(50);
		q.print();
		q.add(60);
		q.remove();
		q.add(70);
		q.print();
		q.peek();
		System.out.println(q.empty());
	}
}