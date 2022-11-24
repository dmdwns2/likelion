package Study221004_221006.Study221004.EvenOdd2;

import java.util.Scanner;

public class Main {

    public static String isEven(int num){
        if(num % 2 == 0){
            return "짝수";
        }
        else return "홀수";
    }

    public static void printEvenOddStatement(int input1, int input2){
        System.out.println(isEven(input1)+"+"+isEven(input2)+"="+isEven(input1+input2));
    }

    public static void main(String[] args) {
        int input1,input2;
        Scanner sc = new Scanner(System.in);
        input1 = sc.nextInt();
        input2 = sc.nextInt();
        printEvenOddStatement(input1, input2);


    }
}
