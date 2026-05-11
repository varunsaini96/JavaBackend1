package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingUsingTryCatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("file1.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
    }
}
