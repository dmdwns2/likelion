package Quiz.Quiz221007.Test1039;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String input1 = "";
            String input2 = "";
            int standard = 0 ;

            for(int i =0 ; i < str.length() ; i++){
                if(standard == 1){
                    input2 += str.charAt(i);
                }
                if(str.charAt(i) == ' '){
                    standard = 1;
                }
                if(standard == 0){
                    input1 += str.charAt(i);
                }
            }
            long a = Long.parseLong(input1);
            long b = Long.parseLong(input2);

                System.out.println(a+b);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
