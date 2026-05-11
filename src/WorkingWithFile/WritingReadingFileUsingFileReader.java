package WorkingWithFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingReadingFileUsingFileReader {
    public static void main(String[] args) {
        FileReader inp = null;
        FileWriter out = null;

        try {
            inp = new FileReader("File1.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            out = new FileWriter("FileOut2.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        int c = 0;
        try {
            while ((c = inp.read()) != -1) {
                System.out.print((char)c);
                out.write(c);
            }
            out.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
