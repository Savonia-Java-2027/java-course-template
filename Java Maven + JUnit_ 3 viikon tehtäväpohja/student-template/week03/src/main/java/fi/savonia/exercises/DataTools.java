package fi.savonia.exercises;
public class DataTools {
    // Return sum of array values; empty array returns 0. Input is non-null.
    public static int sum(int[] values) {
        int result = 0;
        for (int i = 0; i < values.length ; i++) {
            result += values[i];
        }
        return result; // TODO
    }
    // Count occurrences of character c in text (case-sensitive). Input is non-null.
    public static int countChar(String text, char c) {
        int charC = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c)
                charC++;
        }
        return charC; // TODO
    }
    // Return reversed text. Input is non-null.
    public static String reverse(String text) {
        StringBuilder sbText = new StringBuilder();
        sbText.append(text).reverse();

        return sbText.toString(); // TODO
    }
}
