import java.util.Scanner;
public class prime_numbers {

    public void printPrimeNumbers(int n){
        int cnt = 0 ; 
        for ( int i = 1 ; i <= n ; i++) {
            if (n%i == 0) {
                cnt++;
            }
        }
        if(cnt == 2) {
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }

    }

        public static void main(String[] args) {

            prime_numbers obj = new prime_numbers();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number to check if it is prime or not");
            int n = sc.nextInt();
            obj.printPrimeNumbers(n);
            sc.close();
    
            
    
        }
    }
    

