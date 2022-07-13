import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("1.txt");
             InputStreamReader isr = new InputStreamReader(fileInputStream,"UTF-8");){

            int b;
            while ((b = isr.read()) != -1){
                System.out.print(((char) b));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
