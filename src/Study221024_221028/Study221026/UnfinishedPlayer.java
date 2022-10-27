package Study221024_221028.Study221026;

import Study221024_221028.Study221025.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            memo.put(key, 1);
        }

        for(int i = 0; i < completion.length; i++){
            String key = completion[i];
            memo.put(key,0);
        }
        for(String key : memo.keySet()){
            if (memo.get(key) == 1) {
                return key;
            }
        }
        return "";
    }

    public static void main(String[] args) {

    }
}
