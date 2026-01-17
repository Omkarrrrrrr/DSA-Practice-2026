import java.util.*;
public class LinearSearch{
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

        int index = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("Element does not found in array");
        }
        else{
            System.out.println("Element found in array at index: " + index);
        }
    }
}