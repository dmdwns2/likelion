package Study221012;


import java.util.Scanner;

class CreateArr {
    public String[][] createArr() {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[9][9]; // 9x9

        // 한줄씩 받아서 2차원배열에 넣는 방법 (한번 짜두면 나중에 편함)
        for (int i = 0; i < 9; i++) {
            String str = sc.nextLine();
            String rows[] = str.split(" ");

            for (int r = 0; r < 9; r++) {
                arr[i][r] = rows[r];

            }
        }
        return arr;
    }
}

class Compare {
    public void compare(String[][] arr) {
        int max = 0;
        int indexk = 0;
        int indexl = 0;
        boolean maxCheck = true;
        // 비교하고 인덱스 저장 로직
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr.length; l++) {
                if (Integer.parseInt(arr[k][l]) > max) {
                    max = Integer.parseInt(arr[k][l]);
                    indexk = k;
                    indexl = l;
                }
            }
        }
        System.out.println(max);
        System.out.println((indexk + 1) + " " + (indexl + 1));
    }
}

public class MinMax {
    public static void main(String[] args) {
        CreateArr createArr = new CreateArr();
        Compare compare = new Compare();

        compare.compare(createArr.createArr());





    }
}
