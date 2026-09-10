import java.util.*;
public class question2 {

    public static void printnto1(int i , int n ){

        if(i < 1 )
            return;
    
    System.out.println(i);
    printnto1(i-1 , n );


        }

        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number:");
            int n = sc.nextInt();

            printnto1(n, n);
            sc.close();


    
        }
    
}
