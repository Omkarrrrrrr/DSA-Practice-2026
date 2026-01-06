public class Reversal {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,12};
        int n = arr.length;

        for(int i=0; i < n/2; i++){
            //swapping 
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        //reversal array
        System.out.println("Reversal of an array is: ");
        for(int i = 0;i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
