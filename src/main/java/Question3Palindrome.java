public class Question3Palindrome {

    /*Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.*/

    public static void main(String[] args) {
        String word="madam";
        String reversedWord="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversedWord=reversedWord+word.charAt(i);

        }
        System.out.print(reversedWord);
        System.out.println(" Is palindrome?: "+ reversedWord.equals(word));

    }

}
