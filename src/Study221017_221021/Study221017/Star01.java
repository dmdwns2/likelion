package Study221017_221021.Study221017;


import java.util.Scanner;

public class Star01 {
    public void print(int input) {
        System.out.println("*");
        System.out.println("* *");
        System.out.print("* * *");
        System.out.println("* * * *");

    }

    public static void main(String[] args) {
        Star01 star01 = new Star01();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        star01.print(input);
    }
}

