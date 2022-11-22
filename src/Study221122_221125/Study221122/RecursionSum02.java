package Study221122_221125.Study221122;

import java.util.Scanner;

public class RecursionSum02 {

    private static int sum = 0;

    public static void print(long input) {
        if (input < 1) return;
        sum += input % 10;
        input = input / 10;
        print(input);
    }

    public static void main(String[] args) {
        RecursionSum02 rs = new RecursionSum02();
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();

        rs.print(input);
        System.out.println(sum);

    }
}
