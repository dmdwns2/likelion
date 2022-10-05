package Quiz.Quiz221005.Test1014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            char a = sc.next().charAt(0);
            char b = sc.next().charAt(0);;
            System.out.println(b+" "+a);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
