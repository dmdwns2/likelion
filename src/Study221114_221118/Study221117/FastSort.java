package Study221114_221118.Study221117;

import java.util.Scanner;

public class FastSort {
    public void solution(int[] arr) {
        srt(arr);
        //출력
        for (int i = 0; i < srt(arr).length; i++)
            System.out.print(srt(arr)[i]+ " ");
    }
    public int[] srt(int[] arr) {
        if (arr[0] == 0) return arr; // 초기화 1
        int pivot = arr[arr.length / 2];
        int pivotCount = 3;
        while(pivot == 0){
            if(arr[0] == 0)
                return arr;  // 초기화 2
            pivot = arr[arr.length / pivotCount];
            pivotCount++;
        }


        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int[] mid = new int[arr.length];
        int leftIdx = 0;
        int rightIdx = 0;
        int midIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pivot > arr[i]) {
                left[leftIdx] = arr[i];
                leftIdx++;
            } else if (pivot < arr[i]) {
                right[rightIdx] = arr[i];
                rightIdx++;
            } else {
                mid[midIdx] = arr[i];
                midIdx++;
            }
        }
        return merge(srt(left), mid, srt(right));
    }
    public int[] merge(int[] left, int[] mid, int[] right) {
        int[] answer = new int[left.length];
        int leftIdx = 0;
        int midIdx = 0;
        int rightIdx = 0;
        int forIdx = 0;

        //for
        for (int i = 0; i < answer.length; i++) {
            if (left[i] == 0) {
                break;
            }
            answer[forIdx] = left[leftIdx];

            forIdx++;
            leftIdx++;
        }
        for (int i = 0; i < answer.length; i++) {
            if (mid[i] == 0){
                break;
            }
            answer[forIdx] = mid[midIdx];

            forIdx++;
            midIdx++;
        }
        for (int i = 0; i < answer.length; i++) {
            if (right[i] == 0){
                break;
            }
            answer[forIdx] = right[rightIdx];

            forIdx++;
            rightIdx++;
        }



        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String str = sc.nextLine();
        String[] strarr = sc.nextLine().split(" ");

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strarr[i]);
        }

        FastSort fs = new FastSort();

        fs.solution(arr);

    }
}
