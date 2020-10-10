/**
 * 分数を表現するクラス
 */
public class Rational {
    private final int numerator;
    private final int denominator;

    /**
     * 分子のゲッター
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * 分母のゲッター
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * プライマリコンストラクタ
     * @param numerator 分子
     * @param denominator 分母
     */
    public Rational(int numerator, int denominator) {
        if (numerator == 0 && denominator == 0)
            throw new ArithmeticException("Denominator cannot be 0.");

        int g = IntFunctions.gcd(numerator, denominator);
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }

        this.numerator = numerator / g;
        this.denominator = denominator / g;
    }

    /**
     * デフォルトコンストラクタ
     * 零を表す分数を構築
     */
    public Rational() {
        this(0, 1);
    }

    /**
     * 文字列表現を返す
     * @return この分数の文字列表現
     */
    @Override
    public String toString() {
        return "" + numerator + "/" + denominator;
    }
}
