import java.util.*;
public class NextGreaterNumber{
     public static void nextGreater(int arr[]){
          
          int str[] = new int[arr.length];
          Stack<Integer>s = new Stack<>();
          
          for(int i=arr.length-1;i>=0;i--){
               while(!s.empty() && arr[s.peek()] <= arr[i]){
                    s.pop();
               }
               if(s.empty()){
                    str[i] = -1;
               }
               else{
                    str[i] = arr[s.peek()];
               }
               s.push(i);
          }
          for(int j=0;j<arr.length;j++){
               System.out.println(str[j]+" ");
          }
     }
     
	public static void main(String[] args) {
	     
	     int []arr = {5,3,6,2,7,4,8,2,9};
	     nextGreater(arr);
	}
}