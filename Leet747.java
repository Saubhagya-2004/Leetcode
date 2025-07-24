//Largest Number At Least Twice of Others
//given an array each num *2 is lessor equal to highest num of array return its index oe else return -1

public class Leet747 {
    public static int dominantindex(int nums[]){
        int n= nums.length;
        int max=-1;
        int smax=-1;
        int maxindex=0;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                smax= max;
                max= nums[i];
                maxindex=i;
            }
            else if(smax<nums[i]){
                smax= nums[i];
            }
        }
        if(smax*2<=max){
            return maxindex;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(dominantindex(new int[]{2,3,16,8}));
    }
}
