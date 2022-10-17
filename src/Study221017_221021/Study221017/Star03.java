package Study221017_221021.Study221017;


import java.util.Scanner;

public class Star03 {
    public void printStar(int input) {
        if (input < 1) return;
        printStar(input - 1);
        System.out.print("*");
    }

    public void printBlank(int input) {
        if (input < 1) return;
        System.out.print(" ");
        printBlank(input - 1);
    }

    public void printAll(int input) {
        Star03 star03 = new Star03();
        if (input < 0) return;
        for (int i = 1; i <= input; i++) {
            star03.printBlank(input - i);
            star03.printStar(2 * i - 1);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Star03 star03 = new Star03();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        star03.printAll(input);
    }
}