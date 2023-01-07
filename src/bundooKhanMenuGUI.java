import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class bundooKhanMenuGUI extends JFrame implements ActionListener {

    JLabel mainStatemnt;
    JLabel statemnt;
    JButton Button4;
    JButton Button5;
    JCheckBox box1;
    JCheckBox box2;
    JCheckBox box3;
    JCheckBox box4;
    JCheckBox box5;
    JCheckBox box6;
    JCheckBox box7;
    JCheckBox box8;
    JCheckBox box9;
    JCheckBox box10;
    String dishName;
    String hotelName="bundooKhan";

    JFrame theBox=new JFrame();
    JPanel panel=new JPanel();

    bundooKhanMenuGUI(){
        theBox.setSize(500,500);
        theBox.add(panel);
        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);

        mainStatemnt=new JLabel();
        mainStatemnt.setFont(new Font(" ",Font.BOLD+Font.ITALIC,20));
        mainStatemnt.setText("BUNDOO KHAN MENU LIST");
        mainStatemnt.setBounds(150,10,800,20);
        panel.add(mainStatemnt);

        statemnt=new JLabel("tick the box for the item you want to buy");
        statemnt.setBounds(130,40,1000,20);
        panel.add(statemnt);

        box1=new JCheckBox("Chiken Tikka leg  Rs:340");
        box1.setBounds(110,80,2000,30);
        panel.add(box1);

        box2=new JCheckBox("Chiken Tikka Breast  Rs:340");
        box2.setBounds(110,110,2000,30);
        panel.add(box2);

        box3=new JCheckBox("Fish Tikka  Rs:1490");
        box3.setBounds(110,140,2000,30);
        panel.add(box3);

        box4=new JCheckBox("Chicken Dhum Seekh  Rs:1190");
        box4.setBounds(110,170,2000,30);
        panel.add(box4);

        box5=new JCheckBox("Chicken Irani Booti  Rs:1190");
        box5.setBounds(110,200,2000,30);
        panel.add(box5);

        box6=new JCheckBox("Chicken and Cheese Kastoori Booti  Rs:1280");
        box6.setBounds(110,230,2000,30);
        panel.add(box6);

        box7=new JCheckBox("Chicken Zafrani Malai Booti  Rs:1160");
        box7.setBounds(110,260,2000,30);
        panel.add(box7);


        Button4=new JButton("ADD TO CART");
        Button4.setBounds(250,300,200,30);
        Button4.addActionListener(this);
        panel.add(Button4);

        Button5=new JButton("BACK");
        Button5.setBounds(90,300,100,30);
        Button5.addActionListener(this);
        panel.add(Button5);

        theBox.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(Button5))
        {
            customerLoginMenuGUI obj=new customerLoginMenuGUI();
            obj.setVisible(true);
        }

        else if(e.getSource().equals(Button4))
        {

            if(box1.isSelected())
            {

                customer obj=new customer();
                dishName="Chiken tikka leg";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box2.isSelected())
            {

                customer obj=new customer();
                dishName="Chiken Tikka Breast";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box3.isSelected())
            {

                customer obj=new customer();
                dishName="Fish Tikka";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box4.isSelected())
            {

                customer obj=new customer();
                dishName="Chicken Dum Seekh";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box5.isSelected())
            {

                customer obj=new customer();
                dishName="Chiken Irani Booti";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box6.isSelected())
            {

                customer obj=new customer();
                dishName="Chicken and Cheese Kastoori Booti";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box7.isSelected())
            {

                customer obj=new customer();
                dishName="Chicken Zafraani Malai Booti";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }

        }
    }

}
