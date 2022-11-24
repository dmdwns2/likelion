/*문제 1) 최대값 (중등1, 고등1)

<그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수가 주어질 때, 이들 중 최대값을 찾고 그 최대값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.



        예를 들어, 다음과 같이 81개의 수가 주어지면

        이들 중 최대값은 90이고, 이 값은 5행 7열에 위치한다.

        입력

        첫 째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 자연수가 주어진다. 주어지는 자연수는 100보다 작다.

        출력

        첫째 줄에 최대값을 출력하고, 둘째 줄에 최대값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다.

        답이 여러개인 경우 그 중 하나만 출력한다.(최대값이 두 개이상 존재하는 경우)*/

package Study221011_221014.Study221011.Study221012;

import java.util.Scanner;

public class MaxVal2 {
    public static void main(String[] args) {
        int max = 0;
        int indexk = 0;
        int indexl = 0;
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[9][9]; // 9x9

        // 한줄씩 받아서 2차원배열에 넣는 방법 (한번 짜두면 나중에 편함)
        for (int i = 0; i < 9; i++) {
            String str = sc.nextLine();
            String rows[] = str.split(" ");

            for (int r = 0; r < 9; r++){
                arr[i][r] = rows[r];

            }
        }
        // 비교하고 인덱스 저장 로직
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr.length; l++) {
                if (Integer.parseInt(arr[k][l]) > max) {
                    max = Integer.parseInt(arr[k][l]);
                    indexk = k;
                    indexl = l;
                }
            }
        }
        System.out.println(max);
        System.out.println((indexk + 1) + " " + (indexl + 1));

    }
}
