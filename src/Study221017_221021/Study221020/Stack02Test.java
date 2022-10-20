package Study221017_221021.Study221020;

import Study221017_221021.Study221020.Stack02;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stack02Test {

    @BeforeEach
    void setup(){
        System.out.println("before each");
    }

    @Test
    void pushTest(){
        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);

        Integer[] arr = stack02.getArr();

        assertEquals(10, arr[0]);
        assertEquals(20, arr[1]);
    }

    @Test
    @DisplayName("push가 잘 되는지 pop이 잘 되는지")
    void pushAndPop() {

        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);

        assertEquals(20, stack02.pop());
        assertEquals(10, stack02.pop());
        //stack.pop() 이 비어있을 땐?
        stack02.push(30);
        assertEquals(30, stack02.pop());

    }
}
