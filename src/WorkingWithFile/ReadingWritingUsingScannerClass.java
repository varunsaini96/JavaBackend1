package WorkingWithFile;

import java.io.*;
import java.util.Scanner;

public class ReadingWritingUsingScannerClass {
    public static void main(String[] args) {

        Scanner sc = null;
        try {
            sc = new Scanner(new File("File1.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        FileWriter out = null;
        try {
            out = new FileWriter("FileOut4.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        BufferedWriter out1 = new BufferedWriter(out);

        String line;
        try{
            while ((sc.hasNextLine())){
                line = sc.nextLine();
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
