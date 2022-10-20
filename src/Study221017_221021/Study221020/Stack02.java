package Study221017_221021.Study221020;

import java.util.EmptyStackException;

public class Stack02 {

    private Integer[] arr;
    private int top = 0;

    public Stack02(int size) {
        this.arr = new Integer[10000];
    }

    public Stack02(){
        this.arr = new Integer[10000];
    }

    public Integer[] getArr(){
        return arr;
    }

    public int pop(){
        if (this.isEmpty()) //비어있는 스택에 팝을 한 경우 예외처리
            throw new EmptyStackException();
       return this.arr[--this.top];
    }
    public void push(int value) {
        this.arr[this.top++] = value;

    }

    public boolean isEmpty(){
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }


    public int peek() {
        if (this.isEmpty())
            throw new EmptyStackException();
        else {
            System.out.println(this.arr[this.top]); //그냥 보려고 추가
            return this.arr[this.top];
        }
    }
}
