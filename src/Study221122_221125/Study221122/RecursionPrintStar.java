package Study221122_221125.Study221122;

import java.util.Scanner;

public class RecursionPrintStar {

    public static void print(int input){
        if(input==0) return;

        System.out.printf("*");
        input--;
        print(input);

    }

    public static void main(String[] args) {
        RecursionPrintStar rps = new RecursionPrintStar();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        rps.print(input);

    }
}
