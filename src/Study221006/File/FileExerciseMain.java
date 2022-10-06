package Study221006.File;

import java.io.File;

public class FileExerciseMain {
    public static void main(String[] args) {
        // ./
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}

/* 출력 결과
./aa_file.txt
        ./.DS_Store
        ./out
        ./README.md
        ./java-git-init.iml
        ./.git
        ./a_file.txt
        ./.idea
        ./src*/
