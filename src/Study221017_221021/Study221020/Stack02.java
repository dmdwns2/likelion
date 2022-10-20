package Study221017_221021.Study221020;

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
       return this.arr[--this.top];
    }
    public void push(int value) {
        this.arr[this.top++] = value;

    }
}
