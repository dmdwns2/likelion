package Study221011_221014.Study221011.Study221013;

class SortAndShow02 {
    public int[] sort(int[] arr) {
        for (int index = 0; index < arr.length - 1; index++) {
            for (int i = index + 1; i < arr.length; i++) {
                if (arr[index] > arr[i]) {
                    int temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public void showArr02(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}

public class bubbleSort02 {
    public static void main(String[] args) {
        SortAndShow02 sortAndShow02 = new SortAndShow02();
        int[] arr = {7, 2, 3, 9, 28, 11, 10, 20, 30, 40, 50, 2, 31};

        sortAndShow02.sort(arr);
        sortAndShow02.showArr02(arr);
    }
}
