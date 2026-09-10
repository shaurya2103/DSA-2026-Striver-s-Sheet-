import java.util.HashSet;
public class hashset_practice {

        public static void main(String[] args) {
    
            HashSet<Integer> set = new HashSet<>();
            set.add(5);
            set.add(7);
            set.add(5);
            set.add(8);
            set.add(7);
            set.add(9);
            System.out.println("HashSet: " + set);
            set.remove(7);
            System.out.println("HashSet after removal: " + set);
            System.out.println("set contains 8: " + set.contains(8));
            System.out.println("size of hashset: " + set.size());
            System.out.println("Remaining elements: " + set);
    
        }
    
}
