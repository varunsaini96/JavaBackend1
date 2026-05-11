package ThreadClass;
//This approach provides flexibility and a clean separation
//between the task you want to execute and the thread itself.

public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

class client2{
    public static void main(String[] args) {
        RunnableInterface r1 = new RunnableInterface(); //Create an Instance of Runnable class.
        Thread t2 = new Thread(r1); //Create a Thread and pass the Runnable Instance.
        t2.start(); //Start the Thread.
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
//Implements Runnable Interface is recommended because our class
//can extend other class through which inheritance benefit can brought in to our class.