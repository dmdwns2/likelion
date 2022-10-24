package Study221024_221028.Study221024;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class KthTest {

    public static void main(String[] args) {
        Integer[] arr = {1, 5, 2, 6, 3, 7, 4};
        Integer[] arr1 = Arrays.copyOfRange(arr, 2-1, 5);
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[3-1]);
    }
}
