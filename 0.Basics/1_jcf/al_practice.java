import java.util.ArrayList;
public class al_practice {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(10);
            list.add(15);
            list.add(20);
            System.out.println("2nd element: " + list.get(1) );
            list.set(2,100);
            System.out.println("ArrayList: " + list);
            list.remove(1);
            System.out.println("ArrayList after removal: " + list);
            System.out.println("list contains 20: " + list.contains(20));
            System.out.println("size of arraylist: " +list.size());

        
            
            
    
        }
    
}
