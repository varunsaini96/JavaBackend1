package Collection.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Stack<Integer> s = new Stack<>();
        for(Integer i:list){
            s.push(i);
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i,s.pop());
        }


        System.out.println(list);
    }
}
