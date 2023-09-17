import java.util.Scanner;

public class Qn12Registration {
    Scanner input=new Scanner(System.in);
    private String email;
    private String userName;
    private String password;

    public Qn12Registration(String email, String userName, String password) {
    }

    public void setEmail(String email){
        this.email=email;
            if (!email.endsWith("@yahoo.com")||!email.endsWith("@yahoo.co.uk")) {
                System.out.println("Email must contain @yahoo.com or @yahoo.co.uk");
            }
    }
    public void setUserName(String userName){
            this.userName=userName;
            if (userName.isEmpty()||(userName.length()<6)) {
                System.out.println("Username cannot be empty and should be of length larger than 6 characters");
            }
    }

    public void setPassword(String password){
            this.password=password;
            if (password.length()<6||password.contains(userName)) {
                System.out.println("Pass cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain username.");
            }
    }

    String getEmail(){
        return email;
    }
    String getUserName(){
        return userName;
    }String getPassword(){
        return password;
    }
}
