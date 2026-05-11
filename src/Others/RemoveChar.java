package Others;

public class RemoveChar {
    public static void removeChar(StringBuilder s, char c) {
        int j = 0;

        // Loop through the StringBuilder
        for (int i = 0; i < s.length(); i++) {

            // If the current character is not the one to be removed
            if (s.charAt(i) != c) {

                // Move the character to the position indicated by j
                s.setCharAt(j++, s.charAt(i));
            }
        }
        // Delete the remaining characters
        s.delete(j, s.length());
    }

    public static void main(String[] args) {

        // Input string as a StringBuilder
        StringBuilder s = new StringBuilder("geeksforgeeks");

        // Remove character 'g' from the string
        removeChar(s, 'f');

        // Print the modified string
        System.out.println(s);
    }
    }
