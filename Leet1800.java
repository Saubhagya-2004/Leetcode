// Maximum Ascending Subarray Sum [12,17,15,13,10,11,12] asceding order sum
// Output: 33
public class Leet1800 {
    public static int maxAscendingSum(int nums[]){
        int max=nums[0];
        int curmax = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                curmax= curmax+nums[i];
            }
            else{
                max= Math.max(curmax, max);
                curmax=nums[i];
            }
        }
        max= Math.max(max, curmax);
        return max;
    }
    public static void main(String[] args) {
        System.out.println((maxAscendingSum(new int[]{10,20,30,5,10,50})));
    }
}
