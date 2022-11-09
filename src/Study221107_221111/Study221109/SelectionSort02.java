package Study221107_221111.Study221109;

import java.util.Arrays;
import java.util.Collections;

public class SelectionSort02 {
    public static void main(String[] args) {
        Integer[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int index = 0;
        int temp;
        int min = arr[0];
        int iVal = 0;
        boolean isChange = false;

        while (index < arr.length) {
            min = arr[index];
            for (int i = index; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    isChange = true;
                    iVal = i;
                }
            }
            if(isChange == true) {
                temp = arr[index];
                arr[index] = min;
                arr[iVal] = temp;
            }
            isChange = false;
            index++;
        }


        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++)
        System.out.println(arr[i]);
    }
}