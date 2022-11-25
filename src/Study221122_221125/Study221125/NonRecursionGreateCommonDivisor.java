package Study221122_221125.Study221125;

import java.io.*;

public class NonRecursionGreateCommonDivisor {

    public static int gcd(int num1, int num2){
        while(num1 != num2) {

            if (num1 > num2){
                System.out.println(num1 + " " + num2); //확인용
                num1 = num1-num2;
            }
            else if (num1 < num2) {
                System.out.println(num1 + " " + num2); //확인용
                num2 = num2 - num1;
            }
        }
        return num1;
    }
    public static void main(String[] args) throws IOException {
        // Input
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        bf.close();
        String[] strArr = str.split(" ");

        int num1 = Integer.parseInt(strArr[0]);
        int num2 = Integer.parseInt(strArr[1]);


        // Output
        // Output
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String outStr = String.valueOf(gcd(num1, num2));
        bw.write(outStr);
        bw.close();
    }
}
