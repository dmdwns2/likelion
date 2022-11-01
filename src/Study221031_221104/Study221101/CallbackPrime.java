package Study221031_221104.Study221101;

/*
실습1
13, 17, 19, 23 이 소수인지 판별하는 알고리즘을 만들어 보고 소수인지 구해 보세요.
 */
public class CallbackPrime {

    interface Callback {
        boolean compare(int i, int num);
    }
    public boolean isDecimal(int num) {
        for (int i = 2; compare(i, num); i++) {
            if (num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return false;
            }
        }
        System.out.println("소수입니다.");
        return true;
    }
    public boolean compare(int i, int num){
        if(i < num) return true;
        else return false;
    }

    public static void main(String[] args) {
        CallbackPrime decimalTest02 = new CallbackPrime();
        decimalTest02.isDecimal(13);
        decimalTest02.isDecimal(17);
        decimalTest02.isDecimal(19);
        decimalTest02.isDecimal(23);
    }
}
