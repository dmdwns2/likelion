package Study221031_221104.Study221031;

/*
문제 설명

수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
제한 조건

    시험은 최대 10,000 문제로 구성되어있습니다.
    문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
    가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

 */
public class PrepareTest {
    public int[] solution(int[] answers) {
        int[] answer = {};

        String spj1 = "12345".repeat(4000);
        String spj2 = "21232425".repeat(1250);
        String spj3 = "3311224455".repeat(1000);


        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        // 정답 비교
        for (int i = 0; i < answers.length; i++) {

            if (spj1.charAt(i) == answers[i]) {
                cnt1 += 1;
            }
            if (spj2.charAt(i) == answers[i]) {
                cnt2 += 1;
            }
            if (spj3.charAt(i) == answers[i]) {
                cnt3 += 1;
            }
        }

        // 많이맞춘사람 출력

        int max = cnt1;
        if (cnt2 > max) max = cnt2;
        if (cnt3 > max) max = cnt3;
        if(cnt2 == cnt1 ) max = 10001; // 1와 2가 같고 최고점수일 경우
        if (cnt3 == cnt1) max = 10002; // 1과 3이 같고 최고점수
        if (cnt2 == cnt3 || cnt2 == max) max = 10003; // 2,3 이 같을 경우
        if (cnt2 == cnt3 || cnt1 == cnt2) max = 10004; // 모두 같을 경우

        if (max == 10001) System.out.println("[1,2]");
        else if (max == 10002) System.out.println("[1,3]");
        else if (max == 10003) System.out.println("[2,3]");
        else if (max == 10004) System.out.println("[1,2,3]");
        else System.out.println();

        //많이맞춘사람
        if

        return answer;
    }
}
