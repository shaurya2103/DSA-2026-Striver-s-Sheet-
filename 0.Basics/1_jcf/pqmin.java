import java.util.*;
public class pqmin {
        public static void main(String[] args) {
    
            PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.offer(30);
pq.offer(10);
pq.offer(20);

System.out.println(pq.poll());
System.out.println(pq.poll());

    
        }
    
}
