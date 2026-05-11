package Collection;


class Check <A,B>{
    A name;
    B rollNo;

    Check(A name, B rollNo){
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Name is " + name + " and Roll no. is " + rollNo);
    }
}
public class GenericClass {
    public static void main(String[] args) {
        Check <String,Integer>c = new Check<>("Varun",123);
        Check <Integer,String> c2 = new Check<>(456, "Kary");
    }
}
