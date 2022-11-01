package Study221031_221104.Study221101;

/*
실습1
13, 17, 19, 23 이 소수인지 판별하는 알고리즘을 만들어 보고 소수인지 구해 보세요.
 */
public class DecimalTest01 {
    public boolean isDecimal(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return false;
            }
        }
        System.out.println("소수입니다.");
        return true;
    }

    public static void main(String[] args) {
        DecimalTest01 decimalTest01 = new DecimalTest01();
        decimalTest01.isDecimal(13);
        decimalTest01.isDecimal(17);
        decimalTest01.isDecimal(19);
        decimalTest01.isDecimal(23);
    }
}
