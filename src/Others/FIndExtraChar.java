package Others;

public class FIndExtraChar {
    public static char findExtracharacter(String s1, String s2){
        char result = 0;
        for(char ch : s1.toCharArray()){
            result ^= ch;
        }
        for(char ch : s2.toCharArray()){
            result ^= ch;
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "acdbe";
        System.out.println(findExtracharacter(s1,s2));
    }
}
