import java.util.*;

public class Leet9 {
    public static void main(String[] args) {
       int n,rev=0,digit;
       System.out.println("Enter a number");
       Scanner obj = new Scanner(System.in);
       n= obj.nextInt();
        if (n < 0) {
            System.out.println("Its not a palindrome");
            return;
        }
      int temp =n;
       while(n!=0){
        digit= n%10;
        rev = rev*10+digit;
        n=n/10;
       }
       if(rev==temp){
        System.out.println(temp+" Is a palindrome number");
       }
       else{
        System.out.println("Its not a palindrome");
       }
    }
}
