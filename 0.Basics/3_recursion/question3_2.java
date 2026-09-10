import java.util.Scanner;
public class question3_2 {

    public static int printsum(int n) {

        if (n == 0) {
            return 0;

        }
        return n + printsum(n - 1);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number ");
        int n = sc.nextInt();
        System.out.println(printsum(n));
        sc.close();

    }
}
