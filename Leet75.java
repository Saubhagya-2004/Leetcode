//dutch national flag [0,1,2]

import java.util.Arrays;

public class Leet75 {
    public static void sortcolors(int nums[]){
        int low=0;
        int mid=0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public static void swap(int nums[],int i,int j){
        int k= nums[i];
        nums[i]= nums[j];
        nums[j]=k;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,0,2,1,1,0};
        sortcolors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
