package Study221107_221111.Study221108;

public class BinaryExploration {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        final int TARGET = 8;
        int indexStart = 0;
        int indexEnd = nums.length;
        int median = nums.length / 2;
        int cnt = 0;

        // 중간값 찾기
        // 인덱스(시작점, 끝점) 옮기기
        // 같은지 비교하기
        while (true) {
            System.out.println("실행 횟수 :" + (++cnt));
//            System.out.println(median + " " + nums[median] + " " + indexEnd + " " + indexStart);  // 체크용
            if (nums[median] == TARGET) {
                System.out.println("찾는 값은 " + (median + 1) + "번 째에 있습니다. 값 : " + nums[median]);
                break;
            } else if (nums[median] > TARGET) {
                indexEnd = median;
                median = (indexEnd - indexStart) / 2 + indexStart;
            } else {
                indexStart = median;
                median = (indexEnd - indexStart) / 2 + indexStart;
            }
        }
    }
}
