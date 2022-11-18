package Study221114_221118.Study221118;

public class CaesarCipher {
    static class Solution {
        public String solution(String s, int n) {
            String answer = "";
            char temp1;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    answer += s.charAt(i);
                }

                //소문자
                if (s.charAt(i) <= 'z' && 'a' <= s.charAt(i)) {
                    temp1 = s.charAt(i);
                    for (int j = 1; j <= n; j++) {
                        temp1++;
                        if (temp1 > 'z') temp1 = 'a';

                    }
                    answer += temp1;
                }
                // 대문자 같은로직
                if (s.charAt(i) <= 'Z' && 'A' <= s.charAt(i)) {
                    temp1 = s.charAt(i);
                    for (int j = 1; j <= n; j++) {
                        temp1++;
                        if (temp1 > 'Z') temp1 = 'A';

                    }
                    answer += temp1;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("ab", 1);
    }
}
