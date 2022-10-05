package Quiz.Quiz1005.Test1019;


import java.util.Scanner;

public class Main {
    static String str;
    static String a = "";
    static String b = "";
    static String c = "";
    static String a_1, b_1, c_1;
    static int standard = 0;

    public static void checkInteger(String str) {
        char check2;

        if (str.equals("")) {
            //문자열이 공백인지 확인
            System.out.println("문자가 공백입니다.");
        } else {
            for (int i = 0; i < str.length(); i++) {
                check2 = str.charAt(i);
                if (standard == 2)
                    c += str.charAt(i);
                else if ((check2 == '.') && (standard == 1))
                    standard = 2;
                else if (standard == 1)
                    b += str.charAt(i);
                else if (check2 == '.')
                    standard = 1;
                else if (standard == 0)
                    a += str.charAt(i);

            }
        }
    }

    public static void numberOfDigits() {
        //년도
        if (Integer.parseInt(a) < 10)
            a_1 = "0" + a;
        else if (Integer.parseInt(a) < 100)
            a_1 = "00" + a;
        else if (Integer.parseInt(a) < 1000)
            a_1 = "000" + a;
        else a_1 = a;

        //월, 일
        if (Integer.parseInt(b) < 10)
            b_1 = "0" + b;
        else b_1 = b;
        if (Integer.parseInt(c) < 10)
            c_1 = "0" + c;
        else c_1 = c;
    }

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            checkInteger(str);
            numberOfDigits();
            System.out.println(a_1 + "." + b_1 + "." + c_1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
