package Study221107_221111.Study221109;

import java.util.Arrays;
import java.util.Collections;

interface StatementStrategy {
    boolean apply(int a, int b);
}

public class SelectionSort03 {
    public int[] selectionSort(int[] arr, StatementStrategy stmt) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.apply(arr[minIdx], arr[j])) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort03 ss = new SelectionSort03();
        ss.selectionSort(arr, (a, b) -> a < b);
        ss.selectionSort(arr, (a, b) -> a > b);
    }
}