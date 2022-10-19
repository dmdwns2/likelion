package Study221017_221021.Study221019;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {
    @Test
    void pushTest(){
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);
         stack01.push(30);
         int[] arr = stack01.getArr();
        Assertions.assertEquals(10, arr[0]);
    }
}