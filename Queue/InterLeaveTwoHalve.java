import java.util.*;

public class InterLeaveTwoHalve {

	public static void interLeave(Queue<Integer>q1) {

		Queue <Integer> q2 = new LinkedList<>();
		int n = q1.size();

		for(int i=0; i<n/2; i++) {
			q2.add(q1.remove());
		}

		while(!q2.isEmpty()) {
			q1.add(q2.remove());
			q1.add(q1.remove());
		}

	}
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		interLeaveTwoHalve(q);
		System.out.println(q);

	}
}