import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class customerRegisterBoxGUI extends JFrame implements ActionListener {

    JFrame theBox=new JFrame();
    JPanel panel=new JPanel();
    JLabel message;
    JLabel loginLabel;
    JLabel passLabel;
    JTextField loginID;
    JPasswordField password;
    JButton backButton;
    JLabel message1;
    JButton registerButton;
    int click;

    customerRegisterBoxGUI(){
        theBox.setSize(500,500);
        theBox.add(panel);
        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);
        message=new JLabel();
        message.setFont(new Font(" ",Font.BOLD+Font.ITALIC,20));
        message.setText("REGISTER YOUR ACCOUNT");
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

        registerButton=new JButton("REGISTER");
        registerButton.setBounds(300,200,100,25);
        registerButton.addActionListener( this);
        panel.add(registerButton);

        backButton=new JButton("BACK");
        backButton.setBounds(110,200,100,25);
        backButton.addActionListener( this);
        panel.add(backButton);

        message1=new JLabel("");
        message1.setBounds(100,250,4000,25);
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

        else if(e.getSource().equals(registerButton))
        {

            String name=loginID.getText();
            String pass=password.getText();
            message1.setText("your account has been registered now go back");
            customer obj=new customer();

            try {
                obj.register(name,pass);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            admin obj1=new admin();
            obj1.setLoginID(name);
            obj1.setPass(pass);
            obj1.verifyCustomer();

        }
    }
}
