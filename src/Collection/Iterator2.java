package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterator2 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(10,20,30,40,50);
        System.out.print(l+"\n");
        for(Integer x: l) System.out.print(x*2+" ");
        System.out.println();
        l.forEach(n-> System.out.print(n*3+" "));
        System.out.println();
        l.stream().filter(x->x>10).filter(x->x%2==0).forEach(x-> System.out.print(x+","));
//        stream is work like a pipeline
    }
}
