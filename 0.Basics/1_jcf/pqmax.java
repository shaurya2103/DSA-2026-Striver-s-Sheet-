import java.util.*;
public class pqmax {
        public static void main(String[] args) {
    
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            pq.offer(30);
pq.offer(10);
pq.offer(20);

System.out.println(pq.poll());
System.out.println(pq.poll());

    
        }
    
}
