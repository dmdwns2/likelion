package Study221017_221021.Study221018;


import java.util.Scanner;

public class Rectangle01 {
    public void printStarX(int input) {
        if (input < 1) return;
        printStarX(input - 1);
        System.out.print("*");
    }

    public void print(int inputX, int inputY) {
        Rectangle01 rectangle03 = new Rectangle01();
        if (inputX < 0) return;
        for (int i = 0; i < inputY; i++) {
            rectangle03.printStarX(inputX);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle01 rectangle03 = new Rectangle01();
        Scanner sc = new Scanner(System.in);
        System.out.println("X = ?");
        int inputX = sc.nextInt();
        System.out.println("Y = ?");
        int inputY = sc.nextInt();
        rectangle03.print(inputX, inputY);
    }
}