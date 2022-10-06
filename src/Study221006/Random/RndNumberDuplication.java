package Study221006.Random;

import Study221005.Calculator0.RandomGenerator;

import java.util.HashSet;
import java.util.Set;

public class RndNumberDuplication {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        Set<Integer> rndNum = new HashSet<>();


        for (int i = 0 ; i < 200 ; i++) {
            int r = randomGenerator.make(100); // 10 미만의 숫자 생성
            rndNum.add(r);
        }

        System.out.println(rndNum);
        System.out.println(rndNum.size());
    }
}
