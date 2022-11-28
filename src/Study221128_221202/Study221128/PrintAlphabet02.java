package Study221128_221202.Study221128;

public class PrintAlphabet02 {

    public static void print(){

        for(char ch = 0x41; ch <= 0x5A; ch++) {
            for (char ch2 = 0x41; ch2 <= 0x5A; ch2++) {
                System.out.print(ch);
                System.out.println(ch2);
            }
        }
    }

    public static void main(String[] args) {
        print();
    }
}
