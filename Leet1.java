public class Leet1 {
    public static int[] twosum(int num[],int target){
        int ans[]=new int[2];
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }        
               }
            }
            
            return ans;
    }
    public static void main(String[] args) {
        int num[]={1,2,4,6};
        int target =8;
       int result[]= twosum(num,target);
        System.out.println("["+num[result[0]] +" "+ num[result[1]] +"]");
    }
}
