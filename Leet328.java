//re-arrange odd-even  arrange odd first then even like indexwise first 1,3,5,2,4,6
public class Leet328 {
     int value;
    Leet328 next;
    Leet328 (int value){
        this.value=value;
    }
    Leet328(int value,Leet328 next){
        this.value=value;
        this.next = next;
    }
    public static Leet328 oddevenlist(Leet328 head){
        Leet328 oddh= head;
        Leet328 evenh= head.next;
        Leet328 evenstart= evenh;
        while(evenh!=null&& evenh.next!=null){
            oddh.next= oddh.next.next;
            evenh.next= evenh.next.next;
            oddh=oddh.next;
            evenh= evenh.next;
        }
        oddh.next=evenstart;
        return head;
    }
    public static void printlist( Leet328 head){
        Leet328 curr= head;
        while(curr!=null){
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Leet328 head = new Leet328(1,new Leet328(5, new Leet328(9,new Leet328(7,new Leet328(3, new Leet328(6,null))))));
        System.out.println("Original list");
        printlist(head);
        System.out.println("Oddeven re-arrangement list");
        printlist(oddevenlist(head));
    }
}
