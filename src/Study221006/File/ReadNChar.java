package Study221006.File;

import java.util.Scanner;

public class ReadNChar {

    char readAChar(String line) {
        System.out.println(line.charAt(0));
        return line.charAt(0);
    }

    String read2Chars(String line) {
        System.out.print(line.charAt(0));
        System.out.println(line.charAt(1));
        return String.valueOf(line.charAt(0) + line.charAt(1));
    }

    String readNChar(String line) {
        String str;
        try {
            System.out.println("몇 글자를 읽으시겠습니까?");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            str = "";

            if ((line.length() >= input) && (line != null)) {
                for (int i = 0; i < input; i++) {
                    str += line.charAt(i);
                }
                System.out.println(str);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return str;
    }
}
