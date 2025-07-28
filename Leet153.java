//Find Minimum in Rotated Sorted Array

public class Leet153 {
    public static int findmin(int nums[]){
        if(nums.length==1){
            return nums[0];
        }else if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid!=0&&nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            else if(nums[mid]!=nums.length-1&& nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if(nums[start]<nums[mid]){
                start = mid+1;;
            }
            end= mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findmin(new int[]{4,5,6,7,0,1,2}));
    }
}
