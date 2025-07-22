// Remove Element
import java.util.Arrays;

public class Leet27 {
    public static int removal(int nums[],int value){
    int ptr = 0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=value){
            nums[ptr]=nums[i];
            ptr++;
        }
    }
    return ptr;
}
public static void main(String[] args) {
    Leet27 obj = new Leet27();
    int nums[]={1,5,4,5,8,9};
   int res= obj.removal(nums, 5);
   System.out.println(res);
   for(int i=0;i<res;i++){
    System.out.print(nums[i]+" ");
   }
   
}
}
