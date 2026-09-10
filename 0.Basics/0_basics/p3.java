import java.util.Scanner;

public class p3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // arrays 
        int[] arr = new int [5]; 
        System.out.println( " Enter the values of arrays ");

        for( int i =0; i <5 ; i++){

            arr[i]= sc. nextInt();

        
        }
        for( int j =0 ; j <5 ; j++){

         System.out.println( arr[j]);

    
        }
        sc.close();


    

    }
    
}
