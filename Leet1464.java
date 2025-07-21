// Maximum Product of Two Elements in an Array
//Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

public class Leet1464 {
    public static int maxproduct(int nums[]) {
        int max = -1;
        int smax = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }
         if (nums.length == 1) {
            smax = max;
        }
         int res= (max-1)*(smax-1);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxproduct(new int[] { 2 ,5}));
    }
}
