package Quiz.Quiz221014.Test1080;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int index = 1;
        while(true){
            result += index++;
            if(result >= num) {
                System.out.println(index-1);
                break;
            }
        }
    }
}
