import java.util.*;
public class PrefixSumOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows here");
        int m = sc.nextInt();
        System.out.println("Enter no of columns here");
        int n = sc.nextInt();
        System.out.println("Enter the array here: ");

        int array[][] = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the r1 here");
        int r1 = sc.nextInt();
        System.out.println("Enter the c1 here");
        int c1 = sc.nextInt();
        System.out.println("Enter the r2 here");
        int r2= sc.nextInt();
        System.out.println("Enter the c2 here");
        int c2 = sc.nextInt();

        prefixSumMatrix(array);
        int result = sumRegion(array,r1,c1,r2,c2);
        System.out.println("Sum of elements of given rectangle is: "+result);

    }

    // time complexity : O(m * n)
    // space complexity: O(1)
    private static void prefixSumMatrix(int[][] array) {
        int m = array.length;
        int n = array[0].length;
        //Traverse the array row wwise to calc rowwise prefix sum
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                array[i][j] += array[i][j-1];
            }
        }

        //Traverse the array col wise to calc Columnwise prefix sum
        for(int j =0;j<n;j++){
            for(int i=1;i<m;i++){
                array[i][j] += array[i-1][j];
            }
        }
    }
        private static int sumRegion(int array[][],int r1,int c1,int r2, int c2){
            int sum = 0; int up = 0; int left=0; int repeated_region=0;
             sum = array[r2][c2];
             up = array[r1-1][c2];
             left = array[r2][c1-1];
             repeated_region = array[r1-1][c1-1];

            int result = sum - up - left + repeated_region;
            return result;
        }

    }
