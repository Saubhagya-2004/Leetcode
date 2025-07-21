// same as fibonacci leet 509 just add 
public class Leet1137 {
    public static int trifibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            int firstTerm =0;
            int secondTerm =1;
            int thirdTerm =1;
            for(int i=0;i<n;i++){
                int fourterm = firstTerm+secondTerm+thirdTerm;
                firstTerm= secondTerm;
                secondTerm= thirdTerm;
                thirdTerm= fourterm;
            }
            return firstTerm;
        }
    }
    public static void main(String[] args) {
        int res =trifibonacci(4);
        System.out.println(res);
    }
}
