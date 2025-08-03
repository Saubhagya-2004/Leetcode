//Average salary ex--[4000,3000,1000,2000]


public class Leet1491 {
    public static double Average(int nums[]){
      int min= nums[0];  //4000
      int max= nums[0];  //4000 
      int sum= nums[0];  //4000 
      for(int i=1;i<nums.length;i++){
        if(max<nums[i]){  //4000<3000
            max= nums[i];  //max=4000
        }
        else if(min>nums[i]){ //4000>3000 3000>1000 1000>2000 X
            min= nums[i];  //so min=3000 min=1000
        }
         sum= sum+nums[i]; //sum= 4000+3000+2000+1000
      }
      sum= sum-min-max;  ///10000-1000-4000=5000
      double ans= (double)sum/(nums.length-2); //=5000/length=4-2=5000/2 = 2500
      return ans; //2500
    }
    public static void main(String[] args) {
        System.out.println(Average(new int[]{4000,3000,1000,2000}));
    }
}
