package Study221011_221014.Study221011.Study221014;

import java.util.Scanner;

public class CodeUp1443 {
    public int[] sort(int[] arr) {
        int key = 1;

        while (key < arr.length) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[key] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[key];
                    arr[key] = temp;
                }
            }
            if (key < arr.length)
                key++;
        }
        return new int[]{};
    }

    public void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        CodeUp1443 codeUp1443 = new CodeUp1443();
        codeUp1443.sort(arr);
        codeUp1443.show(arr);
    }
}


