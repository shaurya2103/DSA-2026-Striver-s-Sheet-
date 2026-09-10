import java.util.Arrays;
public class largest {

    public static int sortArr(int[] arr) {

        Arrays.sort(arr);

        return arr[arr.length - 1];
    }
        public static void main(String[] args) {

            int[] arr = { 2,5,1,3,0};
            int[]arr1 = { 8,10,5,7,9};

            System.out.println("Largest number in the array is: " + sortArr(arr));
            System.out.println("Largest number in the array is: " + sortArr(arr1));
            
    
        }
    
}
