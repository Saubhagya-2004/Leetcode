import java.util.*;
public class Leet977 {
    public static int[] sortedsqure(int nums[]){
        Arrays.sort(nums);
        int ans[] = new int[nums.length];
        int start =0;
        int end = nums.length-1;
        int ptr = ans.length-1;
        while(start<=end){
            int startsqure = nums[start]*nums[start];
            int endsqure = nums[end]*nums[end];
            if(startsqure>endsqure){
                ans[ptr] = startsqure;
                start++;
            }
            else{
                ans[ptr]= endsqure;
                end--;
            }
            ptr--;
        }
        return ans;
    }
    public static void main(String[] args) {
    int res[] =sortedsqure(new int[]{0,1,9,16,-5,100});
     System.out.println(Arrays.toString(res));
    }
}
