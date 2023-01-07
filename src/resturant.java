import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class resturant extends JFrame {


    String hotelName;
    Double price;
    ArrayList<resturantMenuBasicInfo> array = new ArrayList<resturantMenuBasicInfo>();
    File restFile = new File("resturantOwnerFile.txt");

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public resturant() {
    }

    public resturant(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void login(String restNme, String name, String passCode) {

        ArrayList<resturantOwnerInfo> copiedarray = new ArrayList<resturantOwnerInfo>();
        String select;

        try {
            if (restFile.exists()) {
                // BufferedReader br = new BufferedReader(new FileReader(fileName));

                Scanner scan = new Scanner(restFile);
                while (scan.hasNextLine()) {

                    String line = scan.nextLine();

                    String[] helpingAray = line.split("[,]");
                    String names = helpingAray[0];
                    String passwrods = helpingAray[1];
                    String restName = helpingAray[2];
                    resturantOwnerInfo person = new resturantOwnerInfo(names, passwrods, restName);
                    copiedarray.add(person);


                }

            } else if (!(restFile.exists())) {
                allArrays obj = new allArrays();

                ArrayList<resturantOwnerInfo> array1 = obj.resturantArray();

                restFile.createNewFile();
                BufferedWriter bw = new BufferedWriter(new FileWriter(restFile, true));
                for (int i = 0; i < array1.size(); i++) {
                    bw.write(String.valueOf(array1.get(i)) + "\n");
                }


                bw.close();
                Scanner scan = new Scanner(restFile);
                while (scan.hasNextLine()) {

                    String line = scan.nextLine();

                    String[] helpingAray = line.split("[,]");
                    String names = helpingAray[0];
                    String passwrods = helpingAray[1];
                    String restName = helpingAray[2];
                    resturantOwnerInfo person = new resturantOwnerInfo(names, passwrods, restName);
                    copiedarray.add(person);


                }

            }
            String dummyName = "xyz";
            String dummyPass = "xyz";
            String dummyrest = "xyz";
            String theResturantName = "";

            for (int i = 0; i < copiedarray.size(); i++) {
                if (name.equals(copiedarray.get(i).getUserName()) && passCode.equals(copiedarray.get(i).getPassword()) && restNme.equals(copiedarray.get(i).getHotelName())) {
                    name = dummyName;
                    passCode = dummyPass;
                    restNme = dummyrest;
                    theResturantName = copiedarray.get(i).getHotelName();
                }
            }
            if (name.equals(dummyName) && passCode.equals(dummyPass) && restNme.equals(dummyrest)) {
                restNme = theResturantName;
                resturantLoggedInMenuGUI obj = new resturantLoggedInMenuGUI();
                obj.setHotelName(restNme);
                // System.out.println(obj.getHotelName());
                obj.resturantLoggedInMenuGUI();
                obj.setVisible(true);
            } else if (!(name.equals(dummyName)) && !(passCode.equals(dummyPass)) && !(restNme.equals(dummyrest))) {
                resturantLoginMenuGUI obj = new resturantLoginMenuGUI();
                obj.resturantLoginMenu();
                obj.errorMessage();
                obj.setVisible(true);
                System.out.println("ERROR");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void createAccount(String restName, String name, String pass) throws IOException {

        allArrays obj = new allArrays();
        ArrayList<resturantOwnerInfo> array = obj.resturantArray();
        String nameID = "";
        String passcode = "";
        String resturant = "";


        // File checkFile=new File(fileName);
        if (restFile.exists()) {
            try {
                array.add(new resturantOwnerInfo(name, pass, restName));
                FileWriter file1 = new FileWriter(restFile, true);
                BufferedWriter file2 = new BufferedWriter(file1);
                // PrintWriter pr=new PrintWriter(file2);
                for (int i = 0; i < array.size(); i++) {

                    if (name.equals(array.get(i).getUserName())) {
                        nameID = array.get(i).getUserName();
                        passcode = array.get(i).getPassword();
                        resturant = array.get(i).getHotelName();
                    }
                    //file2.write(String.valueOf(array.get(i))+"\n");
                }

                resturantOwnerInfo person = new resturantOwnerInfo(nameID, passcode, resturant);
                file2.write(String.valueOf(person));
                file2.close();
            } catch (Exception e) {
                return;
            }


        } else if (!(restFile.exists())) {
            //  Files.createFile(fileName);
            try {
                restFile.createNewFile();
                FileWriter file1 = new FileWriter(restFile);
                BufferedWriter file2 = new BufferedWriter(file1);
                array.add(new resturantOwnerInfo(name, pass, restName));
                for (int i = 0; i < array.size(); i++) {

                    file2.write(String.valueOf(array.get(i)) + "\n");
                }

                file2.close();
            } catch (Exception e) {
                return;
            }

        }

    }

    public void addFoodItems(String newDish,Double newPrice) throws IOException {
        allArrays obj = new allArrays();
        ArrayList<resturantMenuBasicInfo> startingArray = obj.menus(getHotelName());
        String fileName = getHotelName() + "Menu.txt";
        File menuFile=new File(fileName);

        if(menuFile.exists())
        {
            Scanner scan=new Scanner(menuFile);
            ArrayList<resturantMenuBasicInfo> copiedArray=new ArrayList<resturantMenuBasicInfo>();
            while (scan.hasNextLine())
            {

                String line = scan.nextLine();
                String[] helpingAray = line.split("[,]");
                String dishNames = helpingAray[0];
                Double price = Double.parseDouble(helpingAray[1]);
                resturantMenuBasicInfo dishes = new resturantMenuBasicInfo(dishNames,price);
                copiedArray.add(dishes);

            }
            copiedArray.add(new resturantMenuBasicInfo(newDish,newPrice));
            System.out.println("the item "+"'"+newDish+"'"+" has been added successfully");
            System.out.println("now!");
            String newDish1="";
            double newPrice1=0.0;

            try
            {
                BufferedWriter br=new BufferedWriter(new FileWriter(menuFile,true));
                for(int i=0;i<copiedArray.size();i++)
                {

                    if(newDish.equals(copiedArray.get(i).getDishName())&&newPrice.equals(copiedArray.get(i).getPrice()))
                    {
                        newDish1=copiedArray.get(i).getDishName();
                        newPrice1=copiedArray.get(i).getPrice();
                    }

                }
                resturantMenuBasicInfo newDishToAdd=new resturantMenuBasicInfo(newDish1,newPrice1);
                br.write(String.valueOf(newDishToAdd));

                br.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }

        }
    }


        public void deleteFoodItem(String newDish, Double newPrice) throws IOException {

            allArrays obj = new allArrays();
            ArrayList<resturantMenuBasicInfo> startingArray = obj.menus(getHotelName());
            String fileName = getHotelName() + "Menu.txt";
            File menuFile=new File(fileName);


            Scanner scan=new Scanner(menuFile);
            ArrayList<resturantMenuBasicInfo> ArrayDel=new ArrayList<resturantMenuBasicInfo>();
            while (scan.hasNextLine())
            {

                String line = scan.nextLine();
                String[] helpingAray = line.split("[,]");
                String dishNames = helpingAray[0];
                Double price = Double.parseDouble(helpingAray[1]);
                resturantMenuBasicInfo cartMenu = new resturantMenuBasicInfo(dishNames,price);
                ArrayDel.add(cartMenu);

            }
            String dummyDishName="xyz";
            Double dummyPrice=0.0;
            Double price=0.0;
            String theDish="";
            Iterator<resturantMenuBasicInfo> itr=ArrayDel.iterator();
            while(itr.hasNext())
            {
                resturantMenuBasicInfo item=itr.next();
                if(newDish.equals(item.dishName)&&newPrice.equals(item.getPrice()))
                {
                    newDish=dummyDishName;
                    newPrice=dummyPrice;
                    theDish= item.getDishName();
                      itr.remove();

                }
            }

            if(newDish.equals(dummyDishName)&&newPrice.equals(dummyPrice))
            {
                newDish=theDish;
                System.out.println("the item="+newDish+" has been deleted successfully");
                System.out.println("now!");
                if(menuFile.exists())
                {
                    try
                    {
                        BufferedWriter br=new BufferedWriter(new FileWriter(menuFile));
                        for(int i=0;i<ArrayDel.size();i++)
                        {

                            br.write(String.valueOf(ArrayDel.get(i))+"\n");
                        }

                        br.close();
                    }
                    catch(Exception ex){
                        ex.printStackTrace();
                    }
                }


            else
            {
                System.out.println("the item is not in your menu");
                System.out.println("Try Again");

            }


    }

}

public Double calculateBills(){

        Double finalPrize=0.0;
        ArrayList<Double> totalBills=new ArrayList<Double>();
        totalBills.add(getPrice());
        for(int i=0;i<totalBills.size();i++)
        {
            Double finalPrice=finalPrize+totalBills.get(i);
        }
        return finalPrize;


}

}