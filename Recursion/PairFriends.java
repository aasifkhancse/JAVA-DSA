import java.util.*;

public class PairFriends {

	public static int pairFriend(int n) {
		if(n==1 || n == 2) {
			return n;
		}
		
		return pairFriend(n-1) + (n-1) * pairFriend(n-2);
	}

	public static void main(String[] args) {
		System.out.println("Total Pair : " + pairFriend(5));
	}
}