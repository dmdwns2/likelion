package Study221017_221021.Study221019;

public class Stack01 {
    private int[] arr = new int[10000];

    private int pointer = 0;

    public Stack01() {

    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {

        this.arr[this.pointer] = value;
        this.pointer ++;
    }
    public int pop(){

        int value = this.arr[this.pointer];
        this.pointer --;
        return value;
    }

    public int[] getArr(){
        return arr;
    }
}
