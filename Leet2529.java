//max count +ve and -ve int

public class Leet2529 {
    public static int maxnum(int nums[]){
        int n= nums.length;
        int positive=0;
            int negative=0;
        int max=0;
        if(nums.length==1){
            return 1;
        }
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                negative +=1;
            }
            else if(nums[i]>0){
                positive+=1;
            }
            
            max= Math.max(negative, positive); 
        }
        
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxnum(new int[]{5,20,66,1314}));
    }
}
