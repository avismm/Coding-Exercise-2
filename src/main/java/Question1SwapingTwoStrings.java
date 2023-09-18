public class Question1SwapingTwoStrings {

    //Write a program to swap 2 String without a temporary variable
    public static void main(String[] args) {
        String str1="Hi2bDa34%%%HHDu";
        String str2="ABCetrt%";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println();

        str1=str1+str2;
        str2=str1.replaceAll("ABCetrt%", "");
        str1=str1.replaceAll("Hi2bDa34%%%HHDu","");
        System.out.println(str1);
        System.out.println(str2);

    }

}
