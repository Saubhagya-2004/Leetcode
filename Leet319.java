//bulb switcher
public class Leet319 {
    public static int bulbswitcher(int n){
        int count=0;
        int i=1;
        while(i*i<=n){
            count++;
            i++;
        }
        return count;
    }
public static void main(String[] args) {
    System.out.println(bulbswitcher(10));
}
}
