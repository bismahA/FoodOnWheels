import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class resturantLoggedInMenuGUI extends JFrame implements ActionListener {


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

    public resturantLoggedInMenuGUI() {
    }

    public resturantLoggedInMenuGUI(String hotelName) throws HeadlessException {
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void resturantLoggedInMenuGUI(){

        theBox.setSize(500,500);
        theBox.add(panel);
        theBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);

        mainStatemnt=new JLabel();
        mainStatemnt.setFont(new Font("FOODS ON WHEELS",Font.BOLD+Font.ITALIC,20));
        mainStatemnt.setText("WELCOME to your account");
        mainStatemnt.setBounds(110,10,800,20);
        panel.add(mainStatemnt);

        statemnt=new JLabel("Press the button below to perform your desired operation");
        statemnt.setBounds(100,40,1000,20);
        panel.add(statemnt);

        Button1=new JButton("UPDATE FOOD DETAILS");
        Button1.setBounds(150,100,200,30);
        Button1.addActionListener(this);
        panel.add(Button1);

        Button2=new JButton("UPDATE FOOD DELEIVERY STATUS");
        Button2.setBounds(110,150,300,30);
        Button2.addActionListener(this);
        panel.add(Button2);

        Button3=new JButton("CALCULATE BILLS");
        Button3.setBounds(150,200,200,30);
        Button3.addActionListener(this);
        panel.add(Button3);

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
            resturantLoginMenuGUI obj=new resturantLoginMenuGUI();
            obj.resturantLoginMenu();
            obj.setVisible(true);
        }
        else if(e.getSource().equals(Button1))
        {
            String choice=getHotelName();
            resturnatUpdateFoodDetailsGUI obj=new resturnatUpdateFoodDetailsGUI();
            obj.setHotelName(choice);
            obj.resturnatUpdateFoodDetailsGUI();
            obj.setVisible(true);
        }
        else if(e.getSource().equals(Button2))
        {
//            String hotelName=Button2.getText();
//            chaiKhannaMenuGUI obj=new chaiKhannaMenuGUI();
//            obj.chaiKhannaMenuGUI(hotelName);
//            obj.setVisible(true);
        }
        else if(e.getSource().equals(Button3))
        {
            resturant obj=new resturant();
            Double price=obj.calculateBills();
            System.out.println("Total bills till now="+price);
        }

        else if(e.getSource().equals(Button4))
        {
            ginyakiMenuGUI obj=new ginyakiMenuGUI();
            obj.setVisible(true);
        }
    }
}
