import java.util.*;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -4, 5, 6, -6, 7, 8, 9, 9};

        int curr = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            if (curr < 0) {
                curr = 0;
            }

            if (curr > max) {
                max = curr;
            }
        }

        System.out.println("Current Sum: " + curr);
        System.out.println("Maximum Subarray Sum: " + max);
    }
}
