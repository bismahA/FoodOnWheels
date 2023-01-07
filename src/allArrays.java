import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class allArrays {
    File restFile=new File("resturantOwnerFile.txt");

    public ArrayList<basicLoginInfo> customerArray(){

        ArrayList<basicLoginInfo> customerArray=new ArrayList<basicLoginInfo>();
        customerArray.add(new basicLoginInfo("aliza","abcde"));
        customerArray.add(new basicLoginInfo("laiba","123ab"));
        customerArray.add(new basicLoginInfo("sehrish","ghq6"));

        return customerArray;
    }

    public ArrayList<basicLoginInfo> riderArray(){

        ArrayList<basicLoginInfo> riderArray=new ArrayList<basicLoginInfo>();
        riderArray.add(new basicLoginInfo("ali","abcde"));
        riderArray.add(new basicLoginInfo("shahbaaz","123ab"));
        riderArray.add(new basicLoginInfo("qasim","ghq6"));

        return riderArray;
    }

    public ArrayList<resturantMenuBasicInfo> menus(String hoteName) throws IOException {

        ArrayList<resturantMenuBasicInfo> menu=new ArrayList<resturantMenuBasicInfo>();
        resturant obj=new resturant();
        if(hoteName.equals("HARDEES")||hoteName.equals("hardees"))
        {



            menu.add(new resturantMenuBasicInfo("Famous star with cheesse burger",660));
            menu.add(new resturantMenuBasicInfo("Super star with cheesse burger",920));
            menu.add(new resturantMenuBasicInfo("Western bacon cheesse burger",810));
            menu.add(new resturantMenuBasicInfo("Double wetern bacon burger",1060));
            menu.add(new resturantMenuBasicInfo("the big hardiee burger",920));
            menu.add(new resturantMenuBasicInfo("the really big hardiee cheesse burger",1170));
            menu.add(new resturantMenuBasicInfo("Frisco angus burger",760));
            menu.add(new resturantMenuBasicInfo("small HamBurger",250));
            menu.add(new resturantMenuBasicInfo("Small cheesseBurger",300));

            try
            {
                File hardeeFile=new File("hardeesMenu.txt");
                BufferedWriter bw=new BufferedWriter(new FileWriter(hardeeFile));
                for(int i=0;i<menu.size();i++)
                {
                    bw.write(menu.get(i)+"\n");
                }
                bw.close();
            }
                catch(Exception e)
                {
                    e.printStackTrace();
                }

            obj.setHotelName(hoteName);
            }

        else if(hoteName.equals("ginyaki"))
        {


            menu.add(new resturantMenuBasicInfo("Ginyaki special Spring roll",199));
            menu.add(new resturantMenuBasicInfo("BBQ wings",119));
            menu.add(new resturantMenuBasicInfo("Prawn Toast",249));
            menu.add(new resturantMenuBasicInfo("Stuffed Chilli",299));
            menu.add(new resturantMenuBasicInfo("Fish and Chips",299));
            menu.add(new resturantMenuBasicInfo("Butterfly Prawns ",299));
            menu.add(new resturantMenuBasicInfo("Chicken Drum stick",119));

            try
            {
                File ginyakiFile=new File("ginyakiMenu.txt");
                BufferedWriter bw=new BufferedWriter(new FileWriter(ginyakiFile));
                for(int i=0;i<menu.size();i++)
                {
                    bw.write(menu.get(i)+"\n");
                }
                bw.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            obj.setHotelName(hoteName);

        }
        else if(hoteName.equals("bundooKhan"))
        {


        ;
            menu.add(new resturantMenuBasicInfo("Chiken tikka leg",340));
            menu.add(new resturantMenuBasicInfo("Chiken Tikka Breast",340));
            menu.add(new resturantMenuBasicInfo("Fish Tikka",1490));
            menu.add(new resturantMenuBasicInfo("Chicken Dum Seekh",1190));
            menu.add(new resturantMenuBasicInfo("Chiken Irani Booti",1160));
            menu.add(new resturantMenuBasicInfo("Chicken and Cheese Kastoori Booti",1280));
            menu.add(new resturantMenuBasicInfo("Chicken Zafraani Malai Booti",1160));

            try
            {
                File bundooKhanFile=new File("bundooKhanMenu.txt");
                BufferedWriter bw=new BufferedWriter(new FileWriter(bundooKhanFile));
                for(int i=0;i<menu.size();i++)
                {
                    bw.write(menu.get(i)+"\n");
                }
                bw.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            obj.setHotelName(hoteName);

        }
        else if(hoteName.equals("CHAI KHANNA")||hoteName.equals("chai khanna"))
        {


            menu.add(new resturantMenuBasicInfo("Halwa Purri",600));
            menu.add(new resturantMenuBasicInfo("Iftar Platter",650));
            menu.add(new resturantMenuBasicInfo("Hot Dog",270));
            menu.add(new resturantMenuBasicInfo("Spanish Omelet",480));
            menu.add(new resturantMenuBasicInfo("Mushroom Omelet",495));
            menu.add(new resturantMenuBasicInfo("Paratha",95));
            menu.add(new resturantMenuBasicInfo("Aloo paratha",210));
            menu.add(new resturantMenuBasicInfo("Beef Qeema",410));
            menu.add(new resturantMenuBasicInfo("Puff Pastery Baked Egg",325));

            try
            {
                File chaiKhannaFile=new File("chaiKhannaMenu.txt");
                BufferedWriter bw=new BufferedWriter(new FileWriter(chaiKhannaFile));
                for(int i=0;i<menu.size();i++)
                {
                    bw.write(menu.get(i)+"\n");
                }
                bw.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            obj.setHotelName(hoteName);

        }
        return menu;
    }

    public ArrayList<resturantOwnerInfo> resturantArray() throws IOException {


        ArrayList<resturantOwnerInfo> restArray=new ArrayList<resturantOwnerInfo>();

        restArray.add(new resturantOwnerInfo("ali","abcde","hardees"));
        restArray.add(new resturantOwnerInfo("ahmed","123ab","ginyaki"));
        restArray.add(new resturantOwnerInfo("hamza","abcde","bundooKhan"));
        restArray.add(new resturantOwnerInfo("asma","abcde","chaiKhanna"));

        try
        {
            FileWriter file1=new FileWriter(restFile);
            BufferedWriter file2=new BufferedWriter(file1);
            for(int i=0;i<restArray.size();i++)
            {

                file2.write(String.valueOf(restArray.get(i))+"\n");
            }

            file2.close();
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

        return restArray;
    }

}
