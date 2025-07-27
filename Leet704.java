//Binary search o(logn) -worst time complex

public class Leet704 {
    public static int Search(int nums[],int target){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target>nums[mid]){
                start= mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println((Search(new int[]{-1,0,3,5,9,12}, 9)));
    }
}
