package table;
import java.io.*;
class donate extends mainprojekt
{
    public static mainprojekt o1=new mainprojekt();
    public static BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    public static void dona()throws IOException
    {
        String choice2,choice3,choice4,choice5;
        System.out.println("\fU'll b doing a very good work by donating money. Quoting Liu Shing(NYC,Donated $1.54 to Wikipeida)-\"My donation is very small but my support is sincere.\"");
        System.out.println("Press <ENTER> to continue.......");
        String choice1=xy.readLine();
        for(int i1=1;i1<=1;i1++)
        {
            System.out.println("R U sure u want to continue[Y/N]?");
            choice2=xy.readLine();
            if(choice2==null)
            {
                System.out.println("Please entr an option.");
                i1=0;
            }
            else if(choice2.equalsIgnoreCase("Y")==true)
            {
                D2();
            }
            else if(choice2.equalsIgnoreCase("N")==true)
            {
                System.out.println();
                System.out.println("Press <ENTER> to return to home.......");
                choice3=xy.readLine();
                o1.step1();
            }
        }
    }
    public static void D2()throws IOException
    {
        String name,amount,Cc_no,Ba_name,choice4;
        System.out.println("\f");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for(int i2=1;i2<=1;i2++)
        {
            System.out.print("Ur name/name of organization :");
            name=xy.readLine();
            System.out.println();
            System.out.println();
            if(name==null)
            {
                System.out.println("Please entr ur name. U can't leave dis field blank.");
                i2=0;
                continue;
            }
            
            for(int i3=1;i3<=1;i3++)
            {
                System.out.println("Credit Card Number:");   
                Cc_no=xy.readLine();
                System.out.println();
                if(Cc_no==null)
                {
                    System.out.println("Please entr ur Credit Card no. U can't leave dis field blank.");
                    i3=0;
                    continue;
                }
               
                for(int i4=1;i4<=1;i4++)
                {
                    System.out.print("Bank Name:");
                    Ba_name=xy.readLine();
                    System.out.println();
                    if(Ba_name==null)
                    {
                        System.out.println("Please entr ur Credit Card no. U can't leave dis field blank.");
                        i4=0;
                        continue;
                    }
                    
                    for(int i5=1;i5<=1;i5++)
                    {
                        System.out.print("Amount(USD) :");
                        amount=xy.readLine();
                        if(amount==null)
                        {
                            System.out.println("Please entr the amount u wanna pay. U can't leave dis field blank.");
                            i5=0;
                            continue;
                        }
                        if(Integer.parseInt(amount)>=100000)
                        {
                            halloffame1[z][2]=Ba_name;
                            halloffame1[z][0]=name;
                            halloffame1[z][3]=amount;
                            halloffame1[z][1]=Cc_no;
                        }
                        System.out.println("Thank u for donating to Avenged Sevenfold Railways.");
                        System.out.println("Press <ENTER> to return to home....");
                        choice4=xy.readLine();
                        o1.step1();
                    }
                }
            }
        }
    }
}
