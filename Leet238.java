//productExceptself except that other value product

import java.util.Arrays;

public class Leet238 {
    public static int []productExceptself(int [] nums){
        int n= nums.length;
        int pro =1;
        int right[] = new int[n];
        for(int i= n-1;i>0;i--){
            pro = pro*nums[i];
            right[i]=pro;
        }
        int left =1;
        int ans[] = new int[n];
        for(int i=0;i<n-1;i++){
            int val = left*right[i+1];
            ans[i]=val;
            left = left*nums[i];
        }
        ans[n-1]= left;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptself(new int[]{1,2,3,4})));
    }
}
