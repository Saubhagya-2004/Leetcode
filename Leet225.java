import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> main;
    private Queue<Integer> helper;

    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {
        while (!main.isEmpty()) {
            helper.add(main.remove());
        }
        main.add(x);
        while (!helper.isEmpty()) {
            main.add(helper.remove());
        }
    }

    public int pop() {
        if (main.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return main.remove();
    }

    public int top() {
        if (main.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return main.peek();
    }

    public boolean empty() {
        return main.isEmpty();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top());   
        System.out.println("Popped element: " + stack.pop()); 
        System.out.println("Top element after pop: " + stack.top()); 
        System.out.println("Is stack empty? " + stack.empty()); 

        stack.pop(); 
        stack.pop(); 

        System.out.println("Is stack empty now? " + stack.empty());
    }
}
