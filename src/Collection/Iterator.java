package Collection;
import java.util.*;


public class Iterator {

    static void removeEven(Collection<Integer> C){
        java.util.Iterator<Integer> it = C.iterator();
        while (it.hasNext()){
            int x = (Integer)it.next();
            if(x%2==0) it.remove();
        }
    }

    public static void main(String[] args) {
        Collection<Integer> C = new ArrayList<>();
        C.add(10);
        C.add(15);
        C.add(20);
        System.out.println(C);
        removeEven(C);
        System.out.println(C);
    }
}
