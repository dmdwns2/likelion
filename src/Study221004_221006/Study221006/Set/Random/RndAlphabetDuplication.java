package Study221004_221006.Study221006.Set.Random;

import Study221004_221006.Study221005.Calculator0.RandomGenerator;

import java.util.HashSet;
import java.util.Set;

public class RndAlphabetDuplication {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();

        Set<Character> rndApbSet = new HashSet<>();

        for (int i = 0; rndApbSet.size() < 50; i++) {
            int rndApbNum = randomGenerator.make(123);
            if ((rndApbNum > 64 && rndApbNum < 91) || (rndApbNum > 96 && rndApbNum < 123)) {
                rndApbSet.add((char) rndApbNum);
            }
        }
        System.out.println(rndApbSet);
        System.out.println(rndApbSet.size());
    }
}
