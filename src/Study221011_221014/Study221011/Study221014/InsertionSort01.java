package Study221011_221014.Study221011.Study221014;

public class InsertionSort01 {


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
        int[] arr = {8, 5, 6, 2, 4};


        InsertionSort01 insertionSort01 = new InsertionSort01();
        insertionSort01.sort(arr);
        insertionSort01.show(arr);
    }
}
