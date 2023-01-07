

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class customer extends JFrame{

    allArrays obj=new allArrays();
    File fileName=new File("file.txt");
    File addToCartFile=new File("cart.txt");
    File orderListNos=new File("listOfOrdersForRider.txt");
    String hotelName="";


    public void register(String name, String pass) throws IOException {


           allArrays obj=new allArrays();
           ArrayList<basicLoginInfo> array=obj.customerArray();


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

                      file2.write(String.valueOf(array.get(i))+"\n");
                  }

                  file2.close();
              }
              catch(Exception e)
              {
                  return;
              }

           }


    }


    public void login(String name, String passCode) throws IOException{

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
                customerLoginMenuGUI obj = new customerLoginMenuGUI();
                obj.setVisible(true);
            }
            else if(!(name.equals(dummyName))&&!(passCode.equals(dummyPass)))
                {
                customerLoginBoxGUI obj=new customerLoginBoxGUI();
                obj.customerLoginBoxGUI();
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

        public String addToCart(String name, String hotel) throws IOException {


           Double price=0.0;
           String dishName="";
           ArrayList<resturantMenuBasicInfo> menuArrayCus=obj.menus(hotel);

           ArrayList<resturantMenuBasicInfo> cartArray=new ArrayList<resturantMenuBasicInfo>();
           for(int i=0;i< menuArrayCus.size();i++)
           {
               if(name.equals(menuArrayCus.get(i).getDishName()))
               {
                   dishName=menuArrayCus.get(i).getDishName();
                   price=menuArrayCus.get(i).getPrice();

               }
           }

           try
           {
               if(addToCartFile.exists())
               {
                   //addToCartFile.createNewFile();
                   cartArray.add(new resturantMenuBasicInfo(dishName,price));
                   BufferedWriter bw=new BufferedWriter(new FileWriter(addToCartFile));

                   for(int i=0;i< cartArray.size();i++)
                   {
                       bw.write(cartArray.get(i)+"\n");
                   }
                   bw.close();
               }

               else
               {
                   addToCartFile.createNewFile();
                   cartArray.add(new resturantMenuBasicInfo(dishName,price));
                   BufferedWriter bw=new BufferedWriter(new FileWriter(addToCartFile));

                   for(int i=0;i< cartArray.size();i++)
                   {
                       bw.write(cartArray.get(i)+"\n");
                   }
                   bw.close();
               }
           } catch (IOException e) {
               e.printStackTrace();
           }

           addToCartGUI obj=new addToCartGUI();
           obj.displayAddToCart(name,price);

           String hotelName=hotel;
           return hotelName;

        }

        public int updateCart(int choice,String dishName, String name) throws IOException {

        allArrays obj=new allArrays();
        if(choice==1)
        {
           int x;
            //BufferedReader br=new BufferedReader(new FileReader(addToCartFile));
            ArrayList<resturantMenuBasicInfo> findingArray=obj.menus(name);
            Scanner scan=new Scanner(addToCartFile);
            ArrayList<resturantMenuBasicInfo> cartArray=new ArrayList<resturantMenuBasicInfo>();
            while (scan.hasNextLine())
            {

                String line = scan.nextLine();
                String[] helpingAray = line.split("[,]");
                String dishNames = helpingAray[0];
                Double price = Double.parseDouble(helpingAray[1]);
                resturantMenuBasicInfo cartMenu = new resturantMenuBasicInfo(dishNames,price);
                cartArray.add(cartMenu);

            }
            String dummyDishName="xyz";
            Double price=0.0;
            String theDish="";
            for(int i=0;i<findingArray.size();i++)
            {
                if(dishName.equals(findingArray.get(i).getDishName()))
                {
                    dishName=dummyDishName;
                    price=findingArray.get(i).getPrice();
                    theDish=findingArray.get(i).getDishName();
                }
            }
            if(dishName.equals(dummyDishName))
            {
                dishName=theDish;
                cartArray.add(new resturantMenuBasicInfo(dishName,price));
                System.out.println("the item="+dishName+" has been added successfully");
                System.out.println("now!");
                if(addToCartFile.exists())
                {
                   try
                   {
                       BufferedWriter br=new BufferedWriter(new FileWriter(addToCartFile));
                       for(int i=0;i<cartArray.size();i++)
                       {
                           ;
                           br.write(String.valueOf(cartArray.get(i))+"\n");
                       }

                       br.close();
                   }
                   catch(Exception ex){
                       ex.printStackTrace();
                   }
                }
                System.out.println("PRESS 1:if you want to checkout");
                System.out.println("PRESS 2:cancel order");
                Scanner r=new Scanner(System.in);
                int choice1=r.nextInt();
                if(choice1==1)
                {

                 x=1;
                    return x;
                }
                else if(choice==2)
                {
                    x=2;
                    return x;
                }

            }

            else
            {
                System.out.println("the item is not in the menu");
                System.out.println("Try Again");

            }
        }

            else if(choice==2)
        {
            int x=0;
            ArrayList<resturantMenuBasicInfo> findingArray=obj.menus(name);
            Scanner scan=new Scanner(addToCartFile);
            ArrayList<resturantMenuBasicInfo> cartArrayDel=new ArrayList<resturantMenuBasicInfo>();
            while (scan.hasNextLine())
            {

                String line = scan.nextLine();
                String[] helpingAray = line.split("[,]");
                String dishNames = helpingAray[0];
                Double price = Double.parseDouble(helpingAray[1]);
                resturantMenuBasicInfo cartMenu = new resturantMenuBasicInfo(dishNames,price);
                cartArrayDel.add(cartMenu);

            }
            String dummyDishName="xyz";
            Double price=0.0;
            String theDish="";
            for(int i=0;i<cartArrayDel.size();i++)
            {
                if(dishName.equals(cartArrayDel.get(i).getDishName()))
                {
                    dishName=dummyDishName;
                    price=cartArrayDel.get(i).getPrice();
                    theDish=cartArrayDel.get(i).getDishName();
                }
            }
            if(dishName.equals(dummyDishName))
            {
                dishName=theDish;
                cartArrayDel.remove(new resturantMenuBasicInfo(dishName,price));
                System.out.println("the item="+dishName+" has been deleted successfully");
                System.out.println("now!");
                if(addToCartFile.exists())
                {
                    try
                    {
                        BufferedWriter br=new BufferedWriter(new FileWriter(addToCartFile));
                        for(int i=0;i<cartArrayDel.size();i++)
                        {

                            br.write(String.valueOf(cartArrayDel.get(i))+"\n");
                        }

                        br.close();
                    }
                    catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
                System.out.println("PRESS 1:if you want to checkout");
                System.out.println("PRESS 2:cancel order");
                Scanner r=new Scanner(System.in);
                int choice1=r.nextInt();
                if(choice1==1)
                {

                    x=1;
                    return x;
                }
                else if(choice==2)
                {
                    x=2;
                    return x;
                }

            }

            else
            {
                System.out.println("the item is not in your cart");
                System.out.println("Try Again");

            }
        }
            int x = 0;
            return x;

}
        public void checkout(String name,String address,int no) throws FileNotFoundException {

            int min = 1000;
            int max = 5000;
        ArrayList<resturantMenuBasicInfo> finalArray=new ArrayList<resturantMenuBasicInfo>();
        Scanner scan=new Scanner(addToCartFile);
            while (scan.hasNextLine())
            {

                String line = scan.nextLine();
                String[] helpingAray = line.split("[,]");
                String dishNames = helpingAray[0];
                Double price = Double.parseDouble(helpingAray[1]);
                resturantMenuBasicInfo cartMenu = new resturantMenuBasicInfo(dishNames,price);
                finalArray.add(cartMenu);

            }

            double totalPrice=0.0;
            int serialNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println("********YOUR INVOICE********");
            System.out.println("customer's order number="+serialNumber);
            System.out.println("name of customer="+name);
            System.out.println("customer's mobile number="+no);
            System.out.println("customer's address="+address);
            System.out.println("CUSTOMER'S ORDER");
            for(int i=0;i<finalArray.size();i++)
            {

                System.out.println((i+1)+":"+finalArray.get(i).getDishName());
                totalPrice=totalPrice+finalArray.get(i).getPrice();

            }
            System.out.println("your total BILL="+totalPrice);
            System.out.println("This is cash on deleivery");

            ArrayList<orderDetailsOfCustomer> finalArr=new ArrayList<orderDetailsOfCustomer>();
            finalArr.add(new orderDetailsOfCustomer(name,address,no,serialNumber,totalPrice));
            resturant obj1=new resturant();
            obj1.setPrice(totalPrice);
            obj1.calculateBills();

            System.out.println("*******************************");
            System.out.println("NOW!");
            System.out.println("PRESS 1:if you want to check food deleivery status");
            System.out.println("PRESS 2:if you want to exit");
            Scanner a=new Scanner(System.in);
            int choice=a.nextInt();
            if(choice==1)
            {
               rider obj=new rider();
               String status=obj.foodDeleiveryStatus();
               System.out.println(status);
            }
            else if(choice==2)
            {
                System.exit(1);
            }


                if(orderListNos.exists())
                {
                    try
                    {

                        BufferedWriter br=new BufferedWriter(new FileWriter(orderListNos));
                        for(int i=0;i<finalArr.size();i++)
                        {
                            br.write(String.valueOf(finalArr.get(i)));

                        }
                        br.close();


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else
                {
                    try
                    {
                        orderListNos.createNewFile();
                        BufferedWriter br=new BufferedWriter(new FileWriter(orderListNos));
                        for(int i=0;i<finalArr.size();i++)
                        {
                            br.write(String.valueOf(finalArr.get(i)));
                        }
                        br.close();

                    }

                    catch (IOException e) {
                    e.printStackTrace();
            }
                }

        }
}













