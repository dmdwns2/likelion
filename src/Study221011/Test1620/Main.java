package Study221011.Test1620;

import java.util.Scanner;

public class Main {
    public int solution(int n) {
        int result = 0;
        int result1 = 0;
        result += n % 10;
        for (int i = 0; i < 10; i++) {
            n = n / 10;
            result += n % 10;
        }
        result1 += result % 10;
        while (result1 > 10) {
            result = result / 10;
            result1 += result % 10;
        }

        return result1;
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

