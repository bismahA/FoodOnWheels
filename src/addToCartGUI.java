import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class addToCartGUI extends JFrame  {

//
//    JFrame theBox=new JFrame();
//    JPanel panel=new JPanel();
//    JLabel message;
//    JLabel dishLabel;
//    JLabel passLabel;
//    JTextField dishName;
//    JPasswordField password;
//    JButton backButton;
//    JLabel message1;
//    JButton updateButton;
//    JButton checkoutButton;
//    JLabel message2;

    public void displayAddToCart(String name,Double price) throws IOException {
//       String dishName=name;
//        theBox.setSize(500,500);
//        theBox.add(panel);
//        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        panel.setLayout(null);
//        message=new JLabel();
//        message.setFont(new Font(" ",Font.BOLD+Font.ITALIC,20));
        System.out.println("This is your CART");
//        message.setBounds(135,10,800,20);
//        panel.add(message);


        System.out.println("Following item is in your cart");
//        message2.setBounds(120,70,1000,20);
//        panel.add(message2);

       //dishName=new JTextField(name);


        System.out.println("-->"+" "+name);
//        dishLabel.setBounds(100,150,5000,25);
//        panel.add(dishLabel);


//        updateButton =new JButton("NEXT ON CONSOLE");
//        updateButton.setBounds(80,250,150,25);
//        updateButton.addActionListener( this);
//        panel.add(updateButton);


//        checkoutButton =new JButton("CHECKOUT");
//        checkoutButton.setBounds(250,250,150,25);
//        checkoutButton.addActionListener( this);
//        panel.add(checkoutButton);


//        message1=new JLabel("");
//        message1.setBounds(100,250,4000,25);
//        panel.add(message1);
//
//        theBox.setVisible(true);
        consoleMenuAfterAddCart obj=new consoleMenuAfterAddCart();
        obj.updateCart(name);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        if(e.getSource().equals(updateButton))
//        {
//
//            consoleMenuAfterAddCart obj=new consoleMenuAfterAddCart();
//            obj.updateCart(dishName);
//        }
//        else if(e.getSource().equals(checkoutButton))
//        {
//
//        }
//    }
}
