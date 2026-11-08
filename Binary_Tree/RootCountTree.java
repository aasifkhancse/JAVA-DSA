import java.util.*;

public class RootCountTree {

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
	public static int countNode(Node temp) {
		if(temp == null) {
			return 0;
		}
		int l = countNode(temp.left);
		int r = countNode(temp.right);
		int ans = l + r + 1;
		return ans;
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

		System.out.println(countNode(root));
	}
}