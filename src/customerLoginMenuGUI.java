import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class customerLoginMenuGUI extends JFrame implements ActionListener {

     JLabel mainStatemnt;
     JLabel statemnt;
     JButton Button1;
     JButton Button2;
     JButton Button3;
     JButton Button4;
     JButton Button5;
    JFrame theBox=new JFrame();
    JPanel panel=new JPanel();

    public customerLoginMenuGUI(){

        theBox.setSize(500,500);
        theBox.add(panel);
        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);

        mainStatemnt=new JLabel();
        mainStatemnt.setFont(new Font("FOODS ON WHEELS",Font.BOLD+Font.ITALIC,20));
        mainStatemnt.setText("WELCOME to your account");
        mainStatemnt.setBounds(110,10,800,20);
        panel.add(mainStatemnt);

        statemnt=new JLabel("choose your desired resturant to place order");
        statemnt.setBounds(130,40,1000,20);
        panel.add(statemnt);

        Button1=new JButton("HARDEES");
        Button1.setBounds(150,100,200,30);
        Button1.addActionListener(this);
        panel.add(Button1);

        Button2=new JButton("CHAI KHANNA");
        Button2.setBounds(150,150,200,30);
        Button2.addActionListener(this);
        panel.add(Button2);

        Button3=new JButton("BUNDOO KHAN");
        Button3.setBounds(150,200,200,30);
        Button3.addActionListener(this);
        panel.add(Button3);

        Button4=new JButton("GINYAKI");
        Button4.setBounds(150,250,200,30);
        Button4.addActionListener(this);
        panel.add(Button4);

        Button5=new JButton("BACK");
        Button5.setBounds(150,300,200,30);
        Button5.addActionListener(this);
        panel.add(Button5);



        theBox.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(Button5))
        {
            customerLoginBoxGUI obj=new customerLoginBoxGUI();
            obj.customerLoginBoxGUI();
            obj.setVisible(true);
        }
        else if(e.getSource().equals(Button1))
        {
            String hotelName=Button1.getText();
            hardeesMenuGUI obj=new hardeesMenuGUI();
            obj.hardeesMenuGUI(hotelName);
            obj.setVisible(true);
        }
        else if(e.getSource().equals(Button2))
        {
            String hotelName=Button2.getText();
            chaiKhannaMenuGUI obj=new chaiKhannaMenuGUI();
            obj.chaiKhannaMenuGUI(hotelName);
            obj.setVisible(true);
        }
        else if(e.getSource().equals(Button3))
        {
            bundooKhanMenuGUI obj=new bundooKhanMenuGUI();
            obj.setVisible(true);
        }

        else if(e.getSource().equals(Button4))
        {
            ginyakiMenuGUI obj=new ginyakiMenuGUI();
            obj.setVisible(true);
        }
    }
}
