import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class riderMainMenuGUI extends JFrame implements ActionListener {
    JFrame theBox=new JFrame();
    JPanel panel=new JPanel();
    private static JButton Buttons;
    private static JLabel customerWriting;
    private static JButton Button1;
    private static JButton Button2;
    JButton button3;
    int click=0;

    public riderMainMenuGUI(){
        theBox.setSize(500,500);
        theBox.add(panel);
        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);

        customerWriting=new JLabel();
        customerWriting.setFont(new Font("CUSTOMER'S PORTAL",Font.BOLD+Font.ITALIC,20));
        customerWriting.setText("RIDER'S PORTAL");
        customerWriting.setBounds(150,10,800,20);
        panel.add(customerWriting);

        customerWriting=new JLabel("To perform your desired operation. PRESS the button below");
        customerWriting.setBounds(90,50,1000,20);
        panel.add(customerWriting);

        Button1=new JButton("Register Account");
        Button1.setBounds(150,100,200,30);
        Button1.addActionListener( this);
        panel.add(Button1);

        Button2=new JButton("Login Account");
        Button2.setBounds(150,150,200,30);
        Button2.addActionListener( this);
        panel.add(Button2);

        button3=new JButton("BACK");
        button3.setBounds(200,200,100,25);
        button3.addActionListener( this);
        panel.add(button3);

        theBox.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(Button1))
        {

           // this.dispose();
            riderRegisterMenuGUI obj=new riderRegisterMenuGUI();
//            click++;
            obj.setVisible(true);
            dispose();
        }
        else if(e.getSource().equals(Button2))
        {
            //this.dispose();
           riderLoginMenuGUI obj=new riderLoginMenuGUI();
           obj.riderLoginBoxGUI();
            obj.setVisible(true);
            dispose();
        }

        else if(e.getSource().equals(button3))
        {
            //this.dispose();
            mainMenuGUI obj=new mainMenuGUI();
            obj.displayMenu();
            obj.pressButton();
            obj.setVisible(true);
            dispose();
        }

    }
}
