package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    class MathUtil{
        static void square(int n){
            System.out.println(n*n);
        }
    }

    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(10,20,30);
        list.forEach(MathUtil::square);
    }
}
