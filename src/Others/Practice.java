package Others;

import java.util.ArrayList;
import java.util.Collections;

public class Practice {
    public static void main(String[] args)
    {
        int[] arr = {50,20,30};
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            list.add(arr[i]);
            i++;
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}