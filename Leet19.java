// /removenthFromend
public class Leet19 {
    int val;
    Leet19 next;

    Leet19() {}
    Leet19(int val) { this.val = val; }
    Leet19(int val, Leet19 next) { this.val = val; this.next = next; }

    public static Leet19 removenthFromend(Leet19 head, int n) {
        if (head == null) return null;

        Leet19 dummy = new Leet19(0, head); 
        Leet19 fast = dummy;
        Leet19 slow = dummy;

    
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        
        slow.next = slow.next.next;

        return dummy.next; 
    }

    public static void printList(Leet19 head) {
        Leet19 curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Leet19 head = new Leet19(1,
                        new Leet19(2,
                        new Leet19(3,
                        new Leet19(4,
                        new Leet19(5)))));

        System.out.println("Original List:");
        printList(head);

        head = removenthFromend(head, 2);

        System.out.println("After removing 2nd node from end:");
        printList(head);
    }
}
