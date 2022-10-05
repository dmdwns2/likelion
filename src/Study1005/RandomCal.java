package Study1005;

import java.util.Scanner;

interface random{
    default int createRandom() {
        return (int) (Math.random() * 100);
    }
}


public class RandomCal implements random {
    private int a;
    private int b = createRandom();

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

    public void plus(){
        System.out.println("랜덤 숫자 b ="+this.b);
        System.out.println(this.a+this.b);
    }
    public void minus(){
        System.out.println("랜덤 숫자 b ="+this.b);
        System.out.println(this.a-this.b);
    }
    public void multiple(){
        System.out.println("랜덤 숫자 b ="+this.b);
        System.out.println(this.a*this.b);
    }
    public void devide(){
        if(this.b == 0)
            System.out.println("Random 숫자가 0이 나와서 나눌 수 없습니다.");
        else
            System.out.println("랜덤 숫자 b ="+this.b);
        System.out.println((double)this.a/this.b);
    }
}
