import java.util.*;
public class QueueUsingStackCostlyPop {

	static class Queue {

		Stack <Integer> s1 = new Stack<>();
		Stack <Integer> s2 = new Stack<>();

		public void isempty() {
			if(s1.empty()) {
				System.out.println("Queue Empty");
			}

		}


		public void add(int data) {
			s1.push(data);
		}

		public void remove() {
			if(s1.empty()) {
				System.out.print("Queue Is Empty");
				return;
			}

			while(!s1.empty()) {
				s2.push(s1.pop());
			}

			int data = s2.pop();

			while(!s2.empty()) {
				s1.push(s2.pop());
			}
			System.out.println("Remove Data : "+data);
		}

		public void peek() {
			if(s1.empty()) {
				System.out.println("Empty");
				return;
			}
			while(!s1.empty()) {
				s2.push(s1.pop());
			}

			int data = s2.peek();

			while(!s2.empty()) {
				s1.push(s2.pop());
			}
			System.out.println("Peek Data : "+ data);
		}


	}
	public static void main(String[] args) {
		Queue cq = new Queue();
		cq.isempty();
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
		cq.remove();
	}
}