package Study221107_221111.Study221110;

public class DontSameNumber {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int index = 1;
        for (int i = 1; i < arr.length; i++){
            answer[0] = arr[0];
            if (arr[i] == arr[i-1]) index--;
            else answer[index] = arr[i];
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        DontSameNumber ds = new DontSameNumber();

        int[] arr = {1,1,3,3,0,1,1};
        ds.solution(arr);
    }
}
