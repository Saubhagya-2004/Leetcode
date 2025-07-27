//Find First and Last Position of Element in Sorted Array
import java.util.Arrays;

public class Leet34 {
    public static int[] searchRange(int nums[],int target){
int ans[]={-1,-1};
if(nums.length==0){
return ans;
}
ans[0]=firstOccurance(nums,target);
ans[1]= lastOccurance(nums,target);
return ans;
    }
    public static int firstOccurance(int nums[],int target){
        int start =0;
        int end= nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target==nums[mid]){
                ans = mid;
                end = mid-1;
            }
            else if(target>nums[mid]){
                start= start+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static int lastOccurance(int nums[],int target){
        int start =0;
        int end= nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target==nums[mid]){
                ans = mid;
                start= mid+1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{

                end= mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8)));
    }
}
