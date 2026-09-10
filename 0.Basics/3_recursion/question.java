
import java.util.Scanner;

public class question {

    public static void print1ton(int i, int n) {

        if (i > n) 
            return;
    System.out.println("Shaurya");
    print1ton(i + 1, n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number ");
        int n = sc.nextInt();
        print1ton(1, n);
        sc.close();


    }

}
