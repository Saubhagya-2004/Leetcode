//Plus One

import java.util.Arrays;

public class Leet66 {
    public static int[] PlusOne(int nums[]){
         int n= nums.length;
         if(nums[n-1]!=9){
            nums[n-1]= nums[n-1]+1;
            return nums;
         }
         nums[n-1]=0;
         for(int i=n-2;i>=0;i--){
            if(nums[i]!=9){
                nums[i]=nums[i]+1;
                return nums;
            }
            nums[i]=0;
         }
         int ans[]= new int[n+1];
         ans[0]=1;
         return ans;
    }
    public static void main(String[] args) {
        int res[]= PlusOne(new int[]{9,9,9});
        System.out.println(Arrays.toString(res));
    }
}
