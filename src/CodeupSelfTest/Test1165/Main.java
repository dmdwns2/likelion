package CodeupSelfTest.Test1165;
/*        지금 1반과 2반이 축구를 하고있다.

                축구경기 타임은 총 90분이고,

                현재 1반이 0점, 2반이 2점인 상황에서, 1반은 경남정보고 최고의 스트라이커인 성익이를 투입하기로 결정했다.

                성익이는 5분마다 골을 넣을 수 있는 능력을 가지고 있다.

        만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.

        (90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 동내심판인 성빈이는 성익이가 잘 되는 것을 싫어하기 때문에 추가시간 따위는 주지 않는다. )

        현재 경기타임과 우리팀의 득점이 입력으로 주어 질때, 성익이를 투입하면 우리팀의 최종 득점은 몇 점인지 출력하시오.*/


import java.util.Scanner;

public class Main {
    final static int endTime = 90;
    static int currentTime , currentScore;

    public static void input(){
        Scanner sc = new Scanner(System.in);
        currentTime = sc.nextInt();
        currentScore = sc.nextInt();
    }

    public static void play(int currentTime, int currentScore){
        int score = ((endTime - currentTime) / 5) + currentScore +1  ; // 남은시간 / 5분당 1골 + 현재점수 + 투입시 1골
        if((endTime - currentTime) % 5 == 0)
            score -= 1; // 90분에는 골을 못넣으니까 -1
        System.out.println(score);
    }

    public static void main(String[] args) {
        input();
        play(currentTime, currentScore);
    }
}
