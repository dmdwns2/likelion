package Study221128_221202.Study221128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionPrintAlphabet {

    public static char alphabet(char ch){

        if(ch == 0x5B) return ' ';
        else {
            System.out.println(ch);
            ch++;
            return alphabet(ch);
        }
    }

    //0x41~0x5A
    public static int print(int num){

        if(num == 0) return 0;

        else {

            alphabet('A');
            return print(num - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        bf.close();
        int num = Integer.parseInt(str);
        print(num);
    }
}
