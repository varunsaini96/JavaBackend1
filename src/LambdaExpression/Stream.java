package LambdaExpression;

import java.util.*;

public class Stream {
    public static void main(String[] args) {
        int[] arr = {30,20,10};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg);
    }
}
