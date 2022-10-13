package Quiz.Quiz221013.Test1069;
import java.util.Scanner;

public class Main {
    public static void evaluate(char ch) {
        if(ch == 'A') System.out.println("best!!!");
        else if(ch == 'B') System.out.println("good!!");
        else if(ch == 'C') System.out.println("run!");
        else if(ch == 'D') System.out.println("slowly~");
        else System.out.println("what?");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char a = (str.split(" ")[0]).charAt(0);

        evaluate(a);

    }
}
