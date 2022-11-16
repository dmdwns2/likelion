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
                break;
            }
            answer[forIdx] = left[leftIdx];
            forIdx++;
            leftIdx++;
            System.out.println("for idx : " + forIdx);
            System.out.println("for answer : " + answer[i]);
        }
        for (int i = 0; i < answer.length; i++) {
            if (mid[i] == 0){
                break;
            }
            answer[forIdx] = mid[midIdx];
            forIdx++;
            midIdx++;
            System.out.println("for idx : " + forIdx);
            System.out.println("for answer : "+ answer[i]);
        }
        for (int i = 0; i < answer.length; i++) {
            if (right[i] == 0){
                break;
            }
            answer[forIdx] = right[rightIdx];
            forIdx++;
            rightIdx++;
            System.out.println("for idx : " + forIdx);
            System.out.println("for answer : "+ answer[i]);
        }


        //출력
        for (int i = 0; i < left.length; i++)
        System.out.print(answer[i]+ " ");
        System.out.println();
        return answer;
    }

    public int[] sort(int[] arr) {
        if (arr[0] == 0) return arr;
        cnt++; // 회차
        System.out.println("현재 : " + cnt);
        int pivot = arr[arr.length / 2];
        if(pivot == 0) return arr;
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
        System.out.println("left");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(mid[i] + " ");
        }
        System.out.println("mid");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(right[i] + " ");
        }
        System.out.println("right");
        return merge(sort(left), mid, sort(right));
    }

    public static void main(String[] args) {

        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        QuickSortArr qsa = new QuickSortArr();
        qsa.solution(arr);
    }
}
