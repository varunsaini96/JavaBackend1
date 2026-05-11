package WorkingWithFile;

import java.io.*;

public class WritingReadingFileUsingInputOutputSteam {
    public static void main(String[] args) {

        FileInputStream inp = null;
        FileOutputStream out = null;
        try {
            inp = new FileInputStream("File1.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            out = new FileOutputStream("FileOut.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        int c = 0;
            try {
                while ((c=inp.read())!=-1){
                    System.out.print((char)c);
                    out.write(c);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }

    }
