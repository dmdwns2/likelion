package Study221114_221118.Study221116;

public class QuickSortArr {

    public void solution(int[] arr){


    }

    public int[] sort(int[] arr){
        int pivot = arr[arr.length/2];
        int[] left = new int[arr.length/2 - 1];
        int[] right = new int[arr.length - (arr.length/2)];
        int[] mid = new int[arr.length];
        int leftIdx = 0;
        int rightIdx = arr.length/2 + 1;
        // O O O O /O/ O O O

        for(int i = 0; i < arr.length ; i++){
            if(pivot > arr[i]){
                left[leftIdx] = arr[i];
                leftIdx++;
            } else if (pivot < arr[i]) {
                right[rightIdx] = arr[i];
                rightIdx++;
            }else

        }

        return
    }

    public static void main(String[] args) {

        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        QuickSortArr qsa = new QuickSortArr();
        qsa.solution(arr);
    }
}
