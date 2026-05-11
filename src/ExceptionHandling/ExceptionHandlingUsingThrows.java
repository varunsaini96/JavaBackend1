package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingUsingThrows {
    public static void main(String[] args) {
        methodA();
    }
    static void methodA(){
        try {
            methodB(); //throws makes it unhandled here in methodA().
        } catch (FileNotFoundException e) {
            System.out.println("Exception handled in methodA().");
            System.out.println(e);
        }
    }

    static void methodB() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("File1.txt")); //Unhandled exception
    }
}
