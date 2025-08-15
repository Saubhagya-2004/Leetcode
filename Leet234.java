//  Palindrome Linked List
import java.util.Stack;

public class Leet234 {
    int value;
    Leet234 next;
   Leet234(int value){
    this.value= value;
    this.next= null;
   }
   Leet234(int value,Leet234 next){
    this.value= value;
    this.next= next;
   }public static boolean isPalindrome( Leet234 head){
    Stack<Integer> st = new Stack<>();
    Leet234 ptr = head;
    while(ptr!=null){
        st.push(ptr.value);
        ptr= ptr.next;
    }
    Leet234 ptr2 = head;
    while(ptr2!=null){
        int val1 = ptr2.value;
        int val2 = st.pop();
        if(val1!=val2){
            return false;
        }
        ptr2= ptr2.next;
    }
    return true;
   }
   public static void main(String[] args) {
     Leet234 head = new Leet234(1, new Leet234(2, new Leet234(2, new Leet234(1))));
        System.out.println(isPalindrome(head)); 
   }
}
