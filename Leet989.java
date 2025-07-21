//num={2,7,4} k(add value)=181 so..
// length=4-1=3 carry =0
// while(lengthnum>=0 or k >0) so condition true
// numval=0
// numvalue= length of num last digit
//  then lastdigit = k lastdigit
//  sum = numvalue+lastdigit+carry(4+1)=5 
//  take last digit of add number 5%10 =5
//  carry = 5/10 =0
//  add to array =5 
//  so restart that beginning 

import java.util.*;

public class Leet989 {
  public static List<Integer> addtwoarray(int num[],int k){
    List<Integer>ans = new ArrayList<>();
    int lengthnum = num.length-1;
    int carry =0;
    while(lengthnum>=0||k>0){
        int numval = 0;
        if(lengthnum>=0){
            numval= num[lengthnum]; 
        }
        int lastdigit = k%10; //last digit of k
        int sum = numval+lastdigit+carry;
        int digit = sum%10;
        carry = sum/10;
        ans.add(digit);
        lengthnum--; //moving the pointer
        k=k/10;// removing last digit from k
    }
    if(carry>0){
        ans.add(carry);//add carry to array list
    }
    Collections.reverse(ans); //Reverse full array
    return ans;
  }  
  public static void main(String[] args) {
    
    System.out.println(addtwoarray(new int[]{2,9,4}, 181));
  }
}
