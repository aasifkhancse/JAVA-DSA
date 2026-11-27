import java.util.*;

public class LevelTravelsare {

	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static void levelTravelsare(Node root) {
		if(root == null) {
			return;
		}

		Queue<Node>q = new LinkedList<>();

		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node temp = q.remove();
			if(temp == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(temp.data+" ");
				if(temp.left != null) {
					q.add(temp.left);

				}
				if(temp.right != null) {
					q.add(temp.right);
				}
			}
		}
	}

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.right.left = new Node(8);
		root.right.right.right = new Node(9);

		levelTravelsare(root);

	}
}