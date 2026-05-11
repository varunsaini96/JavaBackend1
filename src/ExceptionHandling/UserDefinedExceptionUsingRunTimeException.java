package ExceptionHandling;

class IllegalAgeException extends RuntimeException {
    public IllegalAgeException(String msg) {
        super(msg);
    }
}

    class Voting {
        public String name;
        public int age;

        public Voting(String name, int age){
            if (age < 18) throw new IllegalAgeException("The voter is not valid to vote.");
            this.name = name;
            this.age = age;

            System.out.println("Name: " + name + " and Age: " + age);
        }
    }

    public class UserDefinedExceptionUsingRunTimeException {
        public static void main(String[] args) {
            try {
                Voting v1 = new Voting("Alex", 12);
            } catch (Exception e){
                System.out.println(e);
            };
            try {
                Voting v2 = new Voting("Varun", 27);
            } catch (Exception e){};
        }
    }

