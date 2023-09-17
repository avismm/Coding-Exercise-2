import java.util.ArrayList;
import java.util.List;

/*Write a Java Function that increments a string,
It should take the string of unknown length. Don't use regular
expressions.
Examples:
123 -> 124
53456 -> 53457
29 -> 30
Function signature:
string Increment (string str)

*/
public class Question8IncrementingAString {

    public static String increment(String text) {
        // Convert the string to a character array
        char[] ch = text.toCharArray();

        // Initialize a incrementer variable to 1. This represents the value to be carried over when incrementing.
        int incrementer = 1;

      /*  Iterate through the characters from right to left. i.e., we iterate through the characters from right to left,
         handling each character one at a time. */

        for (int i = ch.length - 1; i >= 0; i--) {
            if (incrementer == 0) {
                break; // No need to continue if there's no incrementer
            }

            char currentCharacter = ch[i];

            /*Check if the character is a digit. If the character is a digit, we add the incrementer to it,
            calculate the new digit and incrementer, and update the character accordingly.*/
            if (Character.isDigit(currentCharacter)) {
                int digit = Character.getNumericValue(currentCharacter);
                int sum = digit + incrementer;
                incrementer = sum / 10;
                int newDigit = sum % 10;
                ch[i] = (char) ('0' + newDigit);
            } else {
                // If the character is not a digit, stop the incrementing process
                break;
            }
        }

//        If there's still incrementer after the loop, add it to the front of the string
//        by creating a new character array and copying the characters over.
        if (incrementer > 0) {
            char[] resultChars = new char[ch.length + 1];
            resultChars[0] = (char) ('0' + incrementer);
            System.arraycopy(ch, 0, resultChars, 1, ch.length);
            return new String(resultChars);
        } else {
            return new String(ch);
        }
    }
    public static void main(String[] args) {
        String text1 = "sugarcane123";
        String text2 = "migration";
        String text3 = "sensitization";

        System.out.println("Incremented text 1: " + increment(text1));
        System.out.println("Incremented text 2: " + increment(text2));
        System.out.println("Incremented text 3: " + increment(text3));
    }
}

