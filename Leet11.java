//Container With Most Water contain max water

import java.util.Arrays;

public class Leet11 {
    public static int Maxwatercontain(int height[]){
        int start =0;
        int end= height.length-1;
        int maxcap=0;
        while(start<end){
            int minheight = Math.min(height[start], height[end]);
            int width= end-start;
            int currentcapacity= minheight*width;
            maxcap= Math.max(maxcap, currentcapacity);
            if(height[start]<height[end]){
                start++;

            }
            else{
                end--;
            }
        }
        return maxcap;
    }
    public static void main(String[] args) {
        System.out.println((Maxwatercontain(new int[]{1,8,6,2,5,4,8,3,7}) ));
    }
}
