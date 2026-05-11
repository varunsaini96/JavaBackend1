package Collection;

import java.util.ArrayList;

class Student{
    String name;
}

class EngStd extends Student{
    String name;
}

public class Wildcard {
    public static void main(String[] args) {
        ArrayList<?> al4 = new ArrayList<>();//? means all with any datatypes.
        ArrayList<?extends Student> al1 = new ArrayList<>();//?extends means all the decentends of Student includint it.
        ArrayList<?super Student> al3 = new ArrayList<>();//?super means all the accentends of Student including it
        ArrayList<EngStd> al2 = new ArrayList<EngStd>();
    }
}
