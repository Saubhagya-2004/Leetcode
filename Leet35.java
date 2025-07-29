//Search Insert Position
public class Leet35 {
    public static int searchinsert(int nums[],int target){
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        System.out.println(searchinsert(new int[]{1,3,5,6}, 4));
    }
}
