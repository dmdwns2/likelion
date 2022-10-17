package Study221017_221021.Study221017;


import java.util.Scanner;

public class Star04 {
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
        Star04 star03 = new Star04();
        if (input < 0) return;
        for (int i = 1; i <= input; i++) {
            star03.printBlank(input - i);
            star03.printStar(2 * i - 1);
            System.out.println();
        }
    }
    public void printBottom(int input) {
        Star04 star03 = new Star04();
        if (input < 0) return;
        for (int i =input-1 ; i > 0; i--) {
            star03.printBlank(input - i);
            star03.printStar(2 * i - 1);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Star04 star03 = new Star04();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        star03.printTopMid(input);
        star03.printBottom(input);
    }
}