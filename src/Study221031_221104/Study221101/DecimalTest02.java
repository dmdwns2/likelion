package Study221031_221104.Study221101;

/*
실습1
13, 17, 19, 23 이 소수인지 판별하는 알고리즘을 만들어 보고 소수인지 구해 보세요.

2번째 방법인 num/2까지만 구하는 방법
 */
public class DecimalTest02 {
    public boolean isDecimal(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return false;
            }
        }
        System.out.println("소수입니다.");
        return true;
    }

    public static void main(String[] args) {
        DecimalTest02 decimalTest02 = new DecimalTest02();
        decimalTest02.isDecimal(13);
        decimalTest02.isDecimal(17);
        decimalTest02.isDecimal(19);
        decimalTest02.isDecimal(23);
    }
}
