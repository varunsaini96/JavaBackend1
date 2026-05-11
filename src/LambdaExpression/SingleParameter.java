package LambdaExpression;

public class SingleParameter {
    interface Test2{
        void print(Integer p);
    }

    static void fun2(Test2 t, Integer p){
        t.print(p);
    }

    public static void main(String[] args) {
        fun2(p-> System.out.println(p),10);
        //second way to execute.....
        Test2 t2 = (a)-> System.out.println(a);
        t2.print(5);
    }
}
