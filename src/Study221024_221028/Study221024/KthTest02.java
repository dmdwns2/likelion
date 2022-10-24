package Study221024_221028.Study221024;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthTest02 {
    public int[] solution(int[] arr, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            // 우선순위 큐에 from, to까지 넣기
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                pq.add(arr[j]);
            }
            // 정렬이 되었기 때문에 뽑기만 한다.
            for (int j = 0; j < commands[i][2]; j++) {
                answer[i] = pq.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        KthTest02 kthNum = new KthTest02();
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(kthNum.solution(arr, commands)));
        ;
    }
}