public class Leet268 {
    public static int missingnum (int nums[]){
        int Range = nums.length;
        int actualsum= (Range*(Range+1))/2;   //n*(n+1)/2
        //actual sum when the missing number is present in the array
        int cursum=0;
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
        }
        int res = actualsum-cursum;
        return res;
    }
    public static void main(String[] args) {
        int res = missingnum(new int []{4,5,2,1,0}) ;
        System.out.println(res);
    }
}
