package Study221004_221006.Study221004.EvenOdd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input % 2 == 0) {
            System.out.println("even");
        } else System.out.println("odd");
    }
}
