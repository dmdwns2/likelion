package Quiz.Quiz221013.Test1068;
import java.util.Scanner;

public class Main {
    public static void evaluate(int num) {
        if(num >= 90) System.out.println("A");
        else if(num >= 70) System.out.println("B");
        else if(num >= 40) System.out.println("C");
        else if(num >= 0) System.out.println("D");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.parseInt(str.split(" ")[0]);

        evaluate(a);

    }
}
