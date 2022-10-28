/*
package Study221024_221028.Study221026;

import Study221024_221028.Study221025.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnfinishedPlayer {
    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }
    private int size = 1000;

    public void setSize(int size) {
        this.size = size;
    }

    private List<Node>[] table = new ArrayList[size];

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public void insert(String key, int value) {
        // List
        int hashIdx = hash(key);
        if (this.table[hashIdx] == null) {
            this.table[hashIdx] = new ArrayList<>();
        }
        // Map, Object
        this.table[hashIdx].add(new Node(key, value));
    }


    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if (key.equals(node.getKey())) {
                return node.value;
            }
        }
        return null;
    }

    public String solution(String[] participant, String[] completion) throws NullPointerException {
        Map<String, Integer> memo = new HashMap<>();
        List<Node>[] table = new ArrayList[participant.length];

        System.out.println(participant[0]);
        System.out.println(completion[0]);
        for (int i = 0; i < participant.length; i++) { // 참가자들의 value를 1로 주고
            String key = participant[i];
            memo.put(key, 1);
            table[i].add();
            System.out.println(table[i]);
        }
        for (int i = 0; i < completion.length; i++) {  // 완주한 사람들의 value를 0으로 변경 그러면 한명만 남는다.
            String key = completion[i];
            memo.put(key, 0);
            table[i].add();
            System.out.println(table[i]);
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
//                if (table[i].get(memo.get(key)) == 1)
//                    return table[i].get(j).get(memo.get(1)).toString();
            }
        }

        return "";
    }

    public static void main(String[] args) {
            UnfinishedPlayer up = new UnfinishedPlayer();
            String[] pp = {"dkdk", "rkrk", "sksk"};
            String[] cp = {"rkrk", "dkdk"};

            up.setSize(pp.length);
            up.solution(pp, cp);
    }
}
*/
