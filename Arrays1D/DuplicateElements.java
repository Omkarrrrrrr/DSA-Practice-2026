public class DuplicateElements {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2,1,3};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] == arr[j]){

                    //duplicate element is
                    System.out.println(arr[i]);
                }
            }
        }
    }
    
}
