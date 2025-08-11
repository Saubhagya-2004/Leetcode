//Redistribute Characters to Make All Strings Equal
public class Leet1897 {
    public static boolean makeEqual(String words[]){
        int [] fre = new int[26];
        for(int i=0;i<words.length;i++){
            String w= words[i];
            for(int j=0;j<w.length();j++){
                char ch = w.charAt(j);
                int idx= (int)(ch-'a');
                fre[idx]= fre[idx]+1;
            }

        }
        for(int i=0;i<fre.length;i++){
            if(fre[i]%words.length!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(makeEqual(new String[]{"abc","abc","abc"}));
    }
}
