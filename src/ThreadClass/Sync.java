package ThreadClass;

public class Sync {

        synchronized void wish(String name)
        {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Good Morning: " + name);
            }
        }
    }

    class Thread3 extends Thread {

        Sync d;
        String name;

        Thread3(Sync d, String name)
        {
            this.d = d;
            this.name = name;
        }

        @Override public void run() { d.wish(name); }
    }
    class Test3 {
        public static void main(String... args)
                throws InterruptedException
        {
            Sync d = new Sync();
            Thread3 t1 = new Thread3(d, "dhoni");
            Thread3 t2 = new Thread3(d, "yuvi");
            t1.start();
            t2.start();
        }
    }
