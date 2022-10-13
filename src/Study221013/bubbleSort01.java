package Study221013;

class SortAndShow {
    public int[] sort(int[] arr) {
        int index = 0;
        int temp;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
            index++;
        }

        return arr;
    }

    public void showArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}

public class bubbleSort01 {


    public static void main(String[] args) {
        SortAndShow sortAndShow = new SortAndShow();
        int[] arr = {7, 2, 3, 9, 28, 11};

        sortAndShow.sort(arr);
        sortAndShow.showArr(arr);
    }
}
