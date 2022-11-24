package Study221004_221006.Study221006.File;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileMain {

    private String filename;

    public ReadFileMain(String filename) {
        this.filename = filename;
    }

    char readAByte(String filename) {
        try(BufferedReader br = Files.newBufferedReader(Paths.get("a_file.txt"), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                for (int i = 0; i< line.length(); i++)
                System.out.println(line.charAt(i));
            }
        }catch(IOException e){
                throw new RuntimeException(e);
            }
        return ' ';
    }

    public static void main(String[] args) {
        ReadFileMain readFileMain = new ReadFileMain("");
        readFileMain.readAByte("a_file.txt");
    }
}
