import java.util.Arrays;

public class Question5Anagrams {
    /*Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.*/
     static boolean anagram(String text1, String text2){
         // Remove spaces and convert to lowercase (assuming case-insensitive comparison)
         text1 = text1.replaceAll("\\s", "").toLowerCase();
         text2 = text2.replaceAll("\\s", "").toLowerCase();

         // Check if lengths are equal
         if (text1.length() != text2.length()) {
             return false;
         }

         // Converting both strings to character arrays and sorting them
         char[] charArray1 = text1.toCharArray();
         char[] charArray2 = text2.toCharArray();
         Arrays.sort(charArray1);
         Arrays.sort(charArray2);

         // Comparing the sorted arrays
         return Arrays.equals(charArray1, charArray2);
     }

    public static void main(String[] args) {
        String text1 = "night";
        String text2 = "thing";

        if (anagram(text1, text2)) {
            System.out.println(text1 + " and " + text2 + " are anagrams.");
        } else {
            System.out.println(text1 + " and " + text2 + " are not anagrams.");
        }





     }

}

