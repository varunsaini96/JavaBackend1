package Others;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialUsingBigInt {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("1");
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger c = null;

        for (int i = 1; i <= n; i++) {
            c = c.valueOf(i);
            b = b.multiply(c);
        }
        System.out.println(b);
    }
}
