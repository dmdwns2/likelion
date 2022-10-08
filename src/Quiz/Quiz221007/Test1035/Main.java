package Quiz.Quiz221007.Test1035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int input = Integer.parseInt(str, 16);
            System.out.println(Integer.toOctalString(input));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
