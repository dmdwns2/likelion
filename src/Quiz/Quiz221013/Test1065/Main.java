package Quiz.Quiz221013.Test1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);
        int c = Integer.parseInt(str.split(" ")[2]);
        if (a % 2 == 0) System.out.println(a);
        if (b % 2 == 0) System.out.println(b);
        if (c % 2 == 0) System.out.println(c);
    }
}
