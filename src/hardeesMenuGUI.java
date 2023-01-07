import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class hardeesMenuGUI extends JFrame implements ActionListener {

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
    String hotelName="HARDEES";

    JFrame theBox=new JFrame();
    JPanel panel=new JPanel();

    public void hardeesMenuGUI(String hotel){
        theBox.setSize(500,500);
        theBox.add(panel);
        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);

        mainStatemnt=new JLabel();
        mainStatemnt.setFont(new Font(" ",Font.BOLD+Font.ITALIC,20));
        mainStatemnt.setText("HARDEES MENU LIST");
        mainStatemnt.setBounds(150,10,800,20);
        panel.add(mainStatemnt);

        statemnt=new JLabel("tick the box for the item you want to buy and select one item at a time");
        statemnt.setBounds(100,40,1000,20);
        panel.add(statemnt);

        box1=new JCheckBox("Famous star with cheesse burger  Rs:660");
        box1.setBounds(110,110,2000,30);
        box1.addActionListener(this);
        panel.add(box1);

        box3=new JCheckBox("Super star with cheesse burger  Rs:921");
        box3.setBounds(110,140,2000,30);
        box3.addActionListener(this);
        panel.add(box3);

        box4=new JCheckBox("Western bacon cheesse burger  Rs:810");
        box4.setBounds(110,170,2000,30);
        box4.addActionListener(this);
        panel.add(box4);

        box5=new JCheckBox("Double wetern bacon burger  Rs:1060");
        box5.setBounds(110,200,2000,30);
        box5.addActionListener(this);
        panel.add(box5);

        box6=new JCheckBox("the big hardiee burger  Rs:920");
        box6.setBounds(110,230,2000,30);
        box6.addActionListener(this);
        panel.add(box6);

        box7=new JCheckBox("the really big hardiee cheesse burger  Rs:1170");
        box7.setBounds(110,260,2000,30);
        box7.addActionListener(this);
        panel.add(box7);

        box8=new JCheckBox("Frisco angus burger  Rs:760");
        box8.setBounds(110,290,2000,30);
        box8.addActionListener(this);
        panel.add(box8);

        box9=new JCheckBox("small HamBurger  Rs:250");
        box9.setBounds(110,320,2000,30);
        box9.addActionListener(this);
        panel.add(box9);

        box10=new JCheckBox("small ChesseBurger  Rs:300");
        box10.setBounds(110,350,2000,30);
        box10.addActionListener(this);
        panel.add(box10);


        Button4=new JButton("ADD TO CART");
        Button4.setBounds(250,400,200,30);
        Button4.addActionListener(this);
        panel.add(Button4);

        Button5=new JButton("BACK");
        Button5.setBounds(90,400,100,30);
        Button5.addActionListener(this);
        panel.add(Button5);

        theBox.setVisible(true);

       // String hotelName=hotel;

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
                dishName="Famous star with cheesse burger";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box3.isSelected())
            {

                customer obj=new customer();
                dishName="Super star with cheesse burger";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box4.isSelected())
            {

                customer obj=new customer();
                dishName="Western bacon cheesse burger";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box5.isSelected())
            {

                customer obj=new customer();
                dishName="Double wetern bacon burger";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box6.isSelected())
            {

                customer obj=new customer();
                dishName="the big hardiee burger";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box7.isSelected())
            {

                customer obj=new customer();
                dishName="the really big hardiee cheesse burger";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box8.isSelected())
            {

                customer obj=new customer();
                dishName="Frisco angus burger";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box9.isSelected())
            {

                customer obj=new customer();
                dishName="small HamBurger";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box10.isSelected())
            {

                customer obj=new customer();
                dishName="Small cheesseBurger";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
        }
    }
}
