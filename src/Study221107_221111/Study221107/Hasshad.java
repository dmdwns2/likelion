package Study221107_221111.Study221107;

public class Hasshad {
    public boolean solution(int x) {

        int sum = 0;
        int answer = x;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }


        if (answer % sum == 0)
            return true;
        else
            return false;
    }
}
