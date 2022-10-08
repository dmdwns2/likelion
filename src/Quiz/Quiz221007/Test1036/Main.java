package Quiz.Quiz221007.Test1036;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            char ch = input.charAt(0);
            System.out.println((int)(ch));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
