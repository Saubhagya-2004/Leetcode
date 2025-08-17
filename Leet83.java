//remove duplicate from sorted list
public class Leet83 {
    int value;
    Leet83 next;
    Leet83 (int value){
        this.value=value;
    }
    Leet83(int value,Leet83 next){
        this.value=value;
        this.next = next;
    }
    public static Leet83 deleteDuplicate(Leet83 head){
        if(head==null|| head.next==null){
            return head;
        }
        Leet83 dummy = new Leet83(head.value);
        Leet83 ans = dummy;
        Leet83 ptr = head.next;
        while (ptr!=null) {
            if(ptr.value!=dummy.value){
                Leet83 temp = new Leet83(ptr.value);
                dummy.next= temp;
                dummy= dummy.next;

            }
            ptr= ptr.next;
        }
        return ans;
    }
    public static void printlist(Leet83 head){
        while (head!=null) {
            System.out.print(head.value+"");
            head= head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
         Leet83 head = new Leet83(1, new Leet83(1, new Leet83(2, new Leet83(3, new Leet83(3)))));

        System.out.print("Original list: ");
       printlist(head);

      head=deleteDuplicate(head);

        System.out.print("After removing duplicates: ");
        printlist(head);
    }
}
