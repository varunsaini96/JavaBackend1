package LambdaExpression;

public class MultipleParameters {
    interface Test3{
        void print(Integer a1, Integer a2);
    }

    static void fun3(Test3 t, Integer a1, Integer a2){
        t.print(a1, a2);
    }

    public static void main(String[] args) {
        fun3((a1,a2)-> System.out.println(a1+a2),10,20);
    }
}
