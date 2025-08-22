//removeElements
public class Leet203 {
    int val;
    Leet203 next;
    Leet203(int val){
        this.val= val;
    }
    Leet203(int val,Leet203 next){
        this.val= val;
        this.next= next;
    }
    
    public static Leet203 deleteElement(Leet203 head,int val){
        Leet203 dummy= new Leet203(-1);
        dummy.next= head;
        Leet203 curr= dummy;
        if(head==null){
            return null;
        }
        while (curr.next!=null) {
            if(curr.next.val==val){
                curr.next= curr.next.next;

            }else{
                curr= curr.next;
            }
        }
        return dummy.next;

    }
    public static void printlist(Leet203 head){
        Leet203 curr= head;
        while(curr!=null){
            System.out.print(curr.val+"-->");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Leet203 head=new Leet203(5,new Leet203(9,new Leet203(8, new Leet203(9,new Leet203(6)))));
         System.out.println("original list ->");
        printlist(head);
        System.out.println("Deleted List");
        head= deleteElement(head, 9);
        printlist(head);
    }
}
