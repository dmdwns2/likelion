package Study1005;

import java.util.Scanner;

class Calculator{
    public static int a ,b ;
    public static void userInput(){
        try{
            System.out.println("정수를 두번 입력햊쉐요 a , b");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
        }
        catch(Exception e){
            e.printStackTrace();
        }
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