package Quiz.Quiz1005.Test1013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+" "+b);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
