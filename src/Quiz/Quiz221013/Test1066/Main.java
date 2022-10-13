package Quiz.Quiz221013.Test1066;

import java.util.Scanner;

public class Main {
    public static void oddEven(int num){
        if (num % 2 == 0) System.out.println("even");
        else System.out.println("odd");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);
        int c = Integer.parseInt(str.split(" ")[2]);
        oddEven(a);
        oddEven(b);
        oddEven(c);
    }
}

