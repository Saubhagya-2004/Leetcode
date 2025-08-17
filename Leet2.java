//Add Two Numbers
public class Leet2 {
    int value;
    Leet2 next;
    Leet2 (int value){
        this.value=value;
    }
    Leet2(int value,Leet2 next){
        this.value=value;
        this.next = next;
    }
    public static Leet2 addTwonumber (Leet2 l1,Leet2 l2){
        if(l1==null){
            return l2;

        }else if(l2==null){
            return l1;
        }
        Leet2 dummy = new Leet2(-1);
        int carry=0;
        Leet2 ans = dummy;
        Leet2 ptr1 = l1;
        Leet2 ptr2 = l2;
        while(ptr1!=null || ptr2!=null){
            int val1= ptr1!=null?ptr1.value:0;
            int val2= ptr2!=null?ptr2.value:0;
            int sum= val1+val2+carry;
            int d= sum%10; //get last digit ex:- 10 d=0
            carry=sum/10;
            Leet2 temp = new Leet2(d);
            dummy.next=temp;
            dummy= dummy.next;
            ptr1= ptr1!=null?ptr1.next:null;
            ptr2= ptr2!=null?ptr2.next:null;
        }
        if(carry>0){
            Leet2 temp = new Leet2(carry);
             dummy.next=temp;
            dummy= dummy.next;
        }
        return ans.next;
    }
    public static void printlist(Leet2 head){
        while(head!=null){
            System.out.print(head.value+"");
            head= head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Leet2 l1= new Leet2(2,new Leet2(3,new Leet2(4)));
        Leet2 l2= new Leet2(6,new Leet2(4,new Leet2(9)));
        System.out.print("List 1: ");
        printlist(l1);
        System.out.print("List 2: ");
        printlist(l2);

        Leet2 result = addTwonumber(l1, l2);

        System.out.print("Sum: ");
        printlist(result);
    }
}
