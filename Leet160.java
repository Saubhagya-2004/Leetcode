//Intersection of Two Linked Lists
public class Leet160 {
    int value;
    Leet160 next;
    Leet160(int x){
        value = x;
        next = null;
    }
    Leet160(int x, Leet160 nextNode) {
        value = x;
        next = nextNode;
    }
    public static int sizell(Leet160 head) {
    int count=0;
    Leet160 ptr= head;
    while(ptr!=null){
        count++;
        ptr= ptr.next;
    }
    return count;
        
    }
    public static Leet160 getintersectionNode(Leet160 headA,Leet160 headB){
        if(headA==null || headB==null){
            return null;
        }
        int size1= sizell(headA);
        int size2 = sizell(headB);
        int diff=(size1-size2);
        Leet160 ptr1= headA;
        Leet160 ptr2 = headB;
        if(diff>0){
            while(diff>0){
                ptr1= ptr1.next;
                diff--;
            }
        }else{
            while (diff<0) {
                ptr2=ptr2.next;
                diff++;
            }
        }
        while(ptr1!=ptr2){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return ptr1;
    }
    public static void main(String[] args){
        Leet160 l1= new Leet160(4,new Leet160(5,new Leet160(6,new Leet160(7,new Leet160(8)))));
        Leet160 l2 = new Leet160(4,new Leet160(2,new Leet160(3,l1)));
        System.out.println(getintersectionNode(l1,l2).value);
    }
}
