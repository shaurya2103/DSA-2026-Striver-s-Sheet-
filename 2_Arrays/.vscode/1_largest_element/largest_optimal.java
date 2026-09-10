
public class largest_optimal {

    public static int optimal_largest(int[] arr) {

        int largest = arr[0];

        for ( int i = 0 ; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest; 

    }

        public static void main(String[] args) {

            int[] arr = { 2,5,1,3,0};
            int[]arr1 = { 8,10,5,7,9};

            System.out.println("Largest number in the array is: " + optimal_largest(arr));
            System.out.println("Largest number in the array is: " + optimal_largest(arr1));
    
            
    
        }
    
}
