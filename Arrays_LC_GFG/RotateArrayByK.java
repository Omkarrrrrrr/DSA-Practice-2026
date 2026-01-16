import java.util.*;
public class RotateArrayByK {
    public static void ReverseArray(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int arr[],int k){
        int n = arr.length;
        k = k % n;
        ReverseArray(arr,0,n-1);
        ReverseArray(arr,0,k-1);
        ReverseArray(arr,k,n-1);
    }
        public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array: ");
        int n = sc.nextInt();

        System.out.println("enter the no. of rotations: ");
        int k = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the input array here: ");
        for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
        }

        System.out.println("Original array is: ");
        printArray(arr);


        rotate(arr,k);
        System.out.print("Array after rotating by " + k + ": ");
        printArray(arr);
       

    }
    
}
