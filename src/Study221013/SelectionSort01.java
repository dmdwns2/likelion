package Study221013;

class Compare{
    public int[] sort(int[] arr){
        int index = 0;
        int temp;
        for (int i = index; i < arr.length; i++){
            if(arr[index] > arr[i]){
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }

        return arr;
    }

    public void showArr(int[] arr){
        for(int i=0; i< arr.length; i++)
            System.out.println(arr[i]);
    }
}

public class SelectionSort01 {


    public static void main(String[] args) {
        Compare compare = new Compare();
        int[] arr = {7, 2, 3, 9, 28, 11};

        compare.sort(arr);
        compare.showArr(arr);
    }
}
