package Study221004_221006.Study221006.Set.Random;

import Study221004_221006.Study221005.Calculator0.RandomGenerator;

public class RndNumberWithoutDuplicated {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        for (int i = 0 ; i < 50 ; i++) {
           int r = randomGenerator.make(10); // 10 미만의 숫자 생성
            System.out.println(r);
        }

    }
}
