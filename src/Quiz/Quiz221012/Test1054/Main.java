package Quiz.Quiz221012.Test1054;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);
        int check;

        if (a == 1 && b == 1) check = 1;
        else check = 0;
        System.out.println(check);
    }
}
