import java.util.Scanner;

public class BinarySearch {
    public static int BinarySearchMethod(int arr[],int target){
        int low = 0; int high = arr.length-1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(target == arr[mid]){
            return mid;
        }
        else if(target < arr[mid]){
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array: ");

        int n = sc.nextInt();
        System.out.println("Enter the input array here: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element here: ");
        int target = sc.nextInt();

        int result = BinarySearchMethod(arr,target);

        if(result == -1){
            System.out.println("Element not found in array");
        }
        else{
            System.out.println("Element found in array at index: " + result);
        }
        

    }
}
