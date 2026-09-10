import java.util.Scanner;
public class digits_count_01 {

    public int count(int n ) {
        int count =0;
        while (n>0) {
            n=n/10; 
            count++;
        }
        System.out.println("Number of digits: " +count);
        return count;
    }
        public static void main(String[] args) {

            digits_count_01 sol = new digits_count_01();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            sol.count(n);
            sc.close();
    
            
    
        }
    
}
