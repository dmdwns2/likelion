package Study221017_221021.Study221021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TryBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket(){
        TryBracket tryBracket = new TryBracket();

        assertTrue(tryBracket.solution("[]{}(){()}"));
    }
/* 결과 스택
[\[]
        [\[]
        [\[, \{]
[\[, \{]
[\[, \{, \(]
[\[, \{, \(]
[\[, \{, \(, \{]
[\[, \{, \(, \{, \(]
[\[, \{, \(, \{, \(]
[\[, \{, \(, \{, \(]*/
    public static void main(String[] args) {

    }
}