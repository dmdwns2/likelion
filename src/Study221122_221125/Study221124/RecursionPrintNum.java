package Study221122_221125.Study221124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionPrintNum {

    public static int printnum(int num, int i){
        if (i > num){
            return 0;
        }
        System.out.printf(i+" ");
        return printnum(num,i+1);
    }
    public static int println(int num, int i){
        if(i > num) {
            return 0; // 이 0이 자꾸 출력 결과로 나옴
        }
        else{
            printnum(num, i);
            System.out.println();
            return println(num,i+1);
        }
    }
    public static void main(String[] args) throws IOException {
        // Input
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int num = Integer.parseInt(str);
        bf.close();

        // Output
        println(num,1);
    }
}
