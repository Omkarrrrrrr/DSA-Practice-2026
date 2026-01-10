import java.util.*;                                               
    public class RotationMatrix {
              
    public static void RotatedMatrix1(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        // Step 1: Transpose
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < m; i++) {
            int li = 0, ri = n - 1;
            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;   // ✅ FIXED
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        RotatedMatrix1(arr);

        for (int[] mat : arr) {
            System.out.println(Arrays.toString(mat)); // ✅ FIXED
        }
    }
}
