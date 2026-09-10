import java.util.ArrayDeque;

public class ArrayDeque_practice {
        public static void main(String[] args) {
    
            ArrayDeque<Integer> dq = new ArrayDeque<>();
            dq.add(5);
            dq.add(10);
            dq.add(15);
            System.out.println("ArrayDeque: " + dq);
            dq.peek();
            System.out.println("peek: " + dq.peek());
            dq.pop();
            System.out.println("ArrayDeque after pop: " + dq);
            dq.peek();
            System.out.println("peek: " + dq.peek());
            dq.isEmpty();
            System.out.println("isEmpty: " + dq.isEmpty());
            System.out.println("stack" +dq);
    
        }
    
}
