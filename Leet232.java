//Implement Queue using Stacks
import java.util.*;
public class Leet232 {
class Myqueue{
    private Stack<Integer> main;
    private Stack<Integer> helper;
    public Myqueue(){
        main= new Stack<>();
        helper= new Stack<>();
    }
    public void push(int ele){
        //add element main-->helper
        while(main.size()>0){
            helper.push(main.pop());
        }
        //add element into main
        main.push(ele);
        //ass element helper-->main
        while(helper.size()>0){
            main.push(helper.pop());
        }
    }
    public int pop(){
        return main.pop();
    }
    public int peek(){
        return main.peek();
    }
    public boolean empty() {
        return main.size()==0;
    }
    
} 



    public static void main(String[] args) {
        Leet232 Outer = new Leet232();
        Myqueue queue = Outer .new Myqueue();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
         System.out.println("Top element: " + queue.peek());   
        System.out.println("Popped element: " + queue.pop()); 
        System.out.println("Top element after pop: " + queue.pop()); 
        System.out.println("Is stack empty? " + queue.empty()); 
    }
}
