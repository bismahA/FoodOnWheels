import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class customerLoginBoxGUI extends JFrame implements ActionListener {

    JFrame theBox=new JFrame();
    JPanel panel=new JPanel();
    JLabel message;
    JLabel loginLabel;
    JLabel passLabel;
    JTextField loginID;
    JPasswordField password;
    JButton loginButton;
    JButton backButton;
    JButton addButton;
    JLabel message1;



     public void customerLoginBoxGUI(){
        theBox.setSize(500,500);
        theBox.add(panel);
        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);
        message=new JLabel();
        message.setFont(new Font(" ",Font.BOLD+Font.ITALIC,20));
        message.setText("CUSTOMER LOGIN PORTAL");
        message.setBounds(135,10,800,20);
        panel.add(message);

        loginLabel=new JLabel("LOGIN ID");
        loginLabel.setBounds(110,100,80,25);
        panel.add(loginLabel);

        loginID=new JTextField(20);
        loginID.setBounds(210,100,165,25);
        panel.add(loginID);

        passLabel=new JLabel("PASSWORD");
        passLabel.setBounds(110,150,80,25);
        panel.add(passLabel);

        password=new JPasswordField(50);
        password.setBounds(210,150,165,25);
        panel.add(password);

        loginButton=new JButton("LOGIN");
        loginButton.setBounds(300,200,100,25);
        loginButton.addActionListener( this);
        panel.add(loginButton);

        backButton=new JButton("BACK");
        backButton.setBounds(110,200,100,25);
        backButton.addActionListener( this);
        panel.add(backButton);

        message1=new JLabel("");
        message1.setBounds(90,250,1000,20);
        panel.add(message1);


        theBox.setVisible(true);
    }

    public void errorMessage(){

        loginID.setText("");
        password.setText(null);
        message1.setText("INCORRECT! Id or password please try again and go back");
        panel.add(loginID);
        panel.add(password);
         panel.add(message1);
         theBox.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(backButton))
        {
            customerMainMenuGUI obj=new customerMainMenuGUI();
            obj.setVisible(true);
        }

        if(e.getSource().equals(loginButton))
        {

            String name=loginID.getText();
            String pass=password.getText();
            allArrays obj1=new allArrays();
            //ArrayList<basicLoginInfo> regArray= obj1.customerArray();
            customer obj=new customer();


            try {
                obj.login(name,pass);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            obj.setVisible(true);
        }

    }
}
