import java.util.LinkedList;
import java.util.Queue;
public class Queue_practice {
        public static void main(String[] args) {

            Queue<Integer> q = new LinkedList<>();

            q.offer(1);
            q.offer(2);
            q.offer(3);
            q.offer(4);
            System.out.println("Queue: " + q);
            q.poll();
            System.out.println("Queue after poll(): " + q);
            q.poll();
            System.out.println("Queue after poll(): " + q);
            q.peek();
            System.out.println("Queue after peek(): " + q);
            q.isEmpty();
            System.out.println("Is the queue empty? " + q.isEmpty());
            System.out.println("queue: " + q);


    
            
    
        }
    
}
