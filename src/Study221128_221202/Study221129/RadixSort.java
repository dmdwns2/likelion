package Study221128_221202.Study221129;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RadixSort {


    public static void radix(String[] strArr, int index) {

        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        for (int i = 0; i < index; i++) {
            arr[Integer.parseInt(strArr[i])] = Integer.parseInt(strArr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != -1){
                System.out.print(arr[i]+" ");
            }
        }

    }

    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String[] strArr = str.split(" "); // 2 3 1 7 3 이런식으로 들어온다고 가정하고 배열형태로
        int index = strArr.length; // index는 입력받은 배열의 크기
        bf.close();

        radix(strArr, index);


    }
}
