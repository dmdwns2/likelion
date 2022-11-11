package Study221107_221111.Study221111;

// 몇번 실행 했고 0이 몇번 지워졌냐
public class ToBinary {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int numOfZero = 0;
        int cnt = 0;

        while(true){
            cnt++;
            numOfZero += s.length() - s.replace("0", "").length();
            s = Integer.toBinaryString(s.replace("0", "").length());
            if(Integer.parseInt(s) == 1) break;
        }

        answer[0] = cnt;
        answer[1] = numOfZero;
        return answer;
    }
}
