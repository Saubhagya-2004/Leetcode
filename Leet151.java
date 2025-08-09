// Reverse Words in a String
public class Leet151 {
    public static String reversewords(String s){
        String [] arr = s.split("\\s+");//\\-skip s-space +-multiply
        StringBuilder sb = new StringBuilder("");
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]+" ");
        }
        String ans = sb.toString();
        ans = ans.trim();
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reversewords("The sky is Blue "));
    }
}
