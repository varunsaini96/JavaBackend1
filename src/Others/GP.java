package Others;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the common ratio: ");
        int r = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("The nth term of Others.GP series is: " + GPN(r, n));

    }

    static int GPN(int r, int n) {
        int ans = 1;
        for (int i = 1; i <= n-1; i++) {
            ans = ans * r;
        }
        return ans;
    }
}
