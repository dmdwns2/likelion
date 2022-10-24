package Study221024_221028.Study221024;

import java.util.Arrays;
import java.util.Collections;

public class LargestNumTest {

    public static void main(String[] args) {
        Integer[] arr = {6, 10, 2};
        String[] str = new String[arr.length* (arr.length-1)];
        for(int j=0; j< str.length; j++)
        for(int i=0; i < arr.length; i++) {
            str[j] += arr[i].toString();
        }
        Arrays.sort(str, Collections.reverseOrder());
        System.out.println(Arrays.toString(str));
        System.out.println(str[1-1]);
    }
}
