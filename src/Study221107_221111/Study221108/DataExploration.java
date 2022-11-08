package Study221107_221111.Study221108;

import java.util.Scanner;

public class DataExploration {

    Scanner sc = new Scanner(System.in);
    final private int size = sc.nextInt();

    Scanner sc1 = new Scanner(System.in);
    String str = sc1.nextLine();
    String target = sc1.nextLine();

    String[] arr = str.split(" ");

    public int solution (){

        for(int i = 0; i < size ; i++){
            if ( arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        DataExploration dataExploration = new DataExploration();
        dataExploration.solution();

    }
}
