package Study221114_221118.Study221118;

public class MatrixMul {
    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr2[0].length];

            for (int i = 0; i < arr1.length; i++) { // 뒤쪽의 열 개수
                for (int j = 0; j < arr2[0].length; j++) { // 앞쪽의 행 개수
                    for(int k = 0; k < arr1[0].length; k++) //뒤쪽의 행 개수
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }

            return answer;
        }
    }
    public static void main(String[] args) {
        MatrixAdd.Solution solution = new MatrixAdd.Solution();

        int[][] arr1 = {
                {1, 2}, {2, 3}
        };
        int[][] arr2 = {
                {3, 4}, {5, 6}
        };

        solution.solution(arr1, arr2);
    }
}
