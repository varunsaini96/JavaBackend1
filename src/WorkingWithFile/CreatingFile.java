package WorkingWithFile;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        File f = new File("File1.txt");
        System.out.println(f.isFile());
        try {
            if(f.createNewFile()){
                System.out.println("File has been created.");
            } else System.out.println("File is already exists.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("File exists: " + f.isFile());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.canExecute());
        System.out.println(f.getAbsolutePath());
    }
}
