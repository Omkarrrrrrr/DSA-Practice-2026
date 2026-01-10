public class assignments1D{
    public static void main(String[] args) {
        
        //Write a program to print the sum of all the elements present on even indices in the given array.
        //1)
        int arr[] = {3,20,4,6,9};
        int n = arr.length;
        int sum = 0;

        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                sum = sum + arr[i];
            }
        }

        System.out.println("The sum of elements at even indices is: " + sum);

        //2)
        int arr2[] = {4,3,6,7,1};
        int n2 = arr2.length;
        int sum2 = 0;

        for(int i=0;i<n2;i++){
            if(i % 2 == 0){
                sum2 = sum2 + arr2[i];
            }
        }

        System.out.println("The sum of elements at even indices of arr2 is: " + sum2);


        //Q2)Write a program to traverse over the elements of the array using for each loop and print all even elements.

        //1)

        int arr3 [] = {34,21,54,65,43};
        int n3 = arr3.length;

        System.out.print("Even elements at arr3 are: ");
        for(int i=0 ; i<n3;i++){
            if(arr3[i] % 2 == 0){
                System.out.print(arr3[i]);
                System.out.print(" ");
            }
        }

        System.out.println();
        //2)
        int arr4 [] = {4,3,6,7,1};

        System.out.print("Even elements at arr4 are: ");
        for(int num : arr4){
            if(num % 2 == 0){
                System.out.print(num);
                System.out.print(" ");
            }
        }

        System.out.println("");

        //Q3: Write a program to calculate the maximum element in the array.
        //1)
        
        int arr5[] = {34,21,54,65,43};
        int n5 = arr5.length;
        int max = arr5[0];

        for(int i = 0;i<n5;i++){
            if(arr5[i] > max){
                max = arr5[i];
            }
        }
        System.out.println("Max element is: " + max);

        //2)

        int arr6[] = {4,3,6,7,1};
        int max2 = arr6[0];

        for(int num2 : arr6){
            if(num2 > max2){
                max2 = num2;
            }
        }
        System.out.println("Max element is: " + max2);

        //Q4: Write a program to find out the second largest element in a given array.

        //1)
        int arr7[] = {34,21,54,65,43};
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i =0;i<arr7.length;i++){
            if(arr7[i] > largest){
                second_largest = largest;
                largest = arr7[i];
            }
            else if (arr7[i] > second_largest && arr7[i] < largest) {
                second_largest = arr7[i];
            }
        }

        System.out.println("Second Largest Element: " + second_largest);

        //2)
        int arr8[] = {4,3,6,7,1};
        int maximum1 = Integer.MIN_VALUE;
        int maximum2 = Integer.MIN_VALUE;

        for(int num:arr8){
            if(num > maximum1){
                maximum2 = maximum1;
                maximum1 = num;
            }
            else if(num > maximum2 && num != maximum1){
                maximum2 = num;
            }
        }

        System.out.println("The second largest element form arr8 is: " + maximum2);

        //Q5) Q5: Given an array. Find the first peak element in the array. 
        // A peak element is an element that is greater than its just left and just right neighbor.

        //1)
        int arr9[] = {1,3,2,6,5};

        for(int i = 1; i < arr9.length-1; i++){
             if (arr9[i] > arr9[i - 1] && arr9[i] > arr9[i + 1]){
                System.out.println("First Peak Element: "+ arr9[i]);
                break;
             } 
        }

    
        //2)
        int arr10[] = {1,4,7,3,2,6,5};
        for(int i = 1; i < arr10.length - 1;i++){
            if(arr10[i] > arr10[i+1] && arr10[i] > arr10[i-1]){
                System.out.println("The first peak element is: "+ arr10[i]);
                break;
            }
        }

    }
}