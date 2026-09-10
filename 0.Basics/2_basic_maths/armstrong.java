import java.util.Scanner;
public class armstrong {

    void armstong(int n) {
        int sum = 0,temp =n ;
        while ( n > 0 ) {
            int ld = n%10; 
            n=n/10;
            sum = sum + (ld*ld*ld);
            System.out.println("Sum is: " + sum);
    }
    if( sum == temp ){
        System.out.println("The number is an armstrong number");
    }
    else {
        System.out.println("The number is not an armstrong number");
    }
}
        public static void main(String args []) {

        armstrong sol = new armstrong();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sol.armstong(n);
        sc.close();
    }
        

    
}
