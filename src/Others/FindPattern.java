package Others;

public class FindPattern {
    public static int findPat(String s, String p){
        return s.indexOf(p);
    }

    public static void main(String[] args) {
        String s = "World";
        String p = "Doodle";
        System.out.println(findPat(s,p));
    }
}
