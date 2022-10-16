package Quiz.Quiz221014.Test1079;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] num = str.split(" ");
        int i = 0;
        while (true) {

            System.out.println(num[i]);
            if (num[i].charAt(0) == 'q') System.exit(0);
            i++;
        }
    }
}
