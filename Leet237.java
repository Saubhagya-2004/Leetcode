//deleteNode
public class Leet237 {
     int val;
    Leet237 next;

    Leet237() {}
    Leet237(int val) { this.val = val; }
    Leet237(int val, Leet237 next) { this.val = val; this.next = next; }
    public static void deleteNode(Leet237 node){
       node .val= node.next.val;
       node.next= node.next.next;
    }
    public static void printlist(Leet237 head){
        Leet237 curr = head;
        while (curr!=null) {
            System.out.print(curr.val+ "-->");
            curr= curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Leet237 head = new Leet237(5,new Leet237(8,new Leet237(7, new Leet237(2))));
        System.out.println("original list ->");
        printlist(head);
        System.out.println("Deleted new List->");
        Leet237 nodetoDelete = head.next;
        deleteNode(nodetoDelete);
        printlist((head));
    }
}
