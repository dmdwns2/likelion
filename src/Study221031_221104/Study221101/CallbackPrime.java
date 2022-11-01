package Study221031_221104.Study221101;

/*
실습1
13, 17, 19, 23 이 소수인지 판별하는 알고리즘을 만들어 보고 소수인지 구해 보세요.
 */

interface StatementStrategy {
    boolean compare(int i, int num);
}

public class CallbackPrime {


    public boolean isDecimal(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            if (num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return false;
            }
        }
        System.out.println("소수입니다.");
        return true;
    }


    public static void main(String[] args) {
        CallbackPrime cb = new CallbackPrime();
        cb.isDecimal(13, (i, num)-> i < num);
        cb.isDecimal(13, (i, num)-> i <= num/2);
        cb.isDecimal(13, (i, num)-> i * i < num);
    }
}
