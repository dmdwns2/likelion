package Study1005;

import java.util.Scanner;

class Calculator{
    public static int a ,b ;
    public static void userInput(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    }

    public void plus(int a, int b){
        System.out.println(a+b);
    }
    public void minus(int a, int b){
        System.out.println(a-b);
    }
    public void multiple(int a, int b){
        System.out.println(a*b);
    }
    public void devide(int a, int b){
        System.out.println((double)a/b);
    }

}

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.userInput();
        calculator.plus(calculator.a,calculator.b);
        calculator.minus(calculator.a,calculator.b);
        calculator.multiple(calculator.a,calculator.b);
        calculator.devide(calculator.a,calculator.b);
    }
}
