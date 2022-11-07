package Study221031_221104.Study221102;

import java.util.ArrayList;
import java.util.List;

public class PrimeChe {



    private final int SIZE = 1_000_000;
    int index = 2;

    boolean[] arr = new boolean[SIZE-1];
    public void listSetup() {
        for ( int i = 2;i <= SIZE; i++) {
            arr[i-2] = true;
        }

    }

    public void che() {
        while(index <= SIZE) {
                for (int i = index * 2; i <= SIZE; ) {
                    arr[i-2] = false;
                    i += index;
                }
//            }
            index++;
        }
    }
    public int answer(){
        int cnt = 0;
        for(int i = 0; i < SIZE-1 ; i++){
            if(arr[i] == true)
                cnt++;
//            System.out.println(arr[i]); //확인용
        }

        System.out.println(cnt);
        return cnt;
    }

    public static void main(String[] args) {
        PrimeChe primeChe = new PrimeChe();
        primeChe.listSetup();
        primeChe.che();
        primeChe.answer();
    }

}
