public class Leet2181 {
    int value;
    Leet2181 next;
    Leet2181 (int value){
        this.value= value;
    }
    Leet2181(int value,Leet2181 next){
        this.value=value;
        this.next= next;
    }
    public static Leet2181 mergeNodes(Leet2181 head){
        Leet2181 dummy = new Leet2181(-1);
        Leet2181 ans = dummy;
        Leet2181 current = head.next;
        int sum=0;
        while(current!=null){
            if(current.value!=0){
               sum+=current.value;
            }
            else{
                Leet2181 temp = new Leet2181(sum);
                dummy.next= temp;
                dummy= dummy.next;
                sum=0;
            }
            current= current.next;
        }
        return ans.next;
        }
        public static void printlist(Leet2181 head){
            Leet2181 current = head;
            while (current!=null) {
                System.out.print(current.value+"-->");
                current= current.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Leet2181 head = new Leet2181(0,new Leet2181(8,new Leet2181(2, new Leet2181(0,new Leet2181(7, new Leet2181(0))))));
            System.out.println("Original list -->");
            printlist(head);
            System.out.println("Merged nodes -->");
            printlist(mergeNodes(head));
        }
    
}
