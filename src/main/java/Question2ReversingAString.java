import java.io.FilterOutputStream;

public class Question2ReversingAString {

    /*Reverse a String: Write a function to reverse a given string. For
    example, given the input "Hello", the output should be "olleH".*/

    public static void main(String[] args) {
        String text="Hello";
        String reversed="";
        for (int i = text.length()-1; i >=0 ; i--) {

            reversed=reversed+text.charAt(i);
        }
        System.out.println("The reversed text is: "+reversed);
    }

}
