import java.util.PriorityQueue;

public class pq_practice {
        public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
    
            pq.offer(50);
            pq.offer(20);
            pq.offer(80);
            pq.offer(10);
            pq.offer(60);
            System.out.println("Priority Queue: " + pq);
            pq.peek();
            System.out.println("Peek Element: " + pq.peek());
            pq.poll();
            System.out.println("Priority Queue after poll: " + pq);
            pq.poll();
            System.out.println("Priority Queue after poll: " + pq);
            pq.peek();
            System.out.println("Peek Element: " + pq.peek());
            System.out.println("Size: " + pq.size());

    
            
    
        }
    
}
