import java.util.Scanner;
public class euclidean_algo {
    public void gcd(int n1, int n2) {
        while( n1> 0 && n2>0) {
            if (n1>n2) {
                n1 = n1%n2;
            }
            else {
                n2 = n2%n1;
            }
        }
        if(n1 == 0 ){
            System.out.println("GCD is: " + n2);
        }
        else {
            System.out.println("GCD is:" + n1);
        }
    }
    public static void main(String[] args) {

        euclidean_algo obj = new euclidean_algo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        obj.gcd(n1, n2);
        sc.close(); 

        
    }
    
}
