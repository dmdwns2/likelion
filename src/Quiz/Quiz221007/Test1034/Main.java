package Quiz.Quiz221007.Test1034;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int input = Integer.parseInt(str, 8);
            System.out.println(input);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
