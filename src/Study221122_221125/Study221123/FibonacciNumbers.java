package Study221122_221125.Study221123;

import java.io.*;

public class FibonacciNumbers {
    public static int fibonacci(int num){
        if(num <= 2) {
            return 1;
        }
        else{
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
    public static void main(String[] args) throws IOException {
        // Input
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int num = Integer.parseInt(str);

        // Output
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String outStr = String.valueOf(fibonacci(num));
        bw.write(outStr);
        bw.close();
    }
}
