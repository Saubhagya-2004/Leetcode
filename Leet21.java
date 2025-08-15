//  Merge Two Sorted Lists
public class Leet21 {
    int value;
    Leet21 next;

    Leet21(int value) {
        this.value = value;
    }

    Leet21(int value, Leet21 next) {
        this.value = value;
        this.next = next;
    }

    public static Leet21  mergeTwolists(Leet21 list1, Leet21 list2) {
        Leet21 dummy = new Leet21(-1);
        Leet21 ans = dummy;
        Leet21 part1 = list1;
        Leet21 part2 = list2;
        while (part1 != null && part2 != null) {
            if (part1.value < part2.value) {
                dummy.next = part1;
                part1 = part1.next;
                dummy = dummy.next;
            } else {
                dummy.next = part2;
                part2 = part2.next;
                dummy = dummy.next;
            }
        }
        if (part1 == null) {
            dummy.next = part2;
        } else {
            dummy.next = part1;
        }
        return ans.next;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Leet21 current = this;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) sb.append(" -> ");
            current = current.next;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Leet21 list1 = new Leet21(1, new Leet21(3, new Leet21(5)));

        Leet21 list2 = new Leet21(2, new Leet21(4, new Leet21(6)));

        Leet21 merged = mergeTwolists(list1, list2);
        System.out.println(merged);
    }
}
