package ArrayList;

import java.util.ArrayList;

public class Methods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Varun");
        list.add("is");
        list.add("boy");
        System.out.println("List size is: "+list.size());
        System.out.println(list);
        list.add(2,"great");
        System.out.println(list);
        System.out.println("Is it contain Varun? "+list.contains("Varun"));
    }
}
