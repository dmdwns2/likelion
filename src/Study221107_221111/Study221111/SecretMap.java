package Study221107_221111.Study221111;

public class SecretMap {
        public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] binary1 = new String[arr1.length];
        String[] binary2 = new String[arr2.length];


        for(int i = 0; i< arr1.length; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            System.out.println(answer[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
//        System.out.println(30 | 9); // 확인용
    }
}
