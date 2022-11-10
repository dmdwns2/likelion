package Study221107_221111.Study221110;

import java.util.Stack;

public class DontSameNumberWithStack {
    public Object[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) ;
            else stack.push(arr[i]);
        }

        Object[] answer = stack.toArray();
        return answer;
    }
}
