package Study221114_221118.Study221114;

public class EratosthenesChe {

    public void solution(int[] arr) {
        boolean[] check = new boolean[arr.length];
        int num = 2; // 배열에 숫자 넣어주기 위해 사용
        int index = 2; // 현재 수 , arr의 수
        int cnt = 0; // 카운트 while문에 사용
        int temp = index; // 임시로 check 배열에 사용될 수 index의 배수만큼 더해줌

        for (int i = 0; i < arr.length; i++) {
            arr[i] = num++;
            check[i] = true; // 체크 배열은 true
        }

        while (cnt < arr.length) { // 2 ~ 48 까지 실행될테니 2~ 50 으로 동작하게 +2
            temp += index;

            if (temp - 2 >= arr.length) {
                index++;
                temp = index;
                cnt++;
            } else
                check[temp - 2] = false; // 배수를 더해주면서 check 배열을 false로 만듬

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] +  " = " + check[i]);
            if(check[i] == true) cnt++;
        }
        System.out.println("소수의 개수 : " + cnt);
    }


    public static void main(String[] args) {
        int SIZE = 50;
        int[] arr = new int[SIZE - 1]; // 2부터 들어갈거라서 -1 2~50
        EratosthenesChe ec = new EratosthenesChe();

        ec.solution(arr);

    }
}
