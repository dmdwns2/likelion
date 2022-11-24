package Study221004_221006.Study221006.File;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

    private String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }
    public String getFilename(){
        return this.filename;
    }
    public String readFileMethod(String str) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(str), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                return line;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "";
    }
}
