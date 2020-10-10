public class IntFunctions {
    /**
     * 最大公約数を求める実装
     * a >= 0, b >= 0, a >= bでなければならない。
     */
    private static int gcdImpl(int a, int b) {
        if (b == 0)
            return a;
        return gcdImpl(b, a % b);
    }

    /**
     * 最大公約数を求める
     * @return aとbの最大公約数。正の数である。
     */
    public static int gcd(int a, int b) {
        a = (a >= 0) ? a : -a;
        b = (b >= 0) ? b : -b;
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        return gcdImpl(a, b);
    }
}
