import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class chaiKhannaMenuGUI extends JFrame implements ActionListener {

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
    String hotelName="CHAI KHANNA";
    String dishName;

    JFrame theBox=new JFrame();
    JPanel panel=new JPanel();

    public void chaiKhannaMenuGUI(String name){
        theBox.setSize(500,500);
        theBox.add(panel);
        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);

        mainStatemnt=new JLabel();
        mainStatemnt.setFont(new Font(" ",Font.BOLD+Font.ITALIC,20));
        mainStatemnt.setText("CHAI KHANNA MENU LIST");
        mainStatemnt.setBounds(150,10,800,20);
        panel.add(mainStatemnt);

        statemnt=new JLabel("tick the box for the item you want to buy");
        statemnt.setBounds(130,40,1000,20);
        panel.add(statemnt);

        box1=new JCheckBox("Halwa Purri  Rs:600");
        box1.setBounds(110,80,2000,30);
        panel.add(box1);

        box2=new JCheckBox("Iftar Platter  Rs:650");
        box2.setBounds(110,110,2000,30);
        panel.add(box2);

        box3=new JCheckBox("Hot Dog  Rs:270");
        box3.setBounds(110,140,2000,30);
        panel.add(box3);

        box4=new JCheckBox("Spanish Omelet  Rs:480");
        box4.setBounds(110,170,2000,30);
        panel.add(box4);

        box5=new JCheckBox("Mushroom Omelet  Rs:495");
        box5.setBounds(110,200,2000,30);
        panel.add(box5);

        box6=new JCheckBox("Paratha  Rs:95");
        box6.setBounds(110,230,2000,30);
        panel.add(box6);

        box7=new JCheckBox("Aloo paratha  Rs:210");
        box7.setBounds(110,260,2000,30);
        panel.add(box7);

        box8=new JCheckBox("Beef Qeema  Rs:410");
        box8.setBounds(110,290,2000,30);
        panel.add(box8);

        box9=new JCheckBox("Puff Pastery Baked Egg  Rs:325");
        box9.setBounds(110,320,2000,30);
        panel.add(box9);

        Button4=new JButton("ADD TO CART");
        Button4.setBounds(250,400,200,30);
        Button4.addActionListener(this);
        panel.add(Button4);

        Button5=new JButton("BACK");
        Button5.setBounds(90,400,100,30);
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
                dishName="Halwa Purri";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box2.isSelected())
            {

                customer obj=new customer();
                dishName="Iftar Platter";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box3.isSelected())
            {

                customer obj=new customer();
                dishName="Hot Dog";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box4.isSelected())
            {

                customer obj=new customer();
                dishName="Spanish Omelet";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box5.isSelected())
            {

                customer obj=new customer();
                dishName="Mushroom Omelet";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box6.isSelected())
            {

                customer obj=new customer();
                dishName="Paratha";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box7.isSelected())
            {

                customer obj=new customer();
                dishName="Aloo paratha";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box8.isSelected())
            {

                customer obj=new customer();
                dishName="Beef Qeema";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            else if(box9.isSelected())
            {

                customer obj=new customer();
                dishName="Puff Pastery Baked Egg";
                try {
                    obj.addToCart(dishName,hotelName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
        }
    }
}

