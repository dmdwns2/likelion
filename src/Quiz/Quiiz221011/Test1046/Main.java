package Quiz.Quiiz221011.Test1046;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        DecimalFormat df = new DecimalFormat("0.0");
        String avg = df.format((float)(a+b+c)/3);

        System.out.println(a+b+c);
        System.out.println(avg);
    }
}
