package Study221107_221111.Study221111;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        String[] binary1 = new String[arr1.length];
        String[] binary2 = new String[arr2.length];
        for(int i = 0; i < arr1.length; i++) {
            binary1[i] = Integer.toBinaryString(arr1[i]);
        }for(int i = 0; i < arr2.length; i++) {
            binary2[i] = Integer.toBinaryString(arr1[i]);
        }

        return answer;
    }
}
