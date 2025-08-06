//Last Stone Weight
import java.util.Collections;
import java.util.PriorityQueue;

public class Leet1046 {
    public static int lastStoneweight(int []stones){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones){ //add in pq //2,7,4,1,8,1
            pq.add(ele);
        }
        while(pq.size()>1){//size 5>1 , 4>1,3>1
            int max= pq.remove();//8,4,2
            int smax = pq.remove();//7,2,1
            int newStone = max-smax;//1,2,1
            if(newStone!=0){//1!=0,2!=0,1!=0
                pq.add(newStone);//add into pq 1,2,1
            }
        }
        if(pq.size()==0){
            return 0;
        }
        else{
            return pq.remove();
        }

    }
    public static void main(String[] args) {
        System.out.println(lastStoneweight(new int[]{2,7,4,1,8,1}));
    }
}
