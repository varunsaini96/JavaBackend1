package Others;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "aabca";
        String s2 = "acaba";
        boolean result = areAnagram(s1,s2);
        System.out.println(result);
    }

    static final int CHAR = 256;
    public static boolean areAnagram(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        int count[] = new int[CHAR];
        for (int i = 0; i < s1.length(); i++) {
            System.out.println("s1-->" + count[s1.charAt(i)]++); //count[97]=0++==>1
            System.out.println("s2-->" + count[s2.charAt(i)]--);
        }
        for (int i = 0; i < CHAR; i++) {
            if(count[i]!=0) return false;
        }
        return true;
    }
}
