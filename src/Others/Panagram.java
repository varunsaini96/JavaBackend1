package Others;

public class Panagram {
        public static boolean isPangram(String str) {
            str = str.toLowerCase(); // make everything lowercase

            boolean[] seen = new boolean[26]; // for a-z

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch >= 'a' && ch <= 'z') {
                    seen[ch - 'a'] = true; //converting letter into index
                }
            }

            // check if all letters are present
            for (int i = 0; i < 26; i++) {
                if (!seen[i]) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            String str = "The quick brown fox jumps over the lazy dog";

            if (isPangram(str)) {
                System.out.println("Pangram");
            } else {
                System.out.println("Not Pangram");
            }
        }
}
