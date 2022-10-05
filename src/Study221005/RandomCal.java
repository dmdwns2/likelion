package Study221005;

import java.util.Scanner;

interface random{
    default int createRandom() {
        return (int) (Math.random() * 100);
    }
}


public class RandomCal implements random {
    private int a;
    final private int b = random.super.createRandom();


    public void userInput(){
        try{
            System.out.println("정수를 입력해주세요 a ?");
            Scanner sc = new Scanner(System.in);
            this.a = sc.nextInt();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void printB(){
        System.out.println("b ="+this.b);
    }
    public void plus(){

        System.out.println("덧셈");
        System.out.println(this.a+this.b);
    }
    public void minus(){
        System.out.println("뺄셈");
        System.out.println(this.a-this.b);
    }
    public void multiple(){
        System.out.println("곱셈");
        System.out.println(this.a*this.b);
    }
    public void devide(){
        if(this.b == 0)
            System.out.println("Random 숫자가 0이 나와서 나눌 수 없습니다.");
        else
            System.out.println("나눗셈");
        System.out.println((double)this.a/this.b);
    }
}
