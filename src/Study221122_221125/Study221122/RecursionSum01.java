package Study221122_221125.Study221122;

import java.util.Scanner;

public class RecursionSum01 {

    private static int sum = 0;

    public static void print(int input){
        if(input==0) return;

        sum += input;
        input--;
        print(input);

    }

    public static void main(String[] args) {
        RecursionSum01 rs = new RecursionSum01();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        rs.print(input);
        System.out.println(sum);

    }
}
