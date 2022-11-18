package Study221114_221118.Study221118;

public class CaesarCipher {
    static class Solution{
        public String solution(String s, int n) {
            String answer = "";
            for(int i =0; i < s.length(); i++){
                if(s.charAt(i) != ' '){
                    answer += s.charAt(i) + n;
                }
                else answer += ' ';
            }

            return answer;
        }
    }

    public static void main(String[] args) {
       Solution sol = new Solution();
       sol.solution("ab",1);
    }
}
