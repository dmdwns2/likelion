package Quiz.Quiz221006.Test1025;

import java.util.Scanner;

public class Main {

    public static void run() {
        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++)
                // str을 앞자리부터 받아서 -48을 빼준다 char형의 3을 int형의 3으로 변환해주는 작업.
                // Math.pow를 이용해 10의 자릿수제곱으로 맞춰준다.
                System.out.println("[" + (str.charAt(i)-48)*(int)(Math.pow(10, (str.length()-i-1))) + "]");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        run();
    }
}

