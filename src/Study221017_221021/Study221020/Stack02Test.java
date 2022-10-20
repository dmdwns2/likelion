package Study221017_221021.Study221020;

import Study221017_221021.Study221020.Stack02;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

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
        //stack.pop() 이 비어있을 땐? 처리를 해주지 않으면 -1 ArrayOut~~ 발생
        stack02.push(30);
        assertEquals(30, stack02.pop());

        assertThrows(EmptyStackException.class,()-> //모던 자바표현
                stack02.pop()  // 이 구간을 인터페이스라고 생각하면 됨
        );
    }

    @Test
    void isEmpty(){
        Stack02 stack02 = new Stack02();
        assertTrue(stack02.isEmpty());
        stack02.push(10);
        assertFalse(stack02.isEmpty());
        stack02.pop();
        assertTrue(stack02.isEmpty());
    }
    @Test
    void peek(){
        Stack02 stack02 = new Stack02();
        stack02.peek();
    }

    @Test
    void realStack() {
        Stack<Integer> st = new Stack<>();

        assertThrows(EmptyStackException.class,()-> //모던 자바표현
                st.pop()  // 이 구간을 인터페이스라고 생각하면 됨
        );
    }
}
