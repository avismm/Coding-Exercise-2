import javax.swing.plaf.IconUIResource;

public class Question4CountWordsInString {
    /*Count the Number of Words in a String: Write a function to count the
    number of words in a given string. Words are separated by spaces or
    punctuation. For example, the input "Hello, world!" should return 2*/
    String text;
    int countWords(String text) {
        this.text=text;
        int count=0;
        char[] ch=new char[text.length()];
        for (int i = 0; i < text.length();i ++) {
            ch[i]=text.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
        count++;
        }
        return count;

    }
    public static void main(String[] args) {

        Question4CountWordsInString obj=new Question4CountWordsInString();
        System.out.println("The number of words is "+obj.countWords(" Easter Sunday"));

    }
}

