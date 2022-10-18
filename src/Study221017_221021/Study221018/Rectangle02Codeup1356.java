package Study221017_221021.Study221018;


import java.util.Scanner;

public class Rectangle02Codeup1356 {
    public void printStarX(int input) {
        if (input < 1) return;
        printStarX(input - 1);
        System.out.print(" ");
    }

    public void print(int inputX) {
        Rectangle02Codeup1356 rectangle03 = new Rectangle02Codeup1356();
        if (inputX < 0) return;
        for(int j = 0; j < inputX ; j++)
        System.out.print("*");
        System.out.println();
        for (int i = 0; i < inputX-2; i++) {
            System.out.print("*");
            rectangle03.printStarX(inputX-2);
            System.out.println("*");

        }
        for(int j = 0; j < inputX ; j++)
            System.out.print("*");
    }

    public static void main(String[] args) {
        Rectangle02Codeup1356 rectangle03 = new Rectangle02Codeup1356();
        Scanner sc = new Scanner(System.in);

        int inputX = sc.nextInt();

        rectangle03.print(inputX);
    }
}