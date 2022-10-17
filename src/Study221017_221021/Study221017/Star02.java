package Study221017_221021.Study221017;


import java.util.Scanner;

public class Star02 {
    public void print(int input) {
        for (int j = 0; j < input; j++) {

            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Star02 star01 = new Star02();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        star01.print(input);
    }
}