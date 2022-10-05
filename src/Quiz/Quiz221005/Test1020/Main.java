package Quiz.Quiz221005.Test1020;


import java.util.Scanner;

public class Main {
    static String str;
    static String a = "";
    static String b = "";
    static int standard = 0;

    public static void checkInteger(String str) {
        char check3;

        if (str.equals("")) {
            //문자열이 공백인지 확인
            System.out.println("문자가 공백입니다.");
        } else {
            for (int i = 0; i < str.length(); i++) {
                check3 = str.charAt(i);
                if (standard == 1)
                    b += str.charAt(i);
                else if (check3 == '-') {
                    standard = 1;
                } else if (standard == 0)
                    a += str.charAt(i);
            }
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            checkInteger(str);
            System.out.println(a + b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
