package Study221017_221021.Study221017;


import java.util.Scanner;

public class Star05 {
    private char letter;
    public void setLetter(char letter){
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void printStar(int input) {
        if (input < 1) return;
        printStar(input - 1);
        getLetter();
        System.out.print(letter);
    }

    public void printBlank(int input) {
        if (input < 1) return;
        System.out.print(" ");
        printBlank(input - 1);
    }

    public void printTopMid(int input) {
        Star05 star03 = new Star05();
        if (input < 0) return;
        for (int i = 1; i <= input; i++) {
            star03.printBlank(input - i);
            star03.printStar(2 * i - 1);
            System.out.println();
        }
    }
    public void printBottom(int input) {
        Star05 star03 = new Star05();
        if (input < 0) return;
        for (int i =input-1 ; i > 0; i--) {
            star03.printBlank(input - i);
            star03.printStar(2 * i - 1);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Star05 star03 = new Star05();
        Scanner sc = new Scanner(System.in);
        System.out.println("무슨 글자로 만드시겠습니까? 맨 앞글자만 사용");
        char inputLetter = sc.nextLine().charAt(0);
        star03.setLetter(inputLetter);
        System.out.println("꼭대기부터 중간까지의 높이를 입력해주세요");
        int input = sc.nextInt();

        star03.printTopMid(input);
        star03.printBottom(input);
    }
}