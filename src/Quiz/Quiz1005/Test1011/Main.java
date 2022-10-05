package Quiz.Quiz1005.Test1011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            float ch = sc.next().charAt(0);
            System.out.println(ch);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
