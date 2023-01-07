import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;

public class resturnatUpdateFoodDetailsGUI extends JFrame implements ActionListener {
    JLabel mainStatemnt;
    JLabel statemnt;
    JButton Button1;
    JButton Button2;
    JButton Button3;
    JButton Button4;
    JButton Button5;
    JFrame theBox=new JFrame();
    JPanel panel=new JPanel();
    String hotelName;


    public resturnatUpdateFoodDetailsGUI() throws HeadlessException {
    }

    public resturnatUpdateFoodDetailsGUI(String hotelName) throws HeadlessException {
        this.hotelName = hotelName;
    }


    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void resturnatUpdateFoodDetailsGUI(){

        theBox.setSize(500,500);
        theBox.add(panel);
        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);


        statemnt=new JLabel("Press the button below to perform your desired operation");
        statemnt.setBounds(110,40,1000,20);
        panel.add(statemnt);

        Button1=new JButton("ADD FOOD ITEM");
        Button1.setBounds(150,150,200,30);
        Button1.addActionListener(this);
        panel.add(Button1);

        Button2=new JButton("DELETE FOOD ITEM");
        Button2.setBounds(150,200,200,30);
        Button2.addActionListener(this);
        panel.add(Button2);

        Button5=new JButton("BACK");
        Button5.setBounds(150,250,200,30);
        Button5.addActionListener(this);
        panel.add(Button5);



        theBox.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(Button5))
        {
            resturantLoggedInMenuGUI obj=new resturantLoggedInMenuGUI();
            obj.setVisible(true);
        }
        else if(e.getSource().equals(Button1))
        {

            System.out.println("ENTER THE FOOD AND PRICE THAT YOU WANT TO ADD IN THE MENU");
            Scanner q=new Scanner(System.in);
            Scanner o=new Scanner(System.in);
            System.out.println("enetr the name of dish");
            String newDish=o.nextLine();
            System.out.println("enetr the price of the dish");
            Double newPrice=o.nextDouble();

            resturant obj=new resturant();
            String hotName=getHotelName();
            obj.setHotelName(hotName);

            try {
                obj.addFoodItems(newDish,newPrice);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            obj.setVisible(true);
            dispose();

        }
        else if(e.getSource().equals(Button2))
        {
            System.out.println("ENTER THE FOOD AND PRICE THAT YOU WANT TO REMOVE FROM THE MENU");
            Scanner q=new Scanner(System.in);
            Scanner o=new Scanner(System.in);
            System.out.println("enetr the name of dish");
            String newDish=o.nextLine();
            System.out.println("enetr the price of the dish");
            Double newPrice=o.nextDouble();

            resturant obj=new resturant();
            String hotName=getHotelName();
            obj.setHotelName(hotName);

            try {
                obj.deleteFoodItem(newDish,newPrice);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            obj.setVisible(true);
            dispose();

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
