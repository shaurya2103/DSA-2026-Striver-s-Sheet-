import java.util.Scanner;
public class divisors_brute {

    public void divisors(int n) {
        for(int i = 1 ; i <=n ; i++) {
            if(n% i == 0 ) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        divisors_brute obj = new divisors_brute();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its divisors");
        int n = sc.nextInt();
        obj.divisors(n);
        sc.close();


        

    }
    
}
