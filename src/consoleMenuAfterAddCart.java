import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class consoleMenuAfterAddCart {

//    customer obj=new customer();
//    consoleMenuAfterAddCart obj1=new consoleMenuAfterAddCart();

    public void updateCart(String oldDishName) throws IOException {

           Scanner q=new Scanner(System.in);
           System.out.println("PRESS 1: to update your cart");
           System.out.println("PRESS 2: to checkout");
           System.out.println("PRESS 3: to EXIT");
           int choice=q.nextInt();
           if(choice==1)
           {
               System.out.println("follwoing are the items in your cart");
               System.out.println("DISH NAME="+oldDishName);
               System.out.println("PRESS 1: if you want to add itme");
               System.out.println("PRESS 2: if you want to delete item");
               Scanner w=new Scanner(System.in);
               int choice1=w.nextInt();
               if(choice1==1)
               {
                   int i=1;
                   System.out.println("enetr your hotel name");
                   Scanner t=new Scanner(System.in);
                   String name=t.nextLine();
                   System.out.println("enter the name of the dish you want to add");
                   Scanner e=new Scanner(System.in);
                   String dishName=e.nextLine();
                   customer obj=new customer();
                   int decision=obj.updateCart(i,dishName,name);
                   if(decision==1)
                   {
                       consoleMenuAfterAddCart obj1=new consoleMenuAfterAddCart();
                       obj1.checkout();
                   }
                   else if(decision==2)
                   {

                   }
               }
               else if(choice1==2)
               {

                   int i=2;
                   System.out.println("eneter the name of resturant");
                   Scanner f=new Scanner(System.in);
                   String name=f.nextLine();

                   System.out.println("enter the name of the dish you want to delete");
                   Scanner t=new Scanner(System.in);
                   String dishName=t.nextLine();
                   customer obj=new customer();
                   int decision1=obj.updateCart(i,dishName,name);
                   if(decision1==1)
                   {

                       consoleMenuAfterAddCart obj1=new consoleMenuAfterAddCart();
                       obj1.checkout();

                   }
                   else if(decision1==2)
                   {

                   }
               }

           }
           else if(choice==2)
           {

               consoleMenuAfterAddCart obj=new consoleMenuAfterAddCart();
               obj.checkout();

           }


    }

    public void checkout() throws FileNotFoundException {

        Scanner y=new Scanner(System.in);
        Scanner u=new Scanner(System.in);
        Scanner i=new Scanner(System.in);
        Scanner o=new Scanner(System.in);

        System.out.println("enetr your name");
        String name=y.nextLine();
        System.out.println("enetr your address");
        String address=u.nextLine();
        System.out.println("enetr your mobileNumber");
        int number=y.nextInt();
        customer obj=new customer();
        obj.checkout(name,address,number);

    }
}
