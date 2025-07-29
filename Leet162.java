//find peak element with O(logn) binary search wrost case time complex..

public class Leet162 {
    public static int findpeakelement(int nums[]){
        if(nums.length==1){
            return 0;
        }
        else if(nums.length-1>nums.length-2){
            return nums.length-1;
        }
        else{
            int start =1;
            int end= nums.length-2;
            while(start<=end){
                int mid= (start+end)/2;
                if(nums[mid]>nums[mid-1]&& nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if(nums[mid]<nums[mid+1]){
                    end= mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findpeakelement(new int[]{1,2,1,3,5,6,4}));
    }
}
