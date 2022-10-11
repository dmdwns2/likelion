package Study221011;

public class SumOfDigit {
    public int solution(int n) {
        int result = 0;
                result += n%10;
            for (int i = 0; i < 10; i++) {
                n = n/10;
                result += n%10;
            }
        System.out.println(result);
            return result;
    }

    public static void main(String[] args) {
        // 687 = 6 + 8 + 7 = 21 나오게 짜면 된다.자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
        //예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
        SumOfDigit sod = new SumOfDigit();
        int val1 = 1234324; // 1 + 2 + 3 + 4 = 10
        int result1 = sod.solution(val1);

        if (result1 == 10) {
            System.out.println("테스트 통과했습니다.");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
