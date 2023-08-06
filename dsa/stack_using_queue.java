import java.util.LinkedList;
import java.util.Queue;

public class stack_using_queue {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public stack_using_queue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if (q1.isEmpty()) {
            q1.add(x);
        } else {
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            q1.add(x);
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
    public static void main(String[] args) {
        stack_using_queue q = new stack_using_queue();
    }
}
