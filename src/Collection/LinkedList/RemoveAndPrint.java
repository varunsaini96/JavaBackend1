package Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveAndPrint {
    static class MyDS {
        LinkedList<Integer> list = new LinkedList<>();

        void add(int n) {
            list.add(n);
        }

        void removeAndPrint(int x) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                Integer n = (Integer)it.next();
                if (n.equals(x)) it.remove();
                else System.out.print(n + ",");
            }

        }
    }

    public static void main(String[] args) {
        MyDS d = new MyDS();
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(10);
        d.removeAndPrint(10);
    }
}

