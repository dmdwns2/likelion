package Study221114_221118.Study221116;

import java.util.Arrays;

public class QuickSortArr {

    int cnt = 0;

    public void solution(int[] arr) {
        sort(arr);

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
                forIdx = i;
                System.out.println("for idx : " + forIdx);
                break;
            }
            answer[i] = left[leftIdx];
            leftIdx++;
            System.out.println("for answer : " + answer[i]);
        }
        for (int i = forIdx; i < answer.length; i++) {
            if (mid[i] == 0){
                forIdx = i;
                System.out.println("for idx : " + forIdx);
                break;
            }
            answer[i] = mid[midIdx];
            midIdx++;
            System.out.println("for answer : ");
        }
        for (int i = forIdx; i < answer.length; i++) {
            if (right[i] == 0){
                System.out.println("for idx : " + forIdx);
                break;
            }
            answer[i] = right[rightIdx];
            rightIdx++;
            System.out.println("for answer : ");
        }
        System.out.println(answer);
        return answer;
    }

    public int[] sort(int[] arr) {
        cnt++; // 회차
        System.out.println("현재 : " + cnt);
        int pivot = arr[arr.length / 2];
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int[] mid = new int[arr.length];
        int leftIdx = 0;
        int rightIdx = 0;
        int midIdx = 0;
        // O O O O /O/ O O O

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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(left[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(mid[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(right[i] + " ");
        }
        System.out.println();
        return merge(left, mid, right);
    }

    public static void main(String[] args) {

        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        QuickSortArr qsa = new QuickSortArr();
        qsa.solution(arr);
    }
}
