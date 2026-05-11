package WorkingWithFile;

import java.io.*;

public class ReadingWritingUsingBufferClass {
    public static void main(String[] args) {
        FileReader inp = null;
        try {
            inp = new FileReader("File1.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        FileWriter out = null;
        try {
            out = new FileWriter("FileOut3.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        BufferedReader inp1 = new BufferedReader(inp);
        BufferedWriter out1 = new BufferedWriter(out);

        String line;

        try {
            while ((line = inp1.readLine()) != null) {
                System.out.println(line);
                out1.write(line);
                out1.newLine();
            }
            out1.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
