// Find Lucky Integer in an Array using hashmap  

import java.util.HashMap;

public class Leet1394 {
    public static int finfLucky(int nums[]){
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ele =nums[i];
            if(hm.containsKey(ele)==true){
                hm.put(ele, hm.get(ele)+1);
            }
            else{
                hm.put(ele, 1);
            }
        }
        int ans =-1;
        for(int key:hm.keySet()){
            if(hm.get(key)==key){
                ans= Math.max(ans, key);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(finfLucky(new int[]{2,2,2,3,3}));
    }
}
