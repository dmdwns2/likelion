package Study221024_221028.Study221028;

import java.util.HashSet;
import java.util.Set;

public class Poketmon {

    public int solution(int[] nums){
        // Set에 포켓몬 배열을 받음
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        System.out.println(set.size()); // 확인
        return 0;

/*
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums. length; i++){
            set.add(nums[i]);
        }
        int N = nums.length / 2;

        if (set.size() < N) {
            return set.size();
        }
        else {
            return N;
        }
*/

    }

    public static void main(String[] args) {
        Poketmon poketmon = new Poketmon();
        int[] nums ={1,2,1,4};
        poketmon.solution(nums);
    }
}
