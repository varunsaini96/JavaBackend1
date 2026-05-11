package Others;

public class CountWords {
    public static int countWords(String str) {
        int count =0;
        // check: current char is not space AND
        // (first char OR previous char is space)
        for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != ' ' &&
                (i == 0 || str.charAt(i - 1) == ' ')) {
            count++;
        }
    }

    return count;

}

    public static void main(String[] args) {
        System.out.println(countWords("vnjb                   wruzlkkyi"));
    }

}
