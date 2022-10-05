package Quiz.Quiz1005.Test1015;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            DecimalFormat df = new DecimalFormat("0.00");
            Scanner sc = new Scanner(System.in);
            float fl = sc.nextFloat();
//            float fl = (float) (Math.round(sc.nextFloat() * 100) / 100.0); // 소수점 두자리 나누기. 100 곱하고 100 나눔 -> 1에서 막힘
            String result = df.format(fl);
            System.out.println(result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
