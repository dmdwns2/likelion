package Study1005.Calculator0;

public class RandomGenerator implements NumberGenerator {
    @Override
    public int make(int num) {
        return (int) (Math.random() * num);
    }

}
