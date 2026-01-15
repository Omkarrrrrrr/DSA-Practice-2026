import java.util.*;
public class Assignment_2D {

    /*Q5: Write a function which accepts a 2D array of integers and its size as arguments and
          displays the elements of middle row and the elements of middle column. Printing can
          be done in any order.
          [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...] */

    static void printMiddleRowAndColumn(int[][] arr5, int n4) {

    int mid = n4 / 2;

    // Print middle column
    for (int i = 0; i < n4; i++) {
        System.out.print(arr5[i][mid] + " ");
    }

    // Print middle row
    for (int j = 0; j < n4; j++) {
        System.out.print(arr5[mid][j] + " ");
    }
}
    public static void main(String[] args) {
    /*Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
    number of positive numbers
    number of negative numbers
    number of odd numbers
    number of even numbers
    number of 0.*/

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of rows here: ");
    int m = sc.nextInt();
    System.out.println("Enter no of columens here: ");
    int n = sc.nextInt();
    
    System.out.println("Enter input array here: ");
    int arr[][] = new int[m][n];
    int positive = 0,negative = 0, even = 0,odd = 0, zeros = 0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j] = sc.nextInt();

            if(arr[i][j] > 0){
                positive++;
            }
            else if(arr[i][j] < 0){
                negative++;
            }
            else{
                zeros++;
            }

            if (arr[i][j] != 0) {
                    if (arr[i][j] % 2 == 0)
                        even++;
                    else
                        odd++;
                }
        }

    }    
    System.out.println("number of positive numbers: " + positive);
    System.out.println("number of negative numbers: " + negative );
    System.out.println("number of odd numbers: " + odd);
    System.out.println("number of even numbers: " + even );
    System.out.println("number of zeros: " + zeros );


    /*Q2: write a program to print the elements above the secondary diagonal in a user inputted square matrix.*/

    System.out.println("Enter size of arr2: ");
    int n2 = sc.nextInt();

    System.out.println("Enter the input arr2 here: ");
    int arr2 [][] = new int[n2][n2];
    for(int i=0;i<n2;i++){
        for(int j=0;j<n2;j++){
            arr2[i][j] = sc.nextInt();
        }
    }

    System.out.println("Elements above second diagonal are: ");

    for(int i=0;i<n2;i++){
        for(int j=0;j<n2;j++){
            if(i + j < n2 - 1){
                System.out.print(arr2[i][j] + " ");
            }
            
        }
    }


    /*Q3: write a program to print the elements of both the diagonals in a user inputted square matrix
in any order. */

    System.out.println("Enter size of arr3: ");
    int n3 = sc.nextInt();

    System.out.println("Enter the input arr2 here: ");
    int arr3 [][] = new int[n3][n3];
    for(int i=0;i<n3;i++){
        for(int j=0;j<n3;j++){
            arr3[i][j] = sc.nextInt();
        }
    }

    System.out.println("Elements of both diagonals:");
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j < n3; j++) {
                if (i == j || i + j == n3 - 1) {
                    System.out.print(arr3[i][j] + " ");
                }
            }
        }

    //Q4: Write a program to find the largest element of a given 2D array of integers.

    System.out.println("Enter no of rows here: ");
    int rows = sc.nextInt();
    System.out.println("Enter no of columens here: ");
    int cols = sc.nextInt();
    
    System.out.println("Enter input array here: ");
    int arr4[][] = new int[rows][cols];

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr4[i][j]  = sc.nextInt();  
          }
    }

    int max_element = arr[0][0];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (arr4[i][j] > max_element) {
                max_element = arr4[i][j];
            }
        }
    }

    System.out.println("Largest element: " + max_element);

    //Q5)
    System.out.print("Enter odd size of matrix: ");
        int n4 = sc.nextInt();
        int[][] arr5 = new int[n4][n4];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n4; i++) {
            for (int j = 0; j < n4; j++) {
                arr5[i][j] = sc.nextInt();
            }
        }
        printMiddleRowAndColumn(arr5, n4);

} 

}
