import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class rider extends JFrame {
    allArrays obj=new allArrays();
    File fileName=new File("riderFile.txt");
    File addToCartFile=new File("cart.txt");
    File orderListNos=new File("listOfOrdersForRider.txt");
    Boolean deleiveryStatus=true;

    public void register(String name, String pass) throws IOException {


        allArrays obj=new allArrays();
        ArrayList<basicLoginInfo> array=obj.riderArray();


        // File checkFile=new File(fileName);
        if(fileName.exists())
        {
            try
            {
                array.add(new basicLoginInfo(name,pass));
                FileWriter file1=new FileWriter(fileName);
                BufferedWriter file2=new BufferedWriter(file1);
                for(int i=0;i<array.size();i++)
                {
                    ;
                    file2.write(String.valueOf(array.get(i))+"\n");
                }

                file2.close();
            }
            catch (Exception e)
            {
                return;
            }


        }
        else if(!(fileName.exists()))
        {
            //  Files.createFile(fileName);
            try
            {
                fileName.createNewFile();
                FileWriter file1=new FileWriter(fileName);
                BufferedWriter file2=new BufferedWriter(file1);
                array.add(new basicLoginInfo(name,pass));
                for(int i=0;i<array.size();i++)
                {

                    file2.write(String.valueOf(array.get(i)+"\n"));
                }

                file2.close();
            }
            catch(Exception e)
            {
                return;
            }

        }


    }


    public void riderLogin(String name,String passCode) throws IOException{

        ArrayList<basicLoginInfo> array=new ArrayList<basicLoginInfo>();
        try {
            if (fileName.exists()) {
                // BufferedReader br = new BufferedReader(new FileReader(fileName));

                Scanner scan=new Scanner(fileName);
                while (scan.hasNextLine())
                {

                    String line = scan.nextLine();

                    String[] helpingAray = line.split("[,]");
                    String names = helpingAray[0];
                    String passwrods = helpingAray[1];
                    basicLoginInfo person = new basicLoginInfo(names, passwrods);
                    array.add(person);


                }

            }
            else if(!(fileName.exists()))
            {
                allArrays obj=new allArrays();
                array=obj.riderArray();

            }
            String dummyName = "xyz";
            String dummyPass = "xyz";

            for (int i = 0; i < array.size(); i++) {
                if (name.equals(array.get(i).getUserName()) && passCode.equals(array.get(i).getPassword())) {
                    name = dummyName;
                    passCode = dummyPass;
                }
            }
            if (name.equals(dummyName) && passCode.equals(dummyPass))
            {
//                customerLoginMenuGUI obj = new customerLoginMenuGUI();
//                obj.setVisible(true);
                ridersConsoleMenu obj=new ridersConsoleMenu();
                obj.riderLogin();
            }
            else if(!(name.equals(dummyName))&&!(passCode.equals(dummyPass)))
            {
                riderLoginMenuGUI obj=new riderLoginMenuGUI();
                obj.riderLoginBoxGUI();
                obj.errorMessage();
                obj.setVisible(true);
                System.out.println("ERROR");
            }

        }

        catch(Exception ex)
        {
            return;
        }
    }


    public boolean viewOrder() throws FileNotFoundException {
        ArrayList<orderDetailsOfCustomer> newArray=new ArrayList<orderDetailsOfCustomer>();

        if (orderListNos.exists()) {
            // BufferedReader br = new BufferedReader(new FileReader(fileName));

            try
            {

                Scanner scan=new Scanner(orderListNos);
                while (scan.hasNextLine())
                {

                    String line = scan.nextLine();

                    String[] helpingAray = line.split("[,]");
                    String names = helpingAray[0];
                    String address = helpingAray[1];
                    int mobile=Integer.parseInt(helpingAray[2]);
                    int orderNo=Integer.parseInt(helpingAray[3]);
                    double price=Double.parseDouble(helpingAray[4]);
                    orderDetailsOfCustomer customer=new orderDetailsOfCustomer(names,address,mobile,orderNo,price);
                    newArray.add(customer);


                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

        }
       boolean flag=true;
        System.out.println("enter the order number you want to view");
        Scanner h=new Scanner(System.in);
        int no=h.nextInt();
        for(int i=0;i<newArray.size();i++)
        {
            if(no==newArray.get(i).orderNumber)
            {
                System.out.println("Press:1 to accept the order");
                System.out.println("Press:2 to cancel the order");
                Scanner t=new Scanner(System.in);
                int cho=t.nextInt();
                if(cho==1)
                {
                    flag=true;
                }
                else if(cho==2)
                {
                    flag=false;
                }

            }
            else
            {
                System.out.println("the following order number is not found");
            }
        }
        return flag;
    }

    public String foodDeleiveryStatus() throws FileNotFoundException {
        String status="";
        rider obj=new rider();
        boolean flag=obj.viewOrder();
        if(flag==true)
        {

            System.out.println("enetr your food deleivery status");
            Scanner k=new Scanner(System.in);
             status=k.nextLine();
            return status;
        }
        else
        {
            status="order has been rejected";
            return status;
        }
    }

    public void cashUpdate() throws FileNotFoundException {
        rider obj=new rider();
        String stat=obj.foodDeleiveryStatus();
        if(stat.equals("order has been rejected"))
        {
            System.out.println("the order was rejected earlier");
        }
        else
        {
            System.out.println("enetr the cash update");
            Scanner k=new Scanner(System.in);
            String update=k.nextLine();
            System.out.println("the cash update="+" "+update);

        }
    }
}
