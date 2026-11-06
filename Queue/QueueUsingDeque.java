import java.util.*;
public class QueueUsingDeque {

	static class Queue {

		static Deque <Integer> q = new LinkedList<>();

		public void isempty() {
			if(q.isEmpty()) {
				System.out.println("Queue Empty");
			}
		}

		public void add(int data) {
			q.addFirst(data);
			return;
		}

		public void remove() {
			if(q.isEmpty()) {
				System.out.println("Queue Empty");
				return;
			}

			int top = q.removeLast();
			System.out.println("Remove Data : "+top);
		}

		public void peek() {
			if(q.isEmpty()) {
				System.out.println("Queue Empty");
				return;
			}
			int top = q.getLast();

			System.out.println("Peek Data : "+top);
		}


	}
	public static void main(String[] args) {
		Queue q = new Queue();
		q.isempty();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.peek();
		q.remove();
		q.remove();
		q.remove();
	}
}