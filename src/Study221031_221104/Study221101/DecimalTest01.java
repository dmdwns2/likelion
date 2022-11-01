package Study221031_221104.Study221101;

/*
실습1
13, 17, 19, 23 이 소수인지 판별하는 알고리즘을 만들어 보고 소수인지 구해 보세요.
 */
public class DecimalTest01 {
    public boolean isDecimal(int num) {
        for (int i = 1; i < num; i++) {
            if(num % i == 0) return true;
        }

        return false;
    }
}
