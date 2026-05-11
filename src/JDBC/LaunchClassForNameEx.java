package JDBC;

public class LaunchClassForNameEx {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("JDBC.Demo"); //order to load the class without instance
//        Class.forName("JDBC.Demo").newInstance(); //to load the instance as well.



    }
}

class Demo{
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance block ==> Non static");
    }
}