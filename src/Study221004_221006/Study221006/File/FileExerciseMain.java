package Study221004_221006.Study221006.File;

import java.io.IOException;

public class FileExerciseMain {

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("a_file.txt");
        ReadNChar readNChar = new ReadNChar();
        String line = readFile.readFileMethod(readFile.getFilename());
        readNChar.readAChar(line);
        readNChar.read2Chars(line);
        readNChar.readNChar(line);
    }
}