package ExceptionHandling;

public class ExceptionHandlingUsingThrow {
    public static void main(String[] args) {
        try {
            divide(2,0);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    static int divide(int a, int n) throws ArithmeticException{
        if(n==0)
            throw new ArithmeticException("Divide by zero is not allowed.");
        return a/n;
    }
}
