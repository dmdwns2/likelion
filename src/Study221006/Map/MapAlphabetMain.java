package Study221006.Map;

import java.util.HashMap;

public class MapAlphabetMain {
    public static void main(String[] args) {
        IsAlphabet isAlphabet = new IsAlphabet();
        String repoAddr = "https://github.com/dmdwns2/java-git-init";

        HashMap<Character, Integer> alphabetCnt = new HashMap<>();
        for(char c = 'A'; c < 'Z'; c++)
            alphabetCnt.put(c, 0);


        for(int i = 0;i < repoAddr.length(); i++){
            char repoChar = repoAddr.charAt(i);
            if(repoChar >= 'a' && repoChar <= 'z')
                repoChar -= 32;
            if(isAlphabet.isAlphabet(repoChar)){
                alphabetCnt.put(repoChar, alphabetCnt.get(repoChar)+1);
            }

        }
        System.out.println(alphabetCnt);
    }

}
