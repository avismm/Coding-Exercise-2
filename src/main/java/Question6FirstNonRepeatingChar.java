import java.util.ArrayList;

public class Question6FirstNonRepeatingChar {
    /*Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c.*/

    public static char findFirstNonRepeatingChar(String text) {

        /*Create an ArrayList to store character frequencies.
        We use an ArrayList<Integer> to store character frequencies because it allows dynamic sizing and is easier to
        work with in Java. We initialize it to hold 256 elements, corresponding to the ASCII character range.*/

        ArrayList<Integer> charCount = new ArrayList<>(256);

        // Initialize the character frequencies to 0
        for (int i = 0; i < 256; i++) {
            charCount.add(0);
        }

        // Count the frequency of each character
        for (char c : text.toCharArray()) {
            charCount.set(c, charCount.get(c) + 1);
        }

        /*Iterate through the string to find the first non-repeating character.
        The program iterates through each character in the text string. Converts the string input
        into a character array using toCharArray() and assigns each character to the variable c one by one.

        Inside the loop, it checks the frequency count of the current character c in the charCount array.
        If the count is equal to 1, it means that c is a non-repeating character because it appears
        only once in the string*/
        for (char c : text.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

       /* If no non-repeating character is found, return a default character (e.g., '\0')
        i.e.,if the program doesn't find a non-repeating character in the string,
        it will return the null character to signal that there was no match.*/
        return '\0';
    }

    public static void main(String[] args) {
        String input = "this is the day the lord has made";
        char firstNonRepeating = findFirstNonRepeatingChar(input);

        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
    }
}

