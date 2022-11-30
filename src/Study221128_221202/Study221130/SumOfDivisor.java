package Study221128_221202.Study221130;

public class SumOfDivisor {
    public int solution(int n) {
        int answer = 0;


        for(int i =1; i <= n ; i++){
           if( n % i  == 0) {
               answer += i;
           }
        }

        return answer;
    }
}
