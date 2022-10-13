package Quiz.Quiz221013.Test1067;

import java.util.Scanner;

public class Main {
    public static void oddEven(int num) {
        if (num % 2 == 0) {

            if (num < 0) System.out.println("minus");
            else System.out.println("plus");
            System.out.println("even");
        } else {
            if (num < 0) System.out.println("minus");
            else System.out.println("plus");
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.parseInt(str.split(" ")[0]);

        oddEven(a);

    }
}
