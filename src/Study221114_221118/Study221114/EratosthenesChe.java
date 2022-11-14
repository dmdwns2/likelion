package Study221114_221118.Study221114;

public class EratosthenesChe {

    public void solution(int[] arr){
        boolean[] check = new boolean[arr.length];
        int num = 2;
        int index  = 2;
        for(int i= 0; i < arr.length; i++) {
            arr[i] = num++;
            check[i] = true; // 체크 배열은 true
        }

        while (index < arr.length + 2 ){ // 2 ~ 48 까지 실행될테니 2~ 50 으로 동작하게 +2

            index++;
        }

    }


    public static void main(String[] args) {
        int SIZE = 50;
        int[] arr = new int[SIZE-1]; // 2부터 들어갈거라서 -1
        EratosthenesChe ec =new EratosthenesChe();

        ec.solution(arr);

    }
}
