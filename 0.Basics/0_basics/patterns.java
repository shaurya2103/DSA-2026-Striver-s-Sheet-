import java.util.Scanner;
class patterns {
    // Function to print a square pattern of stars
    public void pattern1(int N) {
        // Outer loop to handle rows
        for (int i = 0; i < N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 0; j < N; j++) {
                // Print a star followed by a space
                System.out.print("* ");
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    public void pattern2(int N) {
        for (int i = 0; i <= N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 0; j <= i; j++) {
                // Print a star followed by a space
                System.out.print("* ");
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    public void pattern3(int N) {
        for (int i = 1; i <= N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 1; j <= i; j++) {
                // Print a star followed by a space
                System.out.print(j);
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    public void pattern4(int N) {
        for (int i = 1; i <= N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 1; j <= i; j++) {
                // Print a star followed by a space
                System.out.print(i);
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    public void pattern5(int N) {
        for (int i = 1; i <= N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 1; j <= N-i+1; j++) {
                // Print a star followed by a space
                System.out.print(j); // put star in place of j for a * problem 
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    public void pattern6(int N) {
        for (int i = 0 ; i < N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 0; j < N-i+1; j++) {
                System.out.print(" "); 
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*"); 
            }
            for (int j = 1; j < N-i+1; j++) {
                System.out.print(" "); 
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    public void pattern7(int N) {
        for (int i = 0 ; i < N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 0; j < i; j++) {
                System.out.print(" "); 
            }
            for (int j = 0; j < 2*N-(2*i+1); j++) {
                System.out.print("*"); 
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" "); 
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    public void pattern8(int N) {

        for (int i = 0 ; i <= 2*N-1; i++) {
            int stars = i ; 
           if(i>N){
            stars = 2*N-i;
        }
            // Inner loop to handle columns for each row
            for (int j = 0; j < stars ; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }


}
    public void pattern9(int N) {

        int start =1 ;
        for ( int i = 0 ; i < N; i++ ) {
            if ( i%2 ==0 ) start = 1 ;
            else start = 0; 
            for ( int j = 0 ; j <= i ; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }


    }
    public void pattern10(int N){

        int space = 2* (N-1);

        for (int i = 1; i <= N; i++) {

            //numbers 
            for( int j =1 ; j <= i ; j++) {
                System.out.print(j);
            }
            //spaces 
            for( int j =1 ; j <= space ; j++) {
                System.out.print(" ");
            }
            for( int j=i; j >= 1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
            space = space -2 ;
            
        }
    }
    public void pattern11(int N) {
        int num = 1 ; 
        for (int i = 1; i <=N; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print( num + " ");
                num ++ ; 
                
            }
            System.out.println( " ");
            
        }
    }
    public void pattern12(int N) {

        for (int i = 1 ; i<= N ; i++) {

            for (char ch = 'A'; ch <= 'A'+ i ; ch++) {
                System.out.print( ch );
                
            }
            System.out.println( " ");
            
        }
    }
    public void pattern15(int N) {

        for ( int i = 0 ; i < N ; i++ ) {

            for ( char ch = 'A' ; ch <= 'A'+ (N-i-1 ); ch++){
                System.out.print( ch + " ");
            }
            System.out.println( );
        }
    }
    public void pattern16(int N ){

        for (int i = 0; i < N; i++) {
            char ch =  (char)('A'  + i) ; 
            for (int j = 0; j <=i; j++) {
                System.out.print( ch + " ");
            }
            System.out.println( );

            
        }
    }
    
    public static void pattern17(int N) {
        // Loop for each row
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Initialize character to start from 'A'
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;

            // Print characters in row
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);

                // Increment or decrement character
                if (j <= breakpoint) ch++;
                else ch--;
            }

            // Print trailing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Newline after each row
            System.out.println();
        }
    }
    public void pattern18(int N) {
        // Loop for each row
        for (int i = 0; i < N; i++) {
            // Print characters from ('A' + N - 1 - i) to ('A' + N - 1)
            for (char ch = (char) ('A' + N - 1 - i); ch <= (char) ('A' + N - 1); ch++) {
                System.out.print(ch + " ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
    public void pattern19(int N) {
        // Initial spaces for upper half
        int iniS = 0;

        // Loop for upper half rows
        for (int i = 0; i < N; i++) {
            // Print stars on left
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            // Print spaces in middle
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            // Print stars on right
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            // Increase middle spaces by 2
            iniS += 2;
            // Move to next row
            System.out.println();
        }

        // Initial spaces for lower half
        iniS = 2 * N - 2;

        // Loop for lower half rows
        for (int i = 1; i <= N; i++) {
            // Print stars on left
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in middle
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            // Print stars on right
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Decrease middle spaces by 2
            iniS -= 2;
            // Move to next row
            System.out.println();
        }
    }
    public void pattern20(int n) {
        // Initialize spaces between star blocks
        int spaces = 2 * n - 2;

        // Loop for rows
        for (int i = 1; i <= 2 * n - 1; i++) {
            // Calculate stars for first half
            int stars = i;

            // Adjust stars for second half
            if (i > n) stars = 2 * n - i;

            // Print left stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();

            // Adjust spaces for next row
            if (i < n) spaces -= 2;
            else spaces += 2;
        }
    }
     void pattern21(int n) {
        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for columns
            for (int j = 0; j < n; j++) {
                // Print star if it's a border cell
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print( "*");
                // Print space otherwise
                else
                   System.out.print( " ");
            }
            // Move to next line after each row
           System.out.println();
        }
    }
     void pattern22(int n) {
        // Outer loop for rows
        for (int i = 0; i < 2 * n - 1; i++) {
            // Inner loop for columns
            for (int j = 0; j < 2 * n - 1; j++) {
                // Calculate distance from top
                int top = i;
                // Calculate distance from left
                int left = j;
                // Calculate distance from bottom
                int bottom = (2 * n - 2) - i;
                // Calculate distance from right
                int right = (2 * n - 2) - j;

                // Take the minimum of all four distances
                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                // Print number (starts with n at border, decreases inside)
                System.out.print((n - minDist) + " ");
            }
            // Move to the next row
            System.out.println();
        }
    }

public static void main(String[] args) {

    Scanner sc = new Scanner ( System.in );
        patterns sol = new patterns();
        int t ;
        System.out.println(" Enter the value of t ");
        t = sc.nextInt();
        for ( int i = 1 ; i <= t ; i ++ ) {

            int n ; 
            System.out.println(" Enter the value of n ");
            n = sc.nextInt();

           // sol.pattern6(n);
           // //sol.pattern7(n); // Call the function to print the pattern
        sol.pattern22(n);




        }
        sc.close();
    }
}



    

