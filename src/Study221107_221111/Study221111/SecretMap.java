package Study221107_221111.Study221111;

public class SecretMap {
        public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binary1 = new String[n];
        String[] binary2 = new String[n];


        for(int i = 0; i< n; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = answer[i].replace("1","#");
            answer[i] = answer[i].replace("0"," ");
            System.out.println(answer[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
//        System.out.println(30 | 9); // 확인용
        SecretMap sm = new SecretMap();
        sm.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }
}
