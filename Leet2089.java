//Find Target Indices After Sorting Array given a arr and sort that how many times target ele present inside that arr
//ex[1,2,5,2,3]
import java.util.*;
public class Leet2089 {
    public static List<Integer> targetindices(int nums[],int target){
        int num=0;
        int targetcount=0;
        for(int ele:nums){ //check foreachloop
            if(ele==target){//1by one ele==target then targetcount++
                targetcount++;
            }
            else if(ele<target){//if element <target then num++
                num++;
            }
        }
        List<Integer> ans = new ArrayList<>(); //create new arraylist store
        while(targetcount>0){ //when targetcount>0
            ans.add(num);//add into new ans arraylist that num
            num++; 
            targetcount--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int res[]= new int[]{1,2,5,2,3};
        System.out.println(targetindices(res, 2));
    }
}
