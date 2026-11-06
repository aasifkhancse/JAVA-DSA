import java.util.*;
public class ReverseQueue{
     
     public static void reverseQueue(Queue<Integer> q){
          Stack<Integer>s = new Stack();
          
          while(!q.isEmpty()){
               s.push(q.remove());
          }
          
          while(!s.isEmpty()){
               q.add(s.pop());
          }
     }
	
	public static void main(String[] args) {
		Queue<Integer>q = new LinkedList<>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		reverseQueue(q);
		System.out.println(q);
	}
}