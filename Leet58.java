//  Length of Last Word

public class Leet58 {
   public static int lengthoflastword(String s){
    int count =0;
    for(int i=s.length()-1;i>=0;i--){
        char ch = s.charAt(i);
        if(ch!= ' '){ //not count space
            count++;
        }
        else if(count!=0){ //if already last word exist break loop
            break;
        }
    }
    return count;
   } 
   public static void main(String[] args) {
    System.out.println(lengthoflastword("Hello world   "));
   }
}
