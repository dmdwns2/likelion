package Study221011.Test1620;

import java.util.Scanner;

public class Main {
    public int solution(int n) {
        int[] arr = {0,0,0,0,0}; // 5라운드

        int result = 0;
        arr[0] = n;

        for (int i = 1; i < arr.length; i++) {
            result += arr[i - 1] % 10;
            while (arr[i - 1] >= 10) {
                arr[i - 1] /= 10;
                result += arr[i - 1] % 10;
                arr[i] = result;
            }
            result = 0;
        }
        for (int j = 1; j < arr.length; j++){
            if(arr[j] == 0)
                return arr[j-1];
        }
        return result;

    }

    public static void main(String[] args) {
        try {
            Main main = new Main();
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int result1 = main.solution(num);
            System.out.println(result1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

