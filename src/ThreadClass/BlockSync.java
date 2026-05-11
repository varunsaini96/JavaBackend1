package ThreadClass;

public class BlockSync {
        public void wish(String name)
        {
            //100  lines of code
            synchronized (this){
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Good Morning: " + name);
                }
            }
            //100 lines of code
        }
    }

    class Thread4 extends Thread {

        BlockSync d;
        String name;

        Thread4(BlockSync d, String name)
        {
            this.d = d;
            this.name = name;
        }

        @Override public void run() { d.wish(name); }
    }
    class Test4 {
        public static void main(String... args)
                throws InterruptedException
        {
            BlockSync d = new BlockSync();
            Thread4 t1 = new Thread4(d, "sachin");
            Thread4 t2 = new Thread4(d, "rohit");
            t1.start();
            t2.start();
        }
    }
