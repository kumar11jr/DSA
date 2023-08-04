import java.util.Stack;

class queue_using_stack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public queue_using_stack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Return a default value, you can use any appropriate value for your use case.
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Return a default value, you can use any appropriate value for your use case.
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }


    public static void main(String[] args) {
        queue_using_stack st = new queue_using_stack();
        st.push(0);
        st.push(5);
        st.push(9);
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.empty());
    }
}