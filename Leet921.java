//Minimum Add to Make Parentheses Valid
// ()((
import java.util.Stack;

public class Leet921 {
    public static int minAddToMakeValid(String s){
    Stack<Character> st = new Stack<>();
    int count =0;
    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);//( ) (
        if(ch=='('){//(
            st.push(ch);//push it into stack
        }else if(st.size()>0 && st.peek()=='('){ //check )
            st.pop();//and pop
        }
        else {
            count++;//1 2
        }
    }
    return count+st.size();//2
    }
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("()(("));
    }
}
