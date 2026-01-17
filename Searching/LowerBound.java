//first occurence of element in array

import java.util.Scanner;

public class LowerBound{
    public static int findLowerBound(int arr[],int target){
        int high = arr.length; int low = 0; int result = -1;
        while(low<= high){
            int mid = low + (high-low)/2;
            if(target == arr[mid]){
            result = mid;
            high = mid - 1;    //going to left side     
            }
            else if(target < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the input array here: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element here: ");
        int target = sc.nextInt();

        int result = findLowerBound(arr, target);
        if(result == -1){
            System.out.println("Element not found in array");
        }
        else{
            System.out.println("Element found in array at location: " + result);
        }

    }
}
