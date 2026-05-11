package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListSmallerElement {
    static List<Integer> getSmallerElements(int[] arr, int k){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<k){
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {10,40,80,30,20,15};
        int k = 30;
        List<Integer> list = getSmallerElements(arr,k);
        for(Integer x : list){
            System.out.print(x + ",");
        }
    }
}
