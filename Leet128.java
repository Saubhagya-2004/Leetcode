//Longest Consecutive Sequence

import java.util.*;

public class Leet128 {
    public static int longestconsequative(int nums[]){
        HashMap<Integer,Boolean> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],false );
        }
        for(int key:hm.keySet()){
            if(hm.containsKey(key-1)==false){ //if key-1 not present then it convert to true
                hm.put(key, true);
            }
        }
        int max=0;
        for(int key:hm.keySet()){
            int k=1;
            if(hm.get(key)==true){ //then it check only true vakue
                while (hm.containsKey(key+k)==true) {  //if true value+1 value present then k++
                    k++;
                }
            }
            max= Math.max(max, k); //define max
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(longestconsequative(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
}
