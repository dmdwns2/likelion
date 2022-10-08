package Quiz.Quiz221007.Test1031;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            System.out.println(Integer.toOctalString(input));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
