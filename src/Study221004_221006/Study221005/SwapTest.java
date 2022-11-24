package Study221004_221006.Study221005;

public class SwapTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        System.out.printf("a = %d b = %d",a,b);
        temp = a;
        a = b;
        b = temp;

        System.out.printf("a = %d b = %d",a,b);
    }
}
