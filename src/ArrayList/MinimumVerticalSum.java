package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumVerticalSum {
    public static int minVerticalSum(ArrayList<ArrayList<Integer>> arr){
//        step1: Find the maximum number of columns
        int maxCol=0;
        for(ArrayList<Integer> row : arr){
            maxCol = Math.max(maxCol,row.size());
        }
        // taking minSum as maximum value since if we use 0 it would be minium.
        int minSum = Integer.MAX_VALUE;

        //getting the value row,col where i is using for column and j is using for row.
        for (int i = 0; i < maxCol; i++) {
            int sum=0;
            for(int j=0; j<arr.size(); j++){
                if(arr.get(j).size()>i) {
                    sum += arr.get(j).get(i);
                }
            }
            minSum = Math.min(minSum,sum);
        }
        return minSum;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5)));
        arr.add(new ArrayList<>(Arrays.asList(6, 7, 8, 9)));

        System.out.println(minVerticalSum(arr));
    }
}
