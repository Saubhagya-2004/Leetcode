//isanagram
public class Leet242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;// for s
            freq[t.charAt(i) - 'a']--; // for t

        }
        for (int count : freq) {
            if (count != 0)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
