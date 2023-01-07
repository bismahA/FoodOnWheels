import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class resturantMainMenuGUI extends JFrame implements ActionListener {
    JFrame theBox=new JFrame();
    JPanel panel=new JPanel();
    private static JButton Buttons;
    private static JLabel writing;
    private static JButton Button1;
    private static JButton Button2;
    private static JButton button3;


    public resturantMainMenuGUI(){
        theBox.setSize(500,500);
        theBox.add(panel);
        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);

        writing =new JLabel();
        writing.setFont(new Font("CUSTOMER'S PORTAL",Font.BOLD+Font.ITALIC,20));
        writing.setText("RESTURANT'S PORTAL");
        writing.setBounds(150,10,800,20);
        panel.add(writing);

        writing =new JLabel("To perform your desired operation. PRESS the button below");
        writing.setBounds(90,50,1000,20);
        panel.add(writing);

        Button1=new JButton("Create Account");
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

            resturantRegisterMenuGUI obj=new resturantRegisterMenuGUI();
            obj.setVisible(true);
            dispose();
        }
        else if(e.getSource().equals(Button2))
        {
           resturantLoginMenuGUI obj=new resturantLoginMenuGUI();
           obj.resturantLoginMenu();
            obj.setVisible(true);
            dispose();
        }

        else if(e.getSource().equals(button3))
        {
            mainMenuGUI obj=new mainMenuGUI();
            obj.displayMenu();
            obj.pressButton();
            obj.setVisible(true);
            dispose();
        }
    }
}
