//maxpower
public class Leet1446 {
    public static int Maxpower(String s){
        int count =1;
        int maxcount =1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                maxcount =Math.max(maxcount, count);
            }
            else{
                count=1;
            }
        }
        return maxcount;
    }
    public static void main(String[] args) {
        System.out.println(Maxpower("abbcccddddeeeeedcba"));
    }
}
