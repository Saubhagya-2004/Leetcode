//Maximum Subarray using o(n) time clxity

public class Leet53 {
    public static int MaxsubArray(int nums[]){
        int cursum= nums[0];
        int maxsum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(cursum+nums[i]>nums[i]){
                cursum= cursum+nums[i];
            }
            else{
                cursum= nums[i];
            }
            maxsum= Math.max(cursum,maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
   System.out.println(MaxsubArray(new int[]{5}));
    }
}
