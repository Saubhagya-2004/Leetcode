// power of 2 means 2^1 2^2 2^3 2^4=16 2^5=32 2^6 =64

public class Leet231 {
    public static boolean powerofTwo(int n) {
        if (n == 1) {
            return true;
        } else if (n < 1) {
            return false;
        } else {
            while (n % 2 == 0) {
                n = n / 2;
            }
            if (n == 1) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        boolean res = powerofTwo(64);
        System.out.println(res);
    }
}
