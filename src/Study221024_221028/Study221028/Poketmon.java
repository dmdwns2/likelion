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
        System.out.println(set.size()); // 중복 분리 확인

        if(set.size() % 2 ==0){ // 중복된 배열이 짝수인 경우
            return set.size() / 2;
        }
        else {
            return set.size() / 2 + 1;
        }

    }

    public static void main(String[] args) {
        Poketmon poketmon = new Poketmon();
        int[] nums ={1,2,1,4};
        poketmon.solution(nums);
    }
}
