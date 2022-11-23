package Study221122_221125.Study221123;

import java.io.*;

public class Factorial {
    public static int factorial(int num){
        if(num == 1) {
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int num = Integer.parseInt(str);


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String outStr = String.valueOf(factorial(num));
        bw.write(outStr);
        bw.close();
    }
}
