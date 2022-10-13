package Study221013;

class SortAndShow {
    public int[] sort(int[] arr) {
        int index = 0;
        while (true) {
            for (int i = index + 1; i < arr.length; i++) {
                if (arr[index] > arr[i]) {
                    int temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                }
            }
            if (index == arr.length - 1)
                return arr;

            index++;
        }
    }
    public void showArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}

public class bubbleSort01 {
    public static void main(String[] args) {
        SortAndShow sortAndShow = new SortAndShow();
        int[] arr = {7, 2, 3, 9, 28, 11, 10, 20, 30, 40, 50, 2, 31};

        sortAndShow.sort(arr);
        sortAndShow.showArr(arr);
    }
}
