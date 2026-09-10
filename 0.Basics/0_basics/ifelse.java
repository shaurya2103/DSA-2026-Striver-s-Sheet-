import java.util.Scanner ; 

public class ifelse {
    public static void main ( String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age :");
        int age = sc.nextInt();

        if (age >=18 ){
            System.out.println(" you are an adult ");
        }
        else {
            System.out.println("YOU ARE NOT AN ADULT ");
        }
        sc.close();
    }
    
}
