// Fibonacci Number
//n=4 ft=0 st=1 tt=(0+1)1   i=0 st comes to ft and st comes to tt
// i=1 ft=1 st=2 tt=2
//i=2 ft=2 st=3 tt=3
//i=3 ft=3 st =5 tt=5

public class Leet509 {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            int firstTerm=0;
            int secondTerm =1;
            for(int i=0;i<n;i++){
                int thirdTerm = firstTerm+secondTerm;
                firstTerm= secondTerm;
                secondTerm= thirdTerm;
            }
            return firstTerm;
        }
    }
    public static void main(String[] args) {
        int res = fibonacci(4);
        System.out.println(res);
    }
}
