//Two Sum II - Input Array Is Sorted two sum index add with 1 ex- [0,1] final res 0+1,1+1=[1,2]
import java.util.Arrays;

public class Leet167{
public static int[] twosumsorted(int numbers[],int target){
    int ans[] = new int[2];
    int start=0;
    int end= numbers.length-1;
    while(start<end){
        int sum = numbers[start]+numbers[end];
        if(sum>target){
            end--;

        }else if(sum==target){
            ans[0]= start+1;
            ans[1]= end+1;
            return ans;
        }
        else{
            start++;
        }
    }
    return ans;
}
public static void main(String[] args) {
    System.out.println(Arrays.toString(twosumsorted(new int[]{2,4,6,7},10)));
}
}