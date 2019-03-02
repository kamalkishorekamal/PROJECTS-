package table;
import java.io.*;
class Enquiry extends t1
{
    public static BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    public static void E1()throws IOException
    {
        String choice1;
        mainprojekt o1=new mainprojekt();
        for(int i1=1;i1<=1;i1++)
        {
            System.out.println("\f[L]ist of all trains");
            System.out.println("[K]now train-specific data");
            System.out.println("[P]NR Status");
            System.out.println("[C]oach Codes");
            System.out.println("[S]tation Codes & Names");
            System.out.println("[G]o Back");
            choice1=xy.readLine();
            if(choice1.equals("L")==true)
            {
                L();
            }
            else if(choice1.equals("K")==true)
            {
                K();       
            }
            else if(choice1.equals("P")==true)
            {
                P();    
            }
            else if(choice1.equals("C")==true)
            {
                C();
            }
            else if(choice1.equals("S")==true)
            {
                stepEG();
            }
            else if(choice1.equalsIgnoreCase("g")==true)
            {
                o1.step1();
                
            }
            else
            {
                System.out.println("Please entr a valid option.");
                i1=0;
            }
        }
        
    }
    public static void C()throws IOException
    {
        String choice1;
        System.out.println("\fHere are the coach codes:");
        System.out.println("                        •First Class Air Conditiones--->A1");
        System.out.println("                        •AC 2-Tier sleeper--->A2"); 
        System.out.println("                        •AC 3-Tier Sleeper--->A3"); 
        System.out.println("                        •First Class--->FC"); 
        System.out.println("                        •AC Chaircar--->CC"); 
        System.out.println("                        •Sleeper Class--->SL"); 
        System.out.println("                        •Second Sitting--->2S"); 
        System.out.println();
        System.out.println("Press <ENTER> to return.....");
        choice1=xy.readLine();
        E1();
    }
    public static void P()throws IOException
    {
        int x1=0;
        String Sl_No1,choice2,coach,DoT1,DoT2,DoT3,PNR,T_no,B_no,D_no,stat,stat1="0",choice3,name;
        name="0";
        int x=0;
        System.out.print("\f");
 a:     for(int i1=1;i1<=1;i1++)
        {
            System.out.print("Please entr the PNR:");
            PNR=xy.readLine();
            System.out.println();
            if(PNR==null)
            {
                System.out.println("Please entr ur PNR. U can't leave dis field blank.");
                i1=0;
                continue;
            }
            if(PNR.length()!=22)
            {
                System.out.println("Dis is not a PNR. Please entr a correct value.");
                i1=0;
                continue;
            }
            Sl_No1=PNR.substring(0,2);
            T_no=PNR.substring(2,7);
            coach=PNR.substring(7,9);
            DoT1=PNR.substring(13,15);
            DoT2=PNR.substring(15,17);
            DoT3=PNR.substring(17,21);
            stat=PNR.substring(21);
                for(int i4=0;i4<36;i4++)
                {
                    if(PNR.equals(t1_reserve[i4][0]))
                    {
                        
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t1_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                        
                    }
                }
                for(int i4=0;i4<36;i4++)
                {
                    if(PNR.equals(t2_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t2_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<42;i4++)
                {
                    if(PNR.equals(t3_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t3_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<42;i4++)
                {
                    if(PNR.equals(t4_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t4_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<42;i4++)
                {
                    if(PNR.equals(t5_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t5_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<42;i4++)
                {
                    if(PNR.equals(t6_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t6_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<42;i4++)
                {
                    if(PNR.equals(t7_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t7_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<42;i4++)
                {
                    if(PNR.equals(t8_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t8_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<26;i4++)
                {
                    if(PNR.equals(t9_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t9_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<28;i4++)
                {
                    if(PNR.equals(t10_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t10_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<42;i4++)
                {
                    if(PNR.equals(t11_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t11_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<36;i4++)
                {
                    if(PNR.equals(t12_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t12_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<36;i4++)
                {
                    if(PNR.equals(t13_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t13_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<36;i4++)
                {
                    if(PNR.equals(t14_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t14_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<36;i4++)
                {
                    if(PNR.equals(t15_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t15_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<36;i4++)
                {
                    if(PNR.equals(t16_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t16_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<36;i4++)
                {
                    if(PNR.equals(t17_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t17_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<42;i4++)
                {
                    if(PNR.equals(t18_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t18_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<17;i4++)
                {
                    if(PNR.equals(t19_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t19_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<28;i4++)
                {
                    if(PNR.equals(t20_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t20_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<26;i4++)
                {
                    if(PNR.equals(t21_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t21_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<28;i4++)
                {
                    if(PNR.equals(t22_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t22_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<28;i4++)
                {
                    if(PNR.equals(t23_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t23_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<20;i4++)
                {
                    if(PNR.equals(t24_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t24_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                for(int i4=0;i4<14;i4++)
                {
                    if(PNR.equals(t25_reserve[i4][0]))
                    {
                        stat1="C";
                        break;
                    }
                    else if(PNR.equals(t25_waiting[i4][0]))
                    {
                        stat1="W";
                        break;
                    }
                }
                if(stat1.equals("C"))
                {
                    System.out.println("STATUS::Confirmed");
                }
                else if(stat1.equals("W"))
                {
                    System.out.println("STATUS::Waiting");
                }
                else
                {
                    System.out.println("Please make sure dat u hv entrd d correct PNR Code.");
 b:                 for(int i3=1;i3<=1;i3++)
                    {
                        System.out.println("[R]e entr");
                        System.out.println("[G]o Back");
                        choice2=xy.readLine();
                        if(choice2.equals("R")==true)
                        {
                            i1=0;
                            continue a;
                        }
                        else if(choice2.equals("G")==true)
                        {
                            E1();
                        }
                        else
                        {
                            System.out.println("Please entr a valid option.");
                            i3=0;
                        }
                    }
                }
            
            }
        System.out.println("Press <ENTER> to return back....");
        choice3=xy.readLine();
        E1();
    }
    public static void L()throws IOException
    {
        System.out.println("\fThis is a general time-table of all the trains--:");
        System.out.println("S_No.                       TRAIN NO.                     TRAIN NAME                    SOURCE                    DEPARTURE                    DESTINATION                   ARRIVAL                                      DAYS                                   COACHES ");  
        System.out.println("                                                                                                                                                                                                              MON  TUE WED THU FRI SAT SUN             1A    2A   FC    3A    CC    SL     2S    3E");                        
        System.out.println();
        for(int i1=0;i1<25;i1++)
        {
            System.out.print(i1+1);
            for(int i2=0;i2<6;i2++)
            {
                System.out.print("                 \t"+tab_main[i1][i2]);
            }
            System.out.print("\t\t\t\t");
            System.out.print("|");
            for(int i3=0;i3<7;i3++)
            {
                System.out.print(main_day_class[i1][i3]+"|");
            }
            System.out.print("\t\t\t");
            System.out.print("|");
            for(int i4=7;i4<15;i4++)
            {
                System.out.print(main_day_class[i1][i4]+"|");
            }
            System.out.println();
        }
        System.out.println("Press <ENTER> to continue...");
        String choice1=xy.readLine();
        E1();
    }
    
    public static void K()throws IOException
    {
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        String choice1;
        for(int i1=1;i1<=1;i1++)
        {
            System.out.println("\f");
            System.out.println("[T]rain Schedule");
            System.out.println("[S]eat Availability");
            System.out.println("[G]o Back");
            choice1=xy.readLine();
            if(choice1.equals("S")==true)
            {
                stepS();    
            }
            else if(choice1.equals("T")==true)
            {
                step2T();
            }
            else if(choice1.equals("G")==true)
            {
                E1();
            }
        }
    }
    public static void stepS()throws IOException
    {
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        String T_no,choice1,choice2,choice3;
        int x1=0;
A:      for(int i1=1;i1<=1;i1++)
        {
            System.out.print("\fTrain No.:");
            T_no=xy.readLine();
            System.out.println();
            for(int i2=0;i2<25;i2++)
            {
                if(T_no.equals(tab_main[i2][0])==true)
                {
                    x1=1;
                    break;
                }
            }
            if(x1!=1)
            {
                System.out.println("LOLOLOLOLOL,Dere is no such train cover'd undr dis projekt. Wat do u wanna do?");
                for(int i3=1;i3<=1;i3++)
                {
                    System.out.println("[R]e entr");
                    System.out.println("[Go] Back");
                    choice2=xy.readLine();
                    if(choice2.equals("R")==true)
                    {
                        i1=0;
                        continue A;
                        
                    }
                    else if(choice2.equals("G")==true)
                    {
                        K();
                    }
                    else
                    {
                        System.out.println("Please entr a value.");
                        i3=0;
                    }
                }
            }
            if(T_no.equals("1057")==true)
            {
                for(int i4=0;i4<=2;i4++)
                {
                    System.out.println(t1_seat[i4][0]+"\t"+t1_seat[i4][1]);    
                }
            }
            else if(T_no.equals("1058")==true)
            {
                for(int i4=0;i4<=2;i4++)
                {
                    System.out.println(t2_seat[i4][0]+"\t"+t2_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2102")==true)
            {
                for(int i4=0;i4<=3;i4++)
                {
                    System.out.println(t3_seat[i4][0]+"\t"+t3_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2137")==true)
            {
                for(int i4=0;i4<=3;i4++)
                {
                    System.out.println(t4_seat[i4][0]+"\t"+t4_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2138")==true)
            {
                for(int i4=0;i4<=3;i4++)
                {
                    System.out.println(t5_seat[i4][0]+"\t"+t5_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2152")==true)
            {
                for(int i4=0;i4<=3;i4++)
                {
                    System.out.println(t6_seat[i4][0]+"\t"+t6_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2262")==true)
            {
                for(int i4=0;i4<=3;i4++)
                {
                    System.out.println(t7_seat[i4][0]+"\t"+t7_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2288")==true)
            {
                for(int i4=0;i4<2;i4++)
                {
                    System.out.println(t8_seat[i4][0]+"\t"+t8_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2432")==true)
            {
                for(int i4=0;i4<3;i4++)
                {
                    System.out.println(t9_seat[i4][0]+"\t"+t9_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2449")==true)
            {
                for(int i4=0;i4<4;i4++)
                {
                    System.out.println(t10_seat[i4][0]+"\t"+t10_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2450")==true)
            {
                for(int i4=0;i4<4;i4++)
                {
                    System.out.println(t11_seat[i4][0]+"\t"+t11_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2471")==true)
            {
                for(int i4=0;i4<=2;i4++)
                {
                    System.out.println(t12_seat[i4][0]+"\t"+t12_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2472")==true)
            {
                for(int i4=0;i4<=2;i4++)
                {
                    System.out.println(t13_seat[i4][0]+"\t"+t13_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2484")==true)
            {
                for(int i4=0;i4<=2;i4++)
                {
                    System.out.println(t14_seat[i4][0]+"\t"+t14_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2618")==true)
            {
                for(int i4=0;i4<=2;i4++)
                {
                    System.out.println(t15_seat[i4][0]+"\t"+t15_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2860")==true)
            {
                for(int i4=0;i4<=2;i4++)
                {
                    System.out.println(t16_seat[i4][0]+"\t"+t16_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2904")==true)
            {
                for(int i4=0;i4<=2;i4++)
                {
                    System.out.println(t17_seat[i4][0]+"\t"+t17_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2908")==true)
            {
                for(int i4=0;i4<=3;i4++)
                {
                    System.out.println(t18_seat[i4][0]+"\t"+t18_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2910")==true)
            {
                for(int i4=0;i4<=2;i4++)
                {
                    System.out.println(t19_seat[i4][0]+"\t"+t19_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2926")==true)
            {
                for(int i4=0;i4<2;i4++)
                {
                    System.out.println(t20_seat[i4][0]+"\t"+t20_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2926A")==true)
            {
                for(int i4=0;i4<=2;i4++)
                {
                    System.out.println(t21_seat[i4][0]+"\t"+t21_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2925")==true)
            {
                for(int i4=0;i4<2;i4++)
                {
                    System.out.println(t22_seat[i4][0]+"\t"+t22_seat[i4][1]);    
                }
            }
            else if(T_no.equals("2954")==true)
            {
                for(int i4=0;i4<=2;i4++)
                {
                    System.out.println(t23_seat[i4][0]+"\t"+t23_seat[i4][1]);    
                }
            }
            else if(T_no.equals("9020")==true)
            {
                for(int i4=0;i4<2;i4++)
                {
                    System.out.println(t24_seat[i4][0]+"\t"+t24_seat[i4][1]);    
                }
            }
            else if(T_no.equals("9024")==true)
            {
                for(int i4=0;i4<1;i4++)
                {
                    System.out.println(t25_seat[i4][0]+"\t"+t25_seat[i4][1]);    
                }
            }
        }
        System.out.println("Press <ENTER> to go back....");
        choice3=xy.readLine();
        K();
    }
    public static void step2T()throws IOException
    {
        String T_no;
        System.out.print("\fEntr Train No:");
        T_no=xy.readLine();
        System.out.println();
        for(int i1=1;i1<=1;i1++)
        {
            if(T_no.equals("1057")==true)
            {
                for(int i2=0;i2<20;i2++)
                {
                    for(int i3=0;i3<6;i3++)
                    {
                        System.out.print(t1_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }
            else if(T_no.equals("1058")==true)
            {
                for(int i2=0;i2<19;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t2_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2102")==true)
            {
                for(int i2=0;i2<9;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t3_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2137")==true)
            {
                for(int i2=0;i2<14;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t4_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2138")==true)
            {
                for(int i2=0;i2<15;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t5_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2152")==true)
            {
                for(int i2=0;i2<10;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t6_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2262")==true)
            {
                for(int i2=0;i2<2;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t7_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2288")==true)
            {
                for(int i2=0;i2<15;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t8_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2432")==true)
            {
                for(int i2=0;i2<17;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t9_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2449")==true)
            {
                for(int i2=0;i2<4;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t10_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2450")==true)
            {
                for(int i2=0;i2<4;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t11_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2471")==true)
            {
                for(int i2=0;i2<11;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t12_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2472")==true)
            {
                for(int i2=0;i2<10;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t13_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2484")==true)
            {
                for(int i2=0;i2<14;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t14_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2618")==true)
            {
                for(int i2=0;i2<12;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t15_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2860")==true)
            {
                for(int i2=0;i2<10;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t16_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2904")==true)
            {
                for(int i2=0;i2<15;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t17_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2908")==true)
            {
                for(int i2=0;i2<4;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t18_stop[i2][i3]+"\t");
                    }
                    System.out.println();
                }
            }   
            else if(T_no.equals("2910")==true)
            {
                for(int i2=0;i2<5;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t19_stop[i2][i3]+"\t");
                    }
                }
            }   
            else if(T_no.equals("2926")==true)
            {
                for(int i2=0;i2<15;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t20_stop[i2][i3]+"\t");
                    }
                }
            }   
            else if(T_no.equals("2926A")==true)
            {
                for(int i2=0;i2<12;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t21_stop[i2][i3]+"\t");
                    }
                }
            }   
            else if(T_no.equals("2952")==true)
            {
                for(int i2=0;i2<4;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t22_stop[i2][i3]+"\t");
                    }
                }
            }   
            else if(T_no.equals("2954")==true)
            {
                for(int i2=0;i2<7;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t23_stop[i2][i3]+"\t");
                    }
                }
            }   
            else if(T_no.equals("9020")==true)
            {
                for(int i2=0;i2<13;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t24_stop[i2][i3]+"\t");
                    }
                }
            }   
            else if(T_no.equals("9024")==true)
            {
                for(int i2=0;i2<13;i2++)
                {
                    for(int i3=0;i3<7;i3++)
                    {
                        System.out.print(t25_stop[i2][i3]+"\t");
                    }
                }
            }   
            else
            {
                System.out.println("Please entr a valid train number.");
                i1=0;
            }
        }
        System.out.println("Press <ENTER> to go back....");
        String choice1=xy.readLine();
        E1();
    }
    public static void stepEG()throws IOException
    {
        String choice1,choice2,stat=new String(),choice3,choice4;
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What do u want 2 know?");
        for(int i1=1;i1<=1;i1++)
        {
            System.out.println("\fWhat do you wanna do?");
            System.out.println("Know-:");
            System.out.println("    [1S]tation Code");
            System.out.println("    [2S]tation Name");
            System.out.println("    [L]ist of all Station Codes & Names");
            System.out.println("[G]o Back");
            choice1=xy.readLine();
            if(choice1.length()==0)
            {
                System.out.println("Please entr an option.");
                i1=0;
            }
            if(choice1.equals("1S")==true)
            {
                for(int i3=1;i3<=1;i3++)
                {
                    System.out.print("\fPlease entr Station Name:");
                    choice2=xy.readLine();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
    a:              for(int i4=0;i4<47;i4++)
                    {
                        if(choice2.equals(Stn_Codes[i4][1])==true)
                        {
                            System.out.println("Corresponding Station Code:"+Stn_Codes[i4][0]);
                            stat="T";   
                            System.out.println();
                            System.out.println("Press <ENTER> to go back...");
                            choice4=xy.readLine();
                            i4=48;
                            i1=0;
                        }
                        else
                        {
                            stat="F";
                        }
                    }
                    if(stat.equals("F")==true)
                    {
                        System.out.println("No such Station is covered under this projekt.");
   b:                     for(int i5=1;i5<=1;i5++)
                        {
                            System.out.println("[R]e entr");
                            System.out.println("[G]o Back");
                            choice3=xy.readLine();
                            if(choice3.equals("R")==true)
                            {
                                i3=0;
                                
                            }
                            else if(choice3.equals("G")==true)
                            {
                                i1=0;    
                            }
                            else if(choice3.length()==0)
                            {
                                System.out.println("Please entr an option.");
                                i5=0;
                            }
                            else
                            {
                                System.out.println("Please entr a  valid option.");
                                i5=0;
                            }
                        }
                    }
                }
            }
            else if(choice1.equals("2S")==true)
            {
  c:              for(int i3=1;i3<=1;i3++)
                {
                    System.out.print("\fPlease entr Station Code:");
                    choice2=xy.readLine();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
      d:              for(int i4=0;i4<47;i4++)
                    {
                        if(choice2.equals(Stn_Codes[i4][0])==true)
                        {
                            System.out.println("Corresponding Station Name:"+Stn_Codes[i4][1]);
                            stat="T";   
                            System.out.println("Press <ENTER> to go back...");
                            choice4=xy.readLine();
                            i1=0;
                        }
                        else
                        {
                            stat="F";
                        }
                    }
                    if(stat.equals("F")==true)
                    {
                        System.out.println("No such Station is covered under this projekt.");
                        for(int i5=1;i5<=1;i5++)
                        {
                            System.out.println("[R]e entr");
                            System.out.println("[G]o Back");
                            choice3=xy.readLine();
                            if(choice3.equals("R")==true)
                            {
                                i3=0;
                                break;
                            }
                            else if(choice3.equals("G")==true)
                            {
                                i1=0;
                                break;
                            }
                            else if(choice3.length()==0)
                            {
                                System.out.println("Please entr an option.");
                                i5=0;
                            }
                            else
                            {
                                System.out.println("Please entr a  valid option.");
                                i5=0;
                            }
                        }
                    }
                }    
            }
            else if(choice1.equals("L")==true)
            {
                System.out.println("\fCODE\t\t\t            NAME");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                for(int i4=0;i4<47;i4++)
                {
                    System.out.println(Stn_Codes[i4][0]+"   <------------------------>   "+Stn_Codes[i4][1]);
                    System.out.println();
                }
               
            }
            else if(choice1.equals("G")==true)
            {
                E1();
            }
            else
            {
                System.out.println("Please entr a valid option.");
                i1=0;
                
            }
             System.out.println("Press <ENTER> to go back...");
             choice4=xy.readLine();
             i1=0;
        }
        
    } 
}