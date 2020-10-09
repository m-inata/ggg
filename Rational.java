/**
 * 分数を表現するクラス
 */
public class Rational {
    private final int numerator;
    private final int denominator;

    /**
     * プライマリコンストラクタ
     * @param numerator 分子
     * @param denominator 分母
     */
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * デフォルトコンストラクタ
     * 零を表す分数を構築
     */
    public Rational() {
        this(0, 1)
    }

    /**
     * 文字列表現を返す
     * @return この分数の文字列表現
     */
    @Override
    public String toString() {
        return "" + numerator + "/" + denominator
    }
}
