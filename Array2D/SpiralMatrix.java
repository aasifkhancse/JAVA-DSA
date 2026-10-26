import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {11,12,13,14,15},
            {21,22,23,24,25},
            {31,32,33,34,35},
            {41,42,43,44,45},
            {51,52,53,54,55}
        };

        int srow = 0, scol = 0;
        int erow = arr.length - 1, ecol = arr[0].length - 1;

        while (srow <= erow && scol <= ecol) {
            for (int i = scol; i <= ecol; i++)
                System.out.print(arr[srow][i] + " ");

            for (int i = srow + 1; i <= erow; i++)
                System.out.print(arr[i][ecol] + " ");

            for (int i = ecol - 1; i >= scol; i--) {
                if (srow == erow) break;
                System.out.print(arr[erow][i] + " ");
            }

            for (int i = erow - 1; i > srow; i--) {
                if (scol == ecol) break;
                System.out.print(arr[i][scol] + " ");
            }

            srow++;
            scol++;
            erow--;
            ecol--;
        }
    }
}
