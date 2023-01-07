import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenuGUI extends JFrame implements ActionListener {

    private static JLabel shopName;
    private static JLabel statemnt;
    private static JButton Button1;
    private static JButton Button2;
    private static JButton Button3;
    private static JButton Button4;
    private static JButton Button5;

    JFrame theBox=new JFrame();
    JPanel panel=new JPanel();

    public void displayMenu(){


        theBox.setSize(500,500);
        theBox.add(panel);
        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);

        shopName=new JLabel();
        shopName.setFont(new Font("FOODS ON WHEELS",Font.BOLD+Font.ITALIC,20));
        shopName.setText("FOOD ON WHEELS");
        shopName.setBounds(150,10,800,20);
        panel.add(shopName);

        statemnt=new JLabel("WELCOME!! to our food delivery system");
        statemnt.setBounds(130,30,1000,20);
        panel.add(statemnt);

        statemnt=new JLabel("To enetr your desired portal. PRESS the button below");
        statemnt.setBounds(90,50,1000,20);
        panel.add(statemnt);

        theBox.setVisible(true);
    }

    public void pressButton(){

        Button1=new JButton("Customer's Portal");
        Button1.setBounds(150,100,200,30);
        Button1.addActionListener(this);
        panel.add(Button1);

        Button2=new JButton("Restaurant's Portal");
        Button2.setBounds(150,150,200,30);
        Button2.addActionListener(this);
        panel.add(Button2);

        Button3=new JButton("Rider's Portal");
        Button3.setBounds(150,200,200,30);
        Button3.addActionListener(this);
        panel.add(Button3);

        Button4=new JButton("Admin's Portal");
        Button4.setBounds(150,250,200,30);
        Button4.addActionListener(this);
        panel.add(Button4);

        Button5=new JButton("EXIT");
        Button5.setBounds(150,300,200,30);
        panel.add(Button5);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(Button1))
        {
            //this.dispose();
           customerMainMenuGUI obj=new customerMainMenuGUI();
            obj.setVisible(true);
            dispose();
        }
        else if(e.getSource().equals(Button2))
        {
            //this.dispose();
           resturantMainMenuGUI obj=new resturantMainMenuGUI();
            obj.setVisible(true);
            dispose();
        }
        else if(e.getSource().equals(Button3))
        {
            //this.dispose();
            riderMainMenuGUI obj=new riderMainMenuGUI();
            obj.setVisible(true);
            dispose();
        }
        else if(e.getSource().equals(Button4))
        {
            //this.dispose();
            admin obj=new admin();
            obj.fun();

            //obj.setVisible(true);
            dispose();
        }

    }
}
