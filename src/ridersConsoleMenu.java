import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ridersConsoleMenu {



    public void riderLogin() throws FileNotFoundException {

        System.out.println("WELCOME TO YOUR ACCOUNT");
        System.out.println("Following is your order detail");
        System.out.println("PRESS 1: to view orders");
        System.out.println("PRESS 2: to verify deleivery status");
        System.out.println("PRESS 3: to update cash update");
        Scanner c=new Scanner(System.in);
        int choice=c.nextInt();
        if(choice==1)
        {
            rider obj=new rider();
            obj.viewOrder();
        }
        else if(choice==2)
        {
            rider obj=new rider();
            obj.foodDeleiveryStatus();
        }
        else if(choice==3)
        {
            rider obj=new rider();
            obj.cashUpdate();
        }




    }


    }

