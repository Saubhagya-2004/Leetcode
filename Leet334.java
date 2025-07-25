//Increasing Triplet Subsequence give this code for all cases

public class Leet334 {
    public static boolean increasingtriple(int nums[]){
      int first = Integer.MAX_VALUE;
      int second = Integer.MAX_VALUE;
      int third = Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++){
        int element = nums[i];
        if(first>=element){
            first =element;
        }
        else if(second>=element){
            second= element;
        }
        else{
            third= element;
            return true;
        }
      }
      return false;
      
    }
    public static void main(String[] args) {
        System.out.println(increasingtriple(new int[]{1,2,3,4,5}));
    }
}
