public class MissingNumber {
    public static void main(String[] args) {
        int arr [] = {1,2,3,5,6,7};
        int n = arr.length;

        // int expected_sum = n * (n + 1) / 2;
        int expected_sum = ((n+1)*(n+2))/2;
        int actual_sum = 0;

        for(int i = 0; i<n;i++){
            actual_sum = actual_sum + arr[i];
        }

        int missing_ele = expected_sum - actual_sum;
        System.out.print("Missing element is : ");
        System.err.println(missing_ele);
    }
}
