import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class admin extends basicLoginInfo {

    String loginID;
    String pass;

    public admin() {
        super();
    }

    public admin(String userName, String password, String loginID, String pass) {
        super(userName, password);
        this.loginID = loginID;
        this.pass = pass;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void fun(){
        System.out.println("Press 1: to verify customer");
        System.out.println("Press 2: to verify resturant");
        System.out.println("Press 3: to verify rider");
        Scanner o=new Scanner(System.in);
        int choice=o.nextInt();
        if(choice==1)
        {
            admin obj=new admin();
            obj.verifyCustomer();
        }
        else if(choice==2)
        {
            admin obj=new admin();
            obj.verifyResturant();
        }
        else if(choice==3)
        {
            admin obj=new admin();
            obj.verifyRider();
        }

    }


    public void verifyCustomer(){
        System.out.println("user ID="+getUserName());
        System.out.println("password="+getPassword());
        Scanner l=new Scanner(System.in);
        System.out.println("verify?");
        String cho=l.nextLine();


    }

    public void verifyResturant(){
        System.out.println("user ID="+getUserName());
        System.out.println("password="+getPassword());
        Scanner l=new Scanner(System.in);
        System.out.println("verify?");
        String cho=l.nextLine();

    }
    public void verifyRider(){
        System.out.println("user ID="+getUserName());
        System.out.println("password="+getPassword());
        Scanner l=new Scanner(System.in);
        System.out.println("verify?");
        String cho=l.nextLine();

    }
}
