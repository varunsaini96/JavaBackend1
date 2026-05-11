package Others;

import java.util.Scanner;

public class LastDigitOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        getLastDigit(n);

    }

    static void getLastDigit(int n){
        n = n%10;
        System.out.println("The last digit of the number is: "+ n);
    }
}
