package Study221017_221021.Study221021;

public class SolveBracket {
    public boolean solution(String s) {
        while (s.indexOf("()") >= 0)
            s = s.replace("()", "");

        return s.length() == 0;
    }
}
