package table;
import java.io.*;
public class fun
{
    public static String W="W";
    public static String D="D";
    public static String A="A";
    public static void step1F()throws IOException
    {
        String choice4;
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        mainprojekt o1=new mainprojekt();
        System.out.println("\f**********************************************************************************TRAIN DRIVER********************************************************************************************************************");
        for(int i0=1;i0<=1;i0++)
        {
            System.out.println("[N]ew Game");
            System.out.println("[I]nstructions");
            System.out.println("[C]ontrols");
            System.out.println("[H]ome");
            choice4=xy.readLine();
            if(choice4.equals("N")==true)
            {
                newgame();
            }    
            if(choice4.equals("I")==true)
            {
                System.out.println("\fWelcome to the game of TRAIN DRIVER. In this game u have to lead the train from the starting point to the platform by correctly following the tracks.There are a no. of railway tracks with only one of them leading to the platform. The train can go only forward or turn left or right. It cannot go backwards. Enjoy!!!");
                System.out.println();
                System.out.println("[Go] Back");
                i0=0;
                continue;
            }   
            else if(choice4.equals("H")==true)
            {
                o1.step1();
            }
            else if(choice4.equals("C")==true)
            {
                controls();
            }
        }
    }
    
    public static void controls()throws IOException
    {
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        fun o1=new fun();
        String choice1,choice2,choice3,choice4,choice5,choice6,choice7,choice8,choice9;
        for(int i1=1;i1<=1;i1++)
        {
            System.out.println("\fThe following are the controls-:");
            if(W!=null){
            System.out.println("[F]ront->"+W);}
            else{
            System.out.println("[F]ront->   ---");}
            if(D!=null){
            System.out.println("[R]ight->   "+D);}
            else{
            System.out.println("[R]ight->   ---");}    
            if(A!=null){
            System.out.println("[L]eft ->   "+A);}
            else{
            System.out.println("[L]eft->   ---");}
            System.out.println("*Pause Menu->~");
            System.out.println();
            System.out.println("*key binding cannot be changed");
            for(int i2=1;i2<=1;i2++)
            {
                System.out.println("1.)Redefine Controls");
                System.out.println("2.)Default");
                System.out.println("3.)Go back");
                switch(Integer.parseInt(xy.readLine()))
                {
                    case 1:
                        System.out.print("\fPlease entr the control u want to change:");
                        choice1=xy.readLine();
                        System.out.println();
                        System.out.print("Please entr the new value:");
                        choice2=xy.readLine();
                        System.out.println();
                        if(choice1.equals("F")==true)
                        {
                            W=choice2;
                            if(W.equals(A)==true)
                            {
                                A=null;
                            }
                            else if(W.equals(D)==true)
                            {
                                D=null;
                            }
                        }
                        else if(choice1.equals("L")==true)
                        {
                            A=choice2;
                            if(A.equals(D)==true)
                            {
                                D=null;
                            }
                            else if(A.equals(W)==true)
                            {
                                W=null;
                            }
                        }
                        else if(choice1.equals("R")==true)
                        {
                            D=choice2;
                            if(D.equals(A)==true)
                            {
                                A=null;
                            }
                            else if(D.equals(W)==true)
                            {
                                W=null;
                            }
                         }
                        else
                        {
                            System.out.println("Please entr the correct option");
                            i2=0;
                            continue;
                        }
                        i1=0;
                    break;
                    
                    case 2:
                        System.out.println("R U sure[Y/N]?");
                        choice3=xy.readLine();
                        if(choice3.equals("Y")==true)
                        {
                            W="W";
                            A="A";
                            D="D";
                            i1=0;
                            break;
                        }
                        else if(choice3.equals("N")==true)
                        {
                            i2=0;
                            continue;
                        }
                        else
                        {
                            System.out.println("Please entr a valid option.");                            
                            i2=0;
                        }
                    break;
                    
                    case 3:
                        o1.step1F();
                    break;
                    
                    default:
                        System.out.println("Please entr a valid option");
                        i2=0;
                    break;
                }
            }
        }
    }
    
    
    public static void newgame()throws IOException
    {
        String choice5,choice6,choice7,choice8,choice9,choice10,choice11,choice12;
        fun o1=new fun();
        boolean a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12;
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        for(int i1=1;i1<=1;i1++)
            {
               
                    System.out.println("\f                                                                                               Platform"); 
                    System.out.println("********************************************************************************************************");
                    System.out.println("                                                               *");
                    System.out.println("                                                             *");    
                    System.out.println("                               ******************************");
                    System.out.println("                              *");                                    
                    System.out.println("                             *");            
                    System.out.println("$$$$$$#*************************************************************************************************");      
                    choice5=xy.readLine();
                    a1=choice5.equals(A);
                    a2=choice5.equals(D);
                    if(choice5.equals(W)==true)
                    {
                        System.out.println("\f                                                                                               Platform");
                        System.out.println("********************************************************************************************************");
                        System.out.println("                                                               *");
                        System.out.println("                                                             *");    
                        System.out.println("                               ******************************");
                        System.out.println("                              *");                                    
                        System.out.println("                             *");            
                        System.out.println("*********************$$$$$$#*****************************************************************************");      
                        for(int i2=1;i2<=1;i2++)
                        {
                            choice6=xy.readLine();
                            if(choice6.equals(A)==true)
                            {
                                System.out.println("\f                                                                                               Platform");
                                System.out.println("********************************************************************************************************");
                                System.out.println("                                                               *");
                                System.out.println("                                                             *");    
                                System.out.println("                               #*****************************");
                                System.out.println("                              $");                                    
                                System.out.println("                             $");            
                                System.out.println("*************************$$$$***************************************************************************");
                                for(int i3=1;i3<=1;i3++)
                                {
                                    System.out.println();
                                    System.out.println();
                                    System.out.println();
                                    System.out.println();
                                    choice7=xy.readLine();
                                    a3=choice7.equals(W);
                                    a4=choice7.equals(A);
                                    if(choice7.equals(D)==true)
                                    {
                                        System.out.println("\f                                                                                               Platform");
                                        System.out.println("********************************************************************************************************");
                                        System.out.println("                                                               *");
                                        System.out.println("                                                             *");    
                                        System.out.println("                               $$$$$$#***********************");
                                        System.out.println("                              *");                                    
                                        System.out.println("                             *");            
                                        System.out.println("*******************************************************************************************************");
                                        for(int i4=1;i4<=1;i4++)
                                        {
                                            choice8=xy.readLine();
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            a5=choice8.equals(A);
                                            a6=choice8.equals(D);
                                            if(choice8.equals(W)==true)
                                            {
                                                System.out.println("\f                                                                                               Platform");
                                                System.out.println("********************************************************************************************************");
                                                System.out.println("                                                               *");
                                                System.out.println("                                                             *");    
                                                System.out.println("                               ***********************$$$$$$#");
                                                System.out.println("                              *");                                    
                                                System.out.println("                             *");            
                                                System.out.println("*******************************************************************************************************");
                                                for(int i5=1;i5<=1;i5++)
                                                {
                                                    choice9=xy.readLine();
                                                    System.out.println();
                                                    System.out.println();
                                                    System.out.println();
                                                    System.out.println();
                                                    a7=choice9.equals(W);
                                                    a8=choice9.equals(D);
                                                    if(choice9.equals(A)==true)
                                                    {
                                                        System.out.println("\f                                                                                               Platform");
                                                        System.out.println("********************************************************************************************************");
                                                        System.out.println("                                                               #");
                                                        System.out.println("                                                             $");    
                                                        System.out.println("                               *************************$$$$$");
                                                        System.out.println("                              *");                                    
                                                        System.out.println("                             *");            
                                                        System.out.println("*******************************************************************************************************");
                                                        for(int i6=1;i6<=1;i6++)
                                                        {
                                                             choice10=xy.readLine();
                                                             System.out.println();
                                                             System.out.println();
                                                             System.out.println();
                                                             System.out.println();
                                                             a9=choice10.equals(W);
                                                             a10=choice10.equals(A);
                                                             if(choice10.equals(D)==true)
                                                             {  
                                                                 System.out.println("\f                                                                                               Platform");
                                                                 System.out.println("****************************************************************$$$$$$#*********************************");
                                                                 System.out.println("                                                               *");
                                                                 System.out.println("                                                             *");    
                                                                 System.out.println("                               ******************************");
                                                                 System.out.println("                              *");                                    
                                                                 System.out.println("                             *");            
                                                                 System.out.println("*******************************************************************************************************");
                                                                 for(int i7=1;i7<=1;i7++)
                                                                 {
                                                                     choice11=xy.readLine();
                                                                     a11=choice11.equals(A);
                                                                     a12=choice11.equals(D);
                                                                     if(choice11.equals(W)==true)
                                                                     {
                                                                         System.out.println("\f                                                                                               Platform");
                                                                         System.out.println("************************************************************************************************$$$$$$#");
                                                                         System.out.println("                                                               *");
                                                                         System.out.println("                                                             *");    
                                                                         System.out.println("                               ******************************");
                                                                         System.out.println("                              *");                                    
                                                                         System.out.println("                             *");            
                                                                         System.out.println("*******************************************************************************************************");
                                                                         System.out.println();
                                                                         System.out.println();
                                                                         System.out.println();
                                                                         System.out.println();
                                                                         System.out.println();
                                                                         System.out.println("***********************************************************************************************************************************************");
                                                                         System.out.println("********************************************!!!!!YOU WIN!!!!!**********************************************************************************");
                                                                         i1=2;
                                                                         System.out.println("Press <ENTER>....");
                                                                         xy.readLine();
                                                                         o1.step1F();
                                                                         break;
                                                                     }
                                                                     else if(a11==true || a12==true)
                                                                     {
                                                                         System.out.println("\f                                                                            $  $            Platform");
                                                                         System.out.println("****************************************************************************$$$#********************");
                                                                         System.out.println("                                                               *            $$  ");
                                                                         System.out.println("                                                             *");    
                                                                         System.out.println("                               ******************************");
                                                                         System.out.println("                              *");                                    
                                                                         System.out.println("                             *");            
                                                                         System.out.println("*******************************************************************************************************");
                                                                         System.out.println();
                                                                         System.out.println("The train has derailed. LOSER!!!!");
                                                                         i1=2;
                                                                         System.out.println("Press <ENTER>.....");
                                                                         xy.readLine();
                                                                         o1.step1F();
                                                                         break;
                                                                     }
                                                                     else if(choice11.equals("~")==true)
                                                                     {
                                                                         for(int i10=1;i10<=1;i10++)
                                                                         {
                                                                             System.out.println("R u sure[Y/N]?");
                                                                             choice12=xy.readLine();
                                                                             if(choice12.equals("Y")==true)
                                                                             {
                                                                                 i1=2;
                                                                                 o1.step1F();
                                                                                }
                                                                                else if(choice12.equals("N")==true)
                                                                                {
                                                                                    i7=0;
                                                                                    break;
                                                                                }
                                                                                else
                                                                                {
                                                                                    System.out.println("Please entr a valid option.");
                                                                                    i10=0;
                                                                                }
                                                                            }
                                                                      }
                                                                     else
                                                                     {
                                                                         i7=0;
                                                                     }
                                                                 }
                                                             }
                                                             else if(a9==true)
                                                             {
                                                                 System.out.println("\f                                                                                               Platform");
                                                                 System.out.println("***************************************************************#***************************************");
                                                                 System.out.println("                                                               $");
                                                                 System.out.println("                                                             $  $");    
                                                                 System.out.println("                               ***************************$ $$");
                                                                 System.out.println("                              *                            $ $");                                    
                                                                 System.out.println("                             *");            
                                                                 System.out.println("*******************************************************************************************************");
                                                                 System.out.println("The train has derailed. LOSER!!!!");
                                                                 i1=2;
                                                                 System.out.println("Press <ENTER>.....");
                                                                 xy.readLine();
                                                                 o1.step1F();
                                                                 break;
                                                             }
                                                             else if(a10==true)
                                                             {
                                                                 System.out.println("\f                                                                                               Platform");
                                                                 System.out.println("*********************************************************#$$$$$$$**************************************");
                                                                 System.out.println("                                                               *");
                                                                 System.out.println("                                                             *");    
                                                                 System.out.println("                               ******************************");
                                                                 System.out.println("                              *");                                    
                                                                 System.out.println("                             *");            
                                                                 System.out.println("*******************************************************************************************************");   
                                                                 System.out.println("ALERT::The train has lost control. Now it'll crash.");
                                                                 System.out.println();
                                                                 System.out.println("$ $ $                                                                                       Platform");
                                                                 System.out.println("#$$*************************************************************************************************");
                                                                 System.out.println(" $ $                                                          *");
                                                                 System.out.println("                                                             *");    
                                                                 System.out.println("                               ******************************");
                                                                 System.out.println("                              *");                                    
                                                                 System.out.println("                             *");            
                                                                 System.out.println("*******************************************************************************************************");
                                                                 System.out.println("The train crashed. LOSER!!!!!");
                                                                 i1=2;
                                                                 System.out.println("Press <ENTER>.....");
                                                                 xy.readLine();
                                                                 o1.step1F();
                                                                 break;
                                                             }
                                                             else if(choice10.equals("~")==true)
                                                             {
                                                                 for(int i10=1;i10<=1;i10++)
                                                                 {
                                                                     System.out.println("R u sure[Y/N]?");
                                                                     choice12=xy.readLine();
                                                                     if(choice12.equals("Y")==true)
                                                                     {
                                                                         i1=2;
                                                                         o1.step1F();
                                                                        }
                                                                        else if(choice12.equals("N")==true)
                                                                        {
                                                                            i6=0;
                                                                            break;
                                                                        }
                                                                        else
                                                                        {
                                                                            System.out.println("Please entr a valid option.");
                                                                            i10=0;
                                                                        }
                                                                    }
                                                                }
                                                             else
                                                             {
                                                                 i6=0;
                                                             }
                                                         }
                                                    }
                                                    else if(a7==true || a8==true)
                                                    {
                                                        System.out.println("\f                                                                                               Platform");
                                                        System.out.println("********************************************************************************************************");
                                                        System.out.println("                                                               *");
                                                        System.out.println("                                                          $   *");    
                                                        System.out.println("                               **************************$$$#");
                                                        System.out.println("                              *                         $ $  ");                                    
                                                        System.out.println("                             *");            
                                                        System.out.println("*******************************************************************************************************");
                                                        System.out.println("The train has derailed. LOSER!!!!");
                                                        i1=2;
                                                        System.out.println("Press <ENTER>.....");
                                                        xy.readLine();
                                                        o1.step1F();
                                                        break;
                                                    }
                                                    else if(choice9.equals("~")==true)
                                                    {
                                                        for(int i10=1;i10<=1;i10++)
                                                        {
                                                            System.out.println("R u sure[Y/N]?");
                                                            choice12=xy.readLine();
                                                            if(choice12.equals("Y")==true)
                                                            {
                                                                i1=2;
                                                                o1.step1F();
                                                            }
                                                            else if(choice12.equals("N")==true)
                                                            {
                                                                i5=0;
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                System.out.println("Please entr a valid option.");
                                                                i10=0;
                                                            }
                                                        }
                                                    }
                                                    else
                                                    {
                                                        i5=0;
                                                    }
                                                }
                                            }
                                            else if(a5==true || a6==true)
                                            {
                                                System.out.println("\f                                                                                               Platform");
                                                System.out.println("********************************************************************************************************");
                                                System.out.println("                                                               *");
                                                System.out.println("                                             $ $              *");    
                                                System.out.println("                               **************$$$#*************");
                                                System.out.println("                              *               $$");                                    
                                                System.out.println("                             *");            
                                                System.out.println("*******************************************************************************************************");
                                                System.out.println("The train has derailed. LOSER!!!!");
                                                System.out.println("Press <ENTER>.....");
                                                xy.readLine();
                                                i1=2;
                                                o1.step1F();
                                                break;
                                            }
                                            else if(choice8.equals("~")==true)
                                            {
                                                for(int i10=1;i10<=1;i10++)
                                                {
                                                    System.out.println("R u sure[Y/N]?");
                                                    choice12=xy.readLine();
                                                    if(choice12.equals("Y")==true)
                                                    {
                                                        i1=2;
                                                        o1.step1F();
                                                    }
                                                    else if(choice12.equals("N")==true)
                                                    {
                                                        i4=0;
                                                        break;
                                                    }
                                                    else
                                                    {
                                                        System.out.println("Please entr a valid option.");
                                                        i10=0;
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                i4=0;
                                            }
                                        }
                                    }
                                    else if(a3==true || a4==true)
                                    {
                                        System.out.println("\f                                                                                               Platform");
                                        System.out.println("********************************************************************************************************");
                                        System.out.println("                                                               *");
                                        System.out.println("                                                             *");    
                                        System.out.println("                               #**********************");
                                        System.out.println("                              $$");                                    
                                        System.out.println("                            $ $");            
                                        System.out.println("****************************$**$*************************************************************************");
                                        System.out.println();
                                        System.out.println("The train has derailed. LOSER!!!!");
                                        i1=2;
                                        System.out.println("Press <ENTER>.....");
                                        xy.readLine();
                                        o1.step1F();
                                        break;
                                    }
                                    else if(choice7.equals("~")==true)
                                    {   
                                        for(int i10=1;i10<=1;i10++)
                                        {
                                            System.out.println("R u sure[Y/N]?");
                                            choice12=xy.readLine();
                                            if(choice12.equals("Y")==true)
                                            {
                                                i1=2;
                                               o1.step1F();
                                            }
                                            else if(choice12.equals("N")==true)
                                            {
                                                i3=0;
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Please entr a valid option.");
                                                i10=0;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        i3=0;
                                    }
                                 }
                            }
                            else if(choice6.equals(W)==true)
                            {
                                System.out.println("\f                                                                                               Platform");
                                System.out.println("********************************************************************************************************");
                                System.out.println("                                                               *");
                                System.out.println("                                                             *");    
                                System.out.println("                               ******************************");
                                System.out.println("                              *");                                    
                                System.out.println("                             *");            
                                System.out.println("******************************$$$$$$#*******************************************************************");      
                                System.out.println();
                                System.out.println("ALERT::::The train  has lost control. Now it will crash.");
                                System.out.println();
                                System.out.println("                                                                                               Platform");
                                System.out.println("********************************************************************************************************");
                                System.out.println("                                                               *");
                                System.out.println("                                                             *");    
                                System.out.println("                               ******************************");
                                System.out.println("                              *");                                    
                                System.out.println("                             *                                                                      $ $ ");            
                                System.out.println("****************************************************************************************************$$$#");
                                System.out.println("                                                                                                    $  $");
                                System.out.println();
                                System.out.println("The train crashed. LOSER!!!!");
                                i1=2;
                                System.out.println("Press <ENTER>.....");
                                xy.readLine();
                                o1.step1F();
                                break;
                            }
                            else if(choice6.equals("~")==true)
                            {
                                for(int i10=1;i10<=1;i10++)
                                {
                                    System.out.println("R u sure[Y/N]?");
                                    choice12=xy.readLine();
                                    if(choice12.equals("Y")==true)
                                    {
                                        i1=2;
                                       o1.step1F();
                                    }
                                    else if(choice12.equals("N")==true)
                                    {
                                        i2=0;
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Please entr a valid option.");
                                        i10=0;
                                    }
                                }
                            }
                        }
                    }
                    else if(a1==true||a2==true)
                    {
                        System.out.println("\f                                                                                               Platform");
                        System.out.println("********************************************************************************************************");
                        System.out.println("                                                               *");
                        System.out.println("                                                             *");    
                        System.out.println("                               ******************************");
                        System.out.println("                              *");                                    
                        System.out.println("   $                         *");            
                        System.out.println("$$$$#*************************************************************************************************");      
                        System.out.println("   $");
                        System.out.println("The train has derailed. LOSER!!!");
                        i1=2;
                        System.out.println("Press <ENTER>.....");
                        xy.readLine();
                        o1.step1F();
                        break;
                    }
                    else if(choice5.equals("~")==true)
                    {
                        for(int i10=1;i10<=1;i10++)
                        {
                        System.out.println("R u sure[Y/N]?");
                        choice12=xy.readLine();
                        if(choice12.equals("Y")==true)
                        {
                            i1=2;
                            o1.step1F();
                        }
                        else if(choice12.equals("N")==true)
                        {
                            i1=0;
                            break;
                        }
                        else
                        {
                            System.out.println("Please entr a valid option.");
                            i10=0;
                        }
                    }
                    }
                    else
                    {
                        i1=0;
                    }
                }
           
        }
}

