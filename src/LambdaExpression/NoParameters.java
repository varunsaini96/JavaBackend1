package LambdaExpression;

public class NoParameters {
    interface Test1{
        void print();
    }

    static void fun(Test1 t){
        t.print();
    }

    public static void main(String[] args) {
        fun(()->System.out.println("Hello"));
//        Test1 obj = new Test1() {
//            public void print() {
//                System.out.println("Hello");
//            }
//        };
//        fun(obj);
    }
}
