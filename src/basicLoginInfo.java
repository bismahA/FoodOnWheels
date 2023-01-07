import java.util.ArrayList;

public class basicLoginInfo {

    String userName;
    String password;


    public basicLoginInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public basicLoginInfo() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

@Override
    public String toString(){
        return getUserName()+","+getPassword();
}
}
