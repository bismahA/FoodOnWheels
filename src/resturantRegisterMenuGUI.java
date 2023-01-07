import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class resturantRegisterMenuGUI extends JFrame implements ActionListener {
    JFrame theBox=new JFrame();
    JPanel panel=new JPanel();
    JLabel message;
    JLabel loginLabel;
    JLabel passLabel;
    JLabel restLabel;
    JTextField resturant;
    JTextField loginID;
    JPasswordField password;
    JButton backButton;
    JLabel message1;
    JButton registerButton;
    int click;

    resturantRegisterMenuGUI(){
        theBox.setSize(500,500);
        theBox.add(panel);
        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);
        message=new JLabel();
        message.setFont(new Font(" ",Font.BOLD+Font.ITALIC,20));
        message.setText("REGISTER YOUR ACCOUNT AND HOTEL");
        message.setBounds(105,10,800,20);
        panel.add(message);

        restLabel=new JLabel("RESTURANT NAME");
        restLabel.setBounds(90,100,300,25);
        panel.add(restLabel);

        resturant =new JTextField(20);
        resturant.setBounds(210,100,165,25);
        panel.add(resturant);

        loginLabel=new JLabel("LOGIN ID");
        loginLabel.setBounds(110,150,80,25);
        panel.add(loginLabel);

        loginID=new JTextField(20);
        loginID.setBounds(210,150,165,25);
        panel.add(loginID);

        passLabel=new JLabel("PASSWORD");
        passLabel.setBounds(110,200,80,25);
        panel.add(passLabel);

        password=new JPasswordField(50);
        password.setBounds(210,200,165,25);
        panel.add(password);


        registerButton=new JButton("REGISTER");
        registerButton.setBounds(300,250,100,25);
        registerButton.addActionListener( this);
        panel.add(registerButton);

        backButton=new JButton("BACK");
        backButton.setBounds(110,250,100,25);
        backButton.addActionListener( this);
        panel.add(backButton);

        message1=new JLabel("");
        message1.setBounds(100,300,4000,25);
        panel.add(message1);

        theBox.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(backButton))
        {
            resturantMainMenuGUI obj=new resturantMainMenuGUI();
            obj.setVisible(true);
        }

        else if(e.getSource().equals(registerButton))
        {

            allArrays obj2=new allArrays();
            ArrayList<resturantMenuBasicInfo> newAccountArray=new ArrayList<resturantMenuBasicInfo>();
            String name=loginID.getText();
            String pass=password.getText();
            String rest=resturant.getText();
            admin obj1=new admin();
            obj1.setLoginID(name);
            obj1.setPass(pass);
            obj1.verifyResturant();
            message1.setText("your account has been registered now go back");
            resturant obj=new resturant();

            try {
                obj.createAccount(rest,name, pass);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            System.out.println("PRESS 1: If you want to add your hotel's food details");
            System.out.println("PRESS 2: if you want to exit");
            Scanner t=new Scanner(System.in);
            int choice=t.nextInt();
            do {
                if(choice==1)
                {
                    System.out.println("enetr the name of dish");
                    Scanner y=new Scanner(System.in);
                    String dish=y.nextLine();
                    System.out.println("enetr the price of dish");
                    Scanner r=new Scanner(System.in);
                    Double price=y.nextDouble();
                    resturantMenuBasicInfo item=new resturantMenuBasicInfo(dish,price);
                    newAccountArray.add(item);

                }

            }
            while(choice!=1);



        }
    }
}
