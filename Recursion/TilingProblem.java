import java.util.*;

public class TilingProblem{

	public static int tilingProblem(int n){
	     if(n == 0 || n == 1){
	          return 1;
	     }
	     int h = tilingProblem(n-2);
	     int v = tilingProblem(n-1);
	     return h + v;
	}
	public static void main(String[] args) {
		System.out.println(tilingProblem(5));

	}
}