package Quiz.Quiz221014.Test1076;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char num = sc.nextLine().charAt(0);
        for(int i = 0x61; i < num+1 ; i++)
            System.out.println((char)i);
    }
}
