
import java.util.ArrayList;

public class arraylist {

        public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<>(); // creates an array internally 

    list.add(10); //adds elements at index 0
    list.add(20 );//adds elements at index 1
    list.add(30); //adds elements at index 2

    System.out.println(list.get(1));

    list.remove(1); // removes the element at index 1 and java shifts the elements 
System.out.println(list);

System.out.println(list.size());

System.out.println(list.contains(30));


}
}
