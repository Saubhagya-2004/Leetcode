//find median of 2 sorted array
public class Leet4{
    
    public double findmedianofsortedarray(int []num1,int []num2){
        //median
        int []ans= merge(num1,num2);
        if(ans.length%2==0){
            double res = (double)(ans[ans.length/2]+ans[ans.length/2-1])/2;
            return res;
        }
        else{
            double res = (double)(ans[ans.length/2]);
            return res;
        }
    }
    public int []merge(int arr1[],int arr2[]){
        //sorting
        int p1=0;
        int p2=0;
        int p3=0;
        int []ans=new int[arr1.length+arr2.length];
        while(p1<arr1.length|| p2<arr2.length){
            int val1 = (p1<arr1.length?arr1[p1]:Integer.MAX_VALUE);
            int val2 = (p2<arr2.length?arr2[p2]:Integer.MAX_VALUE);
            if(val1<val2){
                ans[p3]=val1;
                p1++;
            }
            else{
                ans[p3]=val2;
                p2++;
            }
            p3++;
        }
        return ans;
    }
    public static void main(String[] args) {
       Leet4 obj = new Leet4();
       int array1[] = {1,3,5};
       int array2[] ={6,8,9};
       double median = obj.findmedianofsortedarray(array1, array2);
       System.out.println(median);

    }
}