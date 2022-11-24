package Study221004_221006.Study221005;

import java.util.Scanner;

class Calculator{
    int a;
    int b ;


    public Calculator() {

    }

    public void userInput(){
        try{
            System.out.println("정수를 두번 입력해주세요 a , b");
            Scanner sc = new Scanner(System.in);
            this.a = sc.nextInt();
            this.b = sc.nextInt();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void plus(){
        System.out.println(this.a+this.b);
    }
    public void minus(){
        System.out.println(this.a-this.b);
    }
    public void multiple(){
        System.out.println(this.a*this.b);
    }
    public void devide(){
        System.out.println((double)this.a/this.b);
    }


}