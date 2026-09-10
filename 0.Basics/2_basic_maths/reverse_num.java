import java.util.Scanner;
public class reverse_num {
    public int reverse(int n) {
        int rev =0 ;
        while (n>0) {
            int last_digit =n%10;
             n=n/10;
            rev = rev*10 + last_digit; 
        }
        return rev;
    }
public static void main(String[] args) {
    
    
        reverse_num sol = new reverse_num();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int rev = sol.reverse(n);
        System.out.println("Reversed number: " + rev);
        sc.close();
}
    
}
