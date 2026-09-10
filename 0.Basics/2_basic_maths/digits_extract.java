public class digits_extract {

     public void count() {
         int num = 7789;
         while( num >0 ) {

            int digit =num%10; 
            num=num/10; 
            System.out.println(digit);
    }
}
    public static void main (String args[]) {

        digits_extract sol = new digits_extract();
        sol.count();




       
         }
    }
    

