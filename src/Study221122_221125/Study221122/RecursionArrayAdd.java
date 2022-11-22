package Study221122_221125.Study221122;

public class RecursionArrayAdd {

    static int sum = 0 ;

    public void add(int[] arr, int length) {

        if (length == 0) {
             sum += arr[length];
        }
        else {
            sum+= arr[length];
            length--;
            add(arr,length);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 9};
        RecursionArrayAdd raa = new RecursionArrayAdd();
        raa.add(arr, arr.length-1);
        System.out.println(sum);
    }
}
