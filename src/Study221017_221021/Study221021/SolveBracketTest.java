package Study221017_221021.Study221021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolveBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket() {
        SolveBracket solveBracket= new SolveBracket();
//        assertTrue(solveBracket.solution("()()"));
//        assertTrue(solveBracket.solution("()()())))()()()"));
        assertTrue(solveBracket.solution("(()()()(())(((())))())"));
    }


    public static void main(String[] args) {

    }
}
