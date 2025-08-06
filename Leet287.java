//find duplicate

public class Leet287 {
    public static int Duplicate(int nums[]){
        int n= nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(Duplicate(new int[]{1,3,4,2,2}));
    }
}
