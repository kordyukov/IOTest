import javax.annotation.processing.Filer;
import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        File file;
        FileWriter fileWriter1 = null;
        try {
            file = new File("2.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            String str = " 11111111";
            fileWriter1 = new FileWriter(file,true);
            fileWriter1.write(str);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileWriter1.close();
        }
    }
}
