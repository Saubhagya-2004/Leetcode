
//Valid Parentheses

import java.util.Stack;

public class Leet20 {
    public static boolean isvalid(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch =s. charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else if(ch>0 && ch==')'&& st.peek()=='('){
                st.pop();
            }
            else if(ch>0 && ch=='}'&& st.peek()=='{'){
                st.pop();
            }
            else if(ch>0 && ch==']'&& st.peek()=='['){
                st.pop();
            }
            else{

                return false;
            }
        }
if(st.size()==0){
    return true;
}
else {
    return false;
}
    }
    public static void main(String[] args) {
        System.out.println(isvalid("()[]{"));
    }
    
}
