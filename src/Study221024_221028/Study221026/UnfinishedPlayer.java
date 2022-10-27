package Study221024_221028.Study221026;

import Study221024_221028.Study221025.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        List<Map<String, Integer>>[] table = new ArrayList[participant.length];
        int result;

        for (int i = 0; i < participant.length; i++) { // 참가자들의 value를 1로 주고
            String key = participant[i];
            memo.put(key, 1);
            table[i].add(memo);
        }
        for (int i = 0; i < completion.length; i++) {  // 완주한 사람들의 value를 0으로 변경 그러면 한명만 남는다.
            String key = completion[i];
            memo.put(key, 0);
            table[i].add(memo);
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i].get(j).get(memo.get(1)) == 1)
                    return table[i].get(j).get(memo.get(1)).toString();
            }
        }

        return "";
    }

    public static void main(String[] args) {

    }
}
