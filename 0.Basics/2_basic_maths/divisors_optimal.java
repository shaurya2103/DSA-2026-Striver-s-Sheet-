import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class divisors_optimal {
    
    public void printDivisors(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i =1; i <= Math.sqrt(n); i++) {
            if (n%i ==0){
                list.add(i);
            }
            if (n/i != i && n%i == 0) {
                list.add(n/i);
            }
        }
       Collections.sort(list);
       System.out.println(list);
    }
    public static void main(String[] args) {
        
        divisors_optimal obj = new divisors_optimal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its divisors");
        int n = sc.nextInt();
        obj.printDivisors(n);
        sc.close();
    }
    
}
