package Quiz.Quiz221007.Test1032;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            System.out.println(Integer.toHexString(input));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

