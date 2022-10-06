package Quiz.Quiz221006.Test1029;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double db = sc.nextDouble();
        DecimalFormat df =new DecimalFormat("0.00000000000"); // 문제가 소수점 11자리까지여서 맞춰줌
        String result = df.format(db);
        System.out.println(result);
    }
}
