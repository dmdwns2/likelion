package Study221031_221104.Study221102;

import java.util.ArrayList;
import java.util.List;

public class PrimeChe {



    private final int SIZE = 50;
    int index = 2;

    List<Integer> list = new ArrayList<>(SIZE);


    public void listSetup() {
        for ( int i = 2;i <= SIZE; i++) {
            list.add(i);
        }
    }

    public void che() {
        while(index <= SIZE) {
            if (list.contains(index)) {
                for (int i = index * index; i <= SIZE; ) {
                    list.remove(Integer.valueOf(i));
                    i += index;
//                    System.out.println("i "+i+" index "+index);
                }
            }
            System.out.println(list);
            index++;
        }
    }

    public static void main(String[] args) {
        PrimeChe primeChe = new PrimeChe();
        primeChe.listSetup();
        primeChe.che();
    }

}
