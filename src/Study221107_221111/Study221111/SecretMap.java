package Study221107_221111.Study221111;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr1[i] | arr2[i]).toString()));
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
//        System.out.println(30 | 9); // 확인용
        SecretMap sm = new SecretMap();
//        sm.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        sm.solution(5, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10});

    }
}
