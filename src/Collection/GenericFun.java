package Collection;

public class GenericFun {
    public static void main(String[] args) {
        Integer []arr = {1,2,3,4,5};
        Integer n = 3;

        System.out.println(count(arr,n));
    }
    static <T> int count(T arr[], T n){
        int res = 0;
        for(T e:arr){
            if(e.equals(n)) res++;
        }
        return res;
    }

}
