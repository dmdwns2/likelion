package Study221024_221028.Study221026;

import java.util.ArrayList;
import java.util.List;

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




/* get 튜닝과정 1
   public int get(String key){
        List<Node> nodes = this.table[hash(key)];
        return this.table[hash(key)];
    }*/

    //get 튜닝과정 2
    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if (key.equals(node.getKey())) {
                return node.value;
            }
        }
        return null;
    }



    public static void main(String[] args) {

        UnfinishedPlayer up = new UnfinishedPlayer();
        String[] participant = new String[up.size];
        String[] completion = new String[up.size-1];
ㅌ


    }
}
