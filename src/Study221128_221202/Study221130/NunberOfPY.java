package Study221128_221202.Study221130;

public class NunberOfPY {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                pCount += 1;
            }
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                yCount += 1;
            }
        }

        if (pCount == yCount) return true;
        else return false;
    }

}
