package Study221011_221014.Study221011.Test1278;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int result = 0;

            while(num > 0){
                num /= 10;
                result += 1;
            }

            System.out.println(result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
