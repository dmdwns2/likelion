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
