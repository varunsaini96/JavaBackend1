package ThreadClass;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("Child Thread");
        }
    }
}
// defining a thread(writing a class and extending a Thread)
// job a thread(code written inside run())

class client{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); //starting a thread
        for (int i=0; i<5; i++){
            System.out.println("Main Thread");
        }
    }
}


//Behind the scene: Main thread is created automatically by JVM.
//Main thread creates child thread and starts the child thread.

//start()
//{
//    1 - Register thread with ThreadScheduler.
//    2 - All other mandatory low level activities.
//    3 - Invoke or calling run() method.
//}