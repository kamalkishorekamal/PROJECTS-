
package table;
import java.io.*;
public class mainprojekt extends t1
{
    public static int c1=0,c2=2,z=0,x=0;
    public static String halloffame1[][]=new String[2000][4];
    public void step1()throws IOException
    {
        Leap();
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        mainprojekt o1=new mainprojekt();
        fun o2=new fun();
        info o3=new info();
        for(int i1=1;i1<=1;i1++)
        {
            System.out.println("\f[R]eservation");
            System.out.println("[C]ancellation");
            System.out.println("[E]nquiry");
            System.out.println("[I]nfomation & Rules");
            System.out.println("[F]un & Games");
            System.out.println("[H]elp");
            System.out.println("[D]onate");
            System.out.println("[1H]all of Fame");
            System.out.println("[S]uggestions/Feedback");
            System.out.println("[Q]uit");
            String choice1=xy.readLine();
            if(choice1.equals("R")==true)
            {
                reservation1.mad();
            }
            else if(choice1.equals("D"))
            {
                donate.dona();
            }
            else if(choice1.equals("1H"))
            {
                halloffame.halloffame1();
            }
            else if(choice1.equals("F")==true)
            {
                fun.step1F();
            }
            else if(choice1.equals("I")==true)
            {
                info.step1I();
            }
            else if(choice1.equals("E")==true)
            {
                Enquiry.E1();
                break;
            }
            else if(choice1.equals("S")==true)
            {
                feedback.step1F();
            }
            else if(choice1.equals("C")==true)
            {
                cancellation.C1();
            }
            else if(choice1.equalsIgnoreCase("Q")==true)
            {
                break;
            }
            else if(choice1.equalsIgnoreCase("H")==true)
            {
                help.H();
            }
            else
            {
                System.out.println("Please entr a valid option.");    
                i1=0;
            }
        }
    }
    public static void main()throws IOException
    {
        mainprojekt o1=new mainprojekt();
        o1.step1();            
    }
    public void step1G()throws IOException
    {
        int p1;
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What do u want 2 know?");
        for(int i1=1;i1<=1;i1++)
        {
            System.out.println("1.)Station Code");
            System.out.println("2.)Station Name");
            System.out.println();
            System.out.println("Other Options-:");
            System.out.println("3.)Go Back/Home");
            switch(Integer.parseInt(xy.readLine()))
            {
                case 1:
                System.out.println("List of Stations-:");
                for(int i2=0;i1<47;i1++)
                {
                    p1=i1+1;
                    System.out.print(p1+".)");
                    System.out.println(Stn_Codes[i1][1]);
                }
                break;
                case 2:
                System.out.println("List of Station Codes-:");
                for(int i2=0;i1<47;i1++)
                {
                    p1=i1+1;
                    System.out.println(p1+".)"+Stn_Codes[i1][0]);
                }
                break;
                case 3:
                    step1();
                break;
            }
        }
        System.out.println();
        mainprojekt o2=new mainprojekt();
        o2.backhome("G");
    }
    
    
    public static void backhome(String step_name)throws IOException
    {
        mainprojekt o1=new mainprojekt();
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        for(int i1=1;i1<=1;i1++)
        {
            System.out.println("[Go]Back");
            System.out.println("[H]ome");
            String choice2=xy.readLine();
            if(choice2.equals("Go")==true)
            {
                if(step_name.equals("G")==true)
                {
                    o1.step1G();
                }
                
            }
            else if(choice2.equals("H")==true)
            {
                o1.step1();
            }
            else
            {
                System.out.println("Please entr the correct option & don't try to act smart");
                i1=0;
            }
        }
    }
} 