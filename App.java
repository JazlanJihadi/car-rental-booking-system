import java.util.Scanner;
import java.io.*;
public class App
{
    public static void main(String []args)
    {
        Status s=new Status();
        Customer c=new Customer();
        Admin a=new Admin();
        Car car=new Car();
        Scanner in=new Scanner(System.in);
        Scanner in2=new Scanner(System.in);
        Scanner in3=new Scanner(System.in);
        int cont,choose;
        double tot=0;
        File input=new File("Summary.txt");
  try
  {
    FileWriter fInput=new FileWriter(input);
    PrintWriter pInput=new PrintWriter(fInput);
        do
        {
        System.out.println("WELCOME \n");
        System.out.println("Enter 1 for user and 0 for admin(else for exit):");
        choose=in.nextInt();
        if(choose==0)
        {
            System.out.println("Enter password to continue:");
            a.password=in2.nextLine();
            if(a.getPassword().equalsIgnoreCase("ADMIN"))
            {
                System.out.println("\n\n\nThe total income of the day : RM "+tot);
            }
             else 
                System.out.println("\nWRONG PASSWORD\n.\n.\n.\n");
        }
        else if(choose==1)
        {
            do
            {
                System.out.println("Enter your choice:\n");
                System.out.println("1. Reserve vehicles \n");
                System.out.println("2. Contact Us \n");
                System.out.println("3. Location of Car in Parking lot with the current amount of car \n");
                System.out.println("4. Exit \n");
                System.out.println("Enter your choice:");
                c.choose=in.nextInt();
                        if(c.choose==1)
                        {
                            System.out.println("Vehicle that we have:\n");
                            System.out.println("1. Viva    RM100/day\n");
                            System.out.println("2. Myvi    RM120/day\n");
                            System.out.println("3. Exora   RM200/day\n");
                            System.out.println("4. Kancil  RM50/day \n");
                            System.out.println("5. Kelisa  RM70/day \n");
                            System.out.println();

                            System.out.println("Enter name:");
                            c.name=in2.nextLine();
                            System.out.println("\nLicense number:");
                            c.licenseNum=in2.nextLine();
                            System.out.println("\nEnter car choice(1-Viva, 2-Myvi, 3-Exora, 4-kancil, 5-kelisa):");
                            c.carChoose=in.nextInt();
                            System.out.println("\nContact Number:");
                            c.contactNum=in2.nextLine();
                            System.out.println("\nDays rent:");
                            c.rent=in.nextInt();
                            System.out.println("\nDays Start Rent (days/month/year):");
                            c.dayStart=in2.nextLine();
                            System.out.println("\nDays End Rent(days/month/year):");
                            c.dayEnd=in2.nextLine();
                            
                            car.carChoosing(c.carChoose);
                            double prices=c.rent*car.getPrices();
                            tot=tot+prices;
                            
                            System.out.println("Name              :"    +c.getName());
                            System.out.println("\nLicense number  :"    +c.getLicenseNum());
                            System.out.println("\nEnter car name  :"    +car.getName());
                            System.out.println("\nContact Number  :"    +c.getContactNum());
                            System.out.println("\nDays rent       :"    +c.getRent());
                            System.out.println("\nDays Start Rent :"    +c.getDayStart());
                            System.out.println("\nDays End Rent   :"    +c.getDayEnd());
                            System.out.println("\nPrice           :RM " +prices);
                            System.out.println("\nKEEP CALM AND ENJOY YOUR DRIVES :) ");
                            System.out.println("\n\nPress any button to continue.");
                            
                            pInput.write("Name              :"    +c.getName()+"\n");
                            pInput.println();
                            pInput.write("\nLicense number  :"    +c.getLicenseNum()+"\n");
                            pInput.println();
                            pInput.write("\nEnter car name  :"    +car.getName()+"\n");
                            pInput.println();
                            pInput.write("\nContact Number  :"    +c.getContactNum()+"\n");
                            pInput.println();
                            pInput.write("\nDays rent       :"    +c.getRent()+"\n");
                            pInput.println();
                            pInput.write("\nDays Start Rent :"    +c.getDayStart()+"\n");
                            pInput.println();
                            pInput.write("\nDays End Rent   :"    +c.getDayEnd()+"\n");
                            pInput.println();
                            pInput.write("\nPrice           :RM " +prices+"\n");
                            pInput.println();
                        }
                        else if(c.choose==2)
                        {
                            System.out.println("Contact us :");
                            System.out.println("013-6432648\n011-123456789");
                            System.out.println("\ncar_rent@gmail.com\ncarrent.com");
                            System.out.println("\n\nPress any button to continue.");
                        }
                        else if(c.choose==3)
                        {
                            for (int i = 0; i < 14; ++i)
                            {
                                if(i%2==0)
                                System.out.println();
                                System.out.print("\nRow "+(i+1)+"\t");
                                for (int j = 0; j < 5; ++j)
                                    System.out.print("*  ");
                            }
                            System.out.println();
                            System.out.println("\nRow  1 until  3 are myvi\n");
                            System.out.println("Row  4 until  5 are exora\n");
                            System.out.println("Row  6 until  9 are viva\n");
                            System.out.println("Row 10 until 12 are kancil\n");
                            System.out.println("Row 13 until 14 are kelisa\n");
                            System.out.println("\n\nPress any button to continue.");
                            System.out.println();
                        }
                        else
                            break;
                        System.out.println("*********************************************************************************************************************************");
                    
                
               pInput.write("\n\n\nThe total income of the day : RM "+tot);
               System.out.println("Do you want to make another booking(1-Yes/0-No):");
               cont=in3.nextInt();
            }while(cont==1);
        }
        else
        {
            break;
        }
    }while((choose==1)||(choose==0));
    
    pInput.close();
    fInput.close();
  }
        catch(FileNotFoundException e2)
        {   System.err.println(e2.getMessage());}
        catch(IOException e1)
        {   System.err.println(e1.getMessage());}
}
}