package Study221031_221104.Study221102;

import java.util.ArrayList;
import java.util.List;

public class PrimeChe {



    private final int SIZE = 2535;
    int index = 2;

    List<Integer> list = new ArrayList<>(SIZE);
    boolean[] arr = new boolean[SIZE-1];
    public void listSetup() {
        for ( int i = 2;i <= SIZE; i++) {
            list.add(i);
            arr[i-2] = true;
        }

    }

    public void che() {
        while(index <= SIZE) {
            if (list.contains(index)) {
                for (int i = index * index; i <= SIZE; ) {
                    arr[i-2] = false;
//                    list.remove(Integer.valueOf(i)); 이렇게하면 시간복잡도 문제 발생
                    i += index;
//                    System.out.println("i "+i+" index "+index);
                }
            }
            index++;
        }
    }
    public int answer(){
        int cnt = 0;
        for(int i = 0; i < SIZE-1 ; i++){
            if(arr[i] == true)
                cnt++;
//            System.out.println(arr[i]); 확인용
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
