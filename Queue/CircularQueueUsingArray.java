import java.util.*;
public class CircularQueueUsingArray {
	static class CircularQueue {
		int arr[];
		int size;
		int front;
		int real;

		CircularQueue(int size) {
			this.arr = new int[size];
			this.size = size;
			this.front = -1;
			this.real = -1;
		}

		public boolean empty() {
			return real == -1 && front == -1;
		}

		public boolean full() {
			return ((real+1)%size) == front;
		}

		public void add(int data) {
			if(full()) {
				System.out.println("Queue Is Full");
				return;
			}

			if(front == -1) {
				front = 0;
			}
			real = (real+1)%size;
			arr[real] = data;
			return;
		}

		public void remove() {
			if(empty()) {
				System.out.print("Queue Is Empty");
				return;
			}

			int data = arr[front];

			if(real == front) {
				front = -1;
				real = -1;
			}
			else {
				front = (front+1)%size;
			}
			System.out.println("Remove Data : "+data);
		}

		public void peek() {
			if(empty()) {
				System.out.println("Empty");
				return;
			}
			System.out.println("Peek Data : "+ arr[front]);
		}


	}
	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(10);
		System.out.print(cq.empty());
		System.out.println();
		System.out.println(cq.full());
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