// Boats to Save People
import java.util.Arrays;

public class Leet881 {
    public static int numReescueboats(int nums[],int limits){
       Arrays.sort(nums);//sort--> 1,2,2,3
      int start=0;//1,2
      int end=nums.length-1;//3,2,2
      int count=0;//0,1,2,3
      while (start<=end) {//1<3
        if(nums[start]+nums[end]<=limits){//1+3<=3 x,1+2<=3,2+2<=3x
            start++;//2
            end--;//2
        }
        else{
            end--;//2,out of loop
        }
        count++;//1,2,3
      }
      return count;//3
    }
    public static void main(String[] args) {
        System.out.println(numReescueboats(new int[]{3,2,2,1}, 3));
    }
}
