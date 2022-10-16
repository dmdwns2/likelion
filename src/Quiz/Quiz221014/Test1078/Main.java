package Quiz.Quiz221014.Test1078;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int even = 0;

        for (int i = 0; i < num + 1; i++) {
            if (i % 2 == 0) {
                even += i;
            }

        }
        System.out.println(even);
    }
}