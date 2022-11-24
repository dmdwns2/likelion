/*
9개의 서로 다른 자연수가 주어질 때, 이들 중 최대값을 찾고 그 최대값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
        예를 들어, 서로 다른 9개의 자연수

        3, 29, 38, 12, 57, 74, 40, 85, 61

        이 주어지면 이들 중 최대값은 85이고, 이 값은 8번째 수이다.

        입력

        첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100보다 작다

        출력

        첫째 줄에 최대값을 출력하고, 둘째 줄에 최대값이 몇 번째 수인지를 출력한다.
*/

        package Study221011_221014.Study221011.Study221012;

import java.util.Scanner;

public class MaxVal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] > max) {
                max = arr[k];
                index = k;
            }

        }
        System.out.println(max);
        System.out.println(index+1);

    }
}
