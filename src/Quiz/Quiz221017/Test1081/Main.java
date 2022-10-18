package Quiz.Quiz221017.Test1081;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = new String[1];
        arr = str.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        for (int i = 1; i<= a; i++){
            for(int j = 1; j<=b; j++){
                System.out.println(i +" "+ j);
            }
        }



    }
}
