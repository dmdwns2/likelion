package Study221128_221202.Study221202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorization {

    public static void fz(int num){
        String result = "";
        int i = 2;
        int temp = num;
        while(num != i){
            if(temp % i == 0){ // 나눠지면
                temp = temp / i;
                result += String.format(i + " ");
            }
            else {  // 안나눠지면
                i++;
            }
        }
        //빠져나오면 num = i
        if(result == ""){ // 소수라면
            System.out.println(num+" ");
        }
        else{  //num이 소수가 아니라면
            System.out.println(result);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        bf.close();
        int num = Integer.parseInt(str);

        fz(num);

    }
}
