public class gcd_os {
     public void gcd(int n1 , int n2) {

        for(int i =1 ; i<=Math.min(n1,n2);i++) {
            if(n1%i ==0 && n2%i ==0) {
             System.out.println("GCD of " + n1 + " and " + n2 + " is: " + i);
             break;
            }
        }
        
    }
        public static void main(String[] args) {
            
            gcd_bf obj = new gcd_bf();
            obj.gcd(10, 20);
            obj.gcd(15, 25);
            obj.gcd(100, 200);
            obj.gcd(7, 13);

    
            
    
        }
    
}
    

