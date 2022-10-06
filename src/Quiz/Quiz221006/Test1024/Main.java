package Quiz.Quiz221006.Test1024;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            for(int i = 0; i < str.length() ; i++)
                System.out.println("'"+str.charAt(i)+"'");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
