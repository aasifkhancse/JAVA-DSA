import java.util.*;

public class InputOutput {
    public static void input(int arr[]){
        Scanner st = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = st.nextInt();
        }
    }
    public static void output(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            System.out.println(i + " = " + arr[i] + " \n");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        input(arr);
        output(arr);
    }
}