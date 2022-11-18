package Study221114_221118.Study221118;

public class MatrixAdd {
    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = {};

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            return answer;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] arr1 = {
                {1, 2}, {2, 3}
        };
        int[][] arr2 = {
                {3, 4}, {5, 6}
        };

        solution.solution(arr1, arr2);
    }
}
