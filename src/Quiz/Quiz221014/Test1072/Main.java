package Quiz.Quiz221014.Test1072;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc1 = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);
            int length = sc1.nextInt();
            String inputStr = sc.nextLine();
            String[] str = inputStr.split(" ");
            for (int i = 0; i < length; i++)
                System.out.println(str[i]);

    }
}
