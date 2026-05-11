package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e){
            System.out.println("Arithmatic exception handled.\n" + e);
        } catch (FileNotFoundException e){
            System.out.println("File not found exception handled.\n" + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound exception is handled.\n" + e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally it is executed :)");
        }
    }

    static void methodA() throws Exception{
        int a = 10;
        int b = 0;
        int c = a/b;

        Scanner sc = new Scanner(new File("file1.txt"));

        int arr[] = {1,2};

        int d = arr[2];
    }
}
