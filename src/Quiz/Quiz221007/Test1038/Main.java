package Quiz.Quiz221007.Test1038;
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
            int a = Integer.parseInt(input1);
            int b = Integer.parseInt(input2);


            if((a >= -1073741824 && a <= 1073741824)
            &&  (b >= -1073741824 && b <= 1073741824)){
                System.out.println((long)a+b);
            }
            else System.exit(0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
