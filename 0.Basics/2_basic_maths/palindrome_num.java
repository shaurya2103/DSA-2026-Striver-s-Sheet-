import java.util.Scanner;
public class palindrome_num {

    public boolean palindrome(int n) {
        int rev =0;
        int dup = n; 
        while ( n > 0 ) {
            int ld = n%10; 
            n=n/10;
            rev = (rev*10) + ld ; 
        }
        if( rev == dup ){
            System.out.println("The number is a palindrome");
            return true;
        }
        else {
            System.out.println("The number is not a palindrome");
            return false;
        }
        
}

        public static void main(String[] args) {

            palindrome_num sol = new palindrome_num();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            sol.palindrome(n);
            sc.close();
    
            
    
        }
    
}
