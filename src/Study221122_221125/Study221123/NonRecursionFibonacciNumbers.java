package Study221122_221125.Study221123;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NonRecursionFibonacciNumbers {

    //재귀 없이 n번째 피보나치 수를 출력
    public static int fibonacci(int num) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1); // 1st
        arr.add(1); // 2nd
        for (int i = 2; i < num; i++) {
            arr.add(arr.get(i - 1) + arr.get(i - 2));
        }

        return arr.get(num-1);
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
