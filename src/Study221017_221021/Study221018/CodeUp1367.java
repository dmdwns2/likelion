package Study221017_221021.Study221018;


import java.util.Scanner;

public class CodeUp1367 {
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

    public void printTopMid(int input) {
        CodeUp1367 star03 = new CodeUp1367 ();
        if (input < 0) return;
        for (int i = 1; i <= input; i++) {
            star03.printBlank(input - i);
            star03.printStar(input);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CodeUp1367 star03 = new CodeUp1367 ();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        star03.printTopMid(input);
    }
}