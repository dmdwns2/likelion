package Study221114_221118.Study221115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public void solution(Integer[] arr){
        System.out.println(sort(Arrays.asList(arr))); // 배열을 리스트로 변환해서 재귀함수에 태움
    }

    // List를 병합해주는 메서드
    public List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right) {
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);
        return answer;
    }

    // 정렬 메서드 좌 중 우 로 나누어서 정렬하는 재귀함수
    public List<Integer> sort(List<Integer> arr){
        if(arr.size() < 1) return arr;
        else {
            int pivot = arr.get(arr.size() / 2);
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();
            List<Integer> mid = new ArrayList<>();

            for (int i = 0; i < arr.size(); i++) {
                if (pivot > arr.get(i)) {
                    left.add(arr.get(i));
                } else if (pivot < arr.get(i)) {
                    right.add(arr.get(i));
                } else mid.add(arr.get(i));
            }

            return merge(sort(left), mid, sort(right));
        }
    }


    public static void main(String[] args) {
        Integer[] arr = {20, 18, 5, 19, 5, 25, 40, 50};
        QuickSort qs = new QuickSort();
        qs.solution(arr);
    }
}
