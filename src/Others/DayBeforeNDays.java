package Others;

import java.util.Scanner;

public class DayBeforeNDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of d: ");
        int d = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(dayBefore(d,n));

    }

    static int dayBefore(int d, int n){
        int day = (d-(n%7)+7)%7;

        return day;
    }
}
