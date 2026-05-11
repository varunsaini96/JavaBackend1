package Others;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(sum(n));
        sumFor(n);

    }

    static int sum(int n){
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans = ans + i;
        }
        System.out.println("Sum of n numbers: ");
        return ans;
    }

    static  void sumFor(int n){
        int s = n*(n+1)/2;
        System.out.println("Below we are calculating by formula: ");
        System.out.println(s);
    }
}
