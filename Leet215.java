//ex-[3,2,1,5,6,4]
//Kth Largest Element in an Array
import java.util.PriorityQueue;

public class Leet215{
    public static int findKthlargestnum(int nums[],int k){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(pq.size()<k){  //check here using priorityqueue pq<k value if not add that value and
                pq.add(nums[i]);
            }
            else if(pq.peek()<nums[i]){ //then check every value of stored Which is lowest and check every nums[i] add that if that is greater than peek
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        System.out.println(findKthlargestnum(new int[]{3,2,1,5,6,4}, 2));
    }
}