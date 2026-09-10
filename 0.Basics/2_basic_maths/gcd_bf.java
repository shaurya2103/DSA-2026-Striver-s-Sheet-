public class gcd_bf {

    public void gcd(int n1 , int n2) {
        int g = 1;

        for(int i =1 ; i<=n1;i++) {
            if(n1%i ==0 && n2%i ==0) {
             g = i;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + g);
    }
        public static void main(String[] args) {
            
            gcd_bf obj = new gcd_bf();
            obj.gcd(10, 20);
            obj.gcd(15, 25);
            obj.gcd(100, 200);
            obj.gcd(7, 13);

    
            
    
        }
    
}
