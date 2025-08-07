//pivot index leftsum==rightsum

public class Leet724 {
    public static int pivotindex(int nums[]){
        int rightsum=0;
        for(int ele:nums){
            rightsum+=ele;
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            rightsum -=nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(pivotindex(new int[]{1,7,3,6,5,6}));
    }
}
