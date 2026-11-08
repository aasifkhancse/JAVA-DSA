import java.util.*;

public class DiameterOfTree {

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
	public static int height(Node temp) {

		if(temp == null) {
			return 0;
		}
		int l = height(temp.left);
		int r = height(temp.right);
		int ans = Math.max(l,r)+1;
		return ans;
	}

	public static int diameter(Node temp) {

		if(temp == null) {
			return 0;
		}
		int lh = height(temp.left);
		int ld = diameter(temp.left);
		int rh = height(temp.right);
		int rd = diameter(temp.right);
		int selfdia = lh + rh + 1;

		int ans = Math.max(selfdia,Math.max(ld,rd)) ;
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

		System.out.println(diameter(root));
	}
}