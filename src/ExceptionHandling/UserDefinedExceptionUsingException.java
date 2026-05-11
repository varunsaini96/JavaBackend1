package ExceptionHandling;

class IllegalAgeException2 extends Exception {
    public IllegalAgeException2(String msg) {
        super(msg);
    }
}

class Voting2 {
    public String name;
    public int age;

    public Voting2(String name, int age) throws IllegalAgeException2 { //need to menthion this if extending Exception.
        if (age < 18) throw new IllegalAgeException2("The voter is not valid to vote.");
        this.name = name;
        this.age = age;

        System.out.println("Name: " + name + " and Age: " + age);
    }
}


public class UserDefinedExceptionUsingException {
    public static void main(String[] args) {
        try {
            Voting v1 = new Voting("Alex", 12);
        } catch (Exception e){
            System.out.println(e);
        };
        try {
            Voting v2 = new Voting("Varun", 27);
        } catch (Exception e){
            System.out.println(e);
        };
    }
}
