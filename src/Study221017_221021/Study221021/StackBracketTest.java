package Study221017_221021.Study221021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket(){
        StackBracket stackBracket = new StackBracket();

        assertTrue(stackBracket.solution(")(()()()(())(((())))())"));
    }

    public static void main(String[] args) {

    }
}
