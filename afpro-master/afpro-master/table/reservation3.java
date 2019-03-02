package table;
import java.io.*;
class reservation3 extends reservation2
{
    public static mainprojekt o1=new mainprojekt();
    public static BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    public static String r1(int x9)throws IOException
    {
        int x8=0,a1=0;
        String stat1="F",stat2="F";
        String date1,date2,date3,date4,date5,date6,choice1;
                    for(int i1=1;i1<=1;i1++)
                    {
                        System.out.println("\f---------------------------------------------------------------------------------------------PERSONAL DETAILS--------------------------------------------------------------------");
                        for(int i5=1;i5<=1;i5++)
                        {
                            System.out.print("First Name:");
                            F_name=xy.readLine();
                            System.out.println();
                            if(F_name.length()==0)
                            {
                                System.out.println("This field cannot b left blank.");
                                i5=0;
                                continue;
                            }
                            else
                            {
                                System.out.print("Middle Name:");
                                M_name=xy.readLine();
                                System.out.println(); 
                                System.out.print("Last Name:");
                                L_name=xy.readLine();
                                System.out.println();
                                name=F_name+M_name+L_name;
                                System.out.println("-----------------------------------------------------------------------------------------------CONTACT DETAILS-------------------------------------------------------------------");
                                for(int i12=1;i12<=1;i12++)
                                {
                                    System.out.print("Full Address:");
                                    add=xy.readLine();
                                    System.out.println();
                                    if(add.length()==0)
                                    {
                                        System.out.println("Dis field can't be left blank.");
                                        i12=0;
                                        continue;
                                    }
                                    else
                                    {
                                        for(int i11=1;i11<=1;i11++)
                                        {
                                            System.out.print("City:");
                                            C_name=xy.readLine();
                                            System.out.println();
                                            if(C_name.length()==0)
                                            {
                                                System.out.println("Dis field can't b left blank.");
                                                i11=0;
                                            }
                                            else
                                            {
                                                for(int i13=1;i13<=1;i13++)
                                                {
                                                    System.out.print("State:");
                                                    S_name=xy.readLine();
                                                    System.out.println();
                                                    if(S_name.length()==0)
                                                    {
                                                        System.out.println("Dis field can't b left blank.");
                                                        i13=0;
                                                    }
                                                    else
                                                    {
                                                        for(int i14=1;i14<=1;i14++)
                                                        {   
                                                            System.out.print("Pin Code:");
                                                            P_code=xy.readLine();
                                                            System.out.println();
                                                            if(P_code.length()==0)
                                                            {
                                                                System.out.println("Dis field can't b left blank.");
                                                                i14=0;
                                                            }
                                                            else
                                                            {
                                                                System.out.print("Mobile No.:");
                                                                M_no=xy.readLine();
                                                                System.out.println();
                                                                System.out.print("Landline:");
                                                                L_no=xy.readLine();
                                                                System.out.println();
                                                                if(x9==1)
                                                                {
                                                                    System.out.println("------------------------------------------------------------------------------------------------JOURNEY DETAILS------------------------------------------------------------------");
                                                                }
                                                                for(int i15=1;i15<=1;i15++)
                                                                {
                                                                    if(x9==1)
                                                                    {
                                                                        System.out.print("Boarding Point:");
                                                                        B_name=xy.readLine();
                                                                        if(B_name.length()==0)
                                                                        {
                                                                            System.out.println("This field can't b left empty");
                                                                            i15=0;
                                                                            continue;
                                                                        }
                                                                        x2=check_board_dest.ch_stn(T_no,B_name);
                                                                        System.out.println();
                                                                    }
                                                                        if(x2.equals("T")==true)
                                                                        {
                                                                        for(int i16=1;i16<=1;i16++)
                                                                        {
                                                                            if(x9==1)
                                                                            {
                                                                            System.out.print("Destination:");
                                                                            D_name=xy.readLine();
                                                                            System.out.println();
                                                                            if(D_name==null)
                                                                            {
                                                                                System.out.println("Dis field can't b left blank.");
                                                                                i16=0;
                                                                                continue;
                                                                            }
                                                                            x3=check_board_dest.ch_stn(T_no,D_name);
                                                                            x2=check_board_dest.ch_b_de(T_no,B_name,D_name);
                                                                            }
                                                                            if(x2.equals("T")==true && x3.equals("T")==true)
                                                                            {
                                                                                for(int i10=1;i10<=1;i10++)
                                                                                {
                                                                                    if(x9==1)
                                                                                    {
                                                                                        System.out.print("Date of Travel[dd/MM/yyyy]:");
                                                                                    date=xy.readLine();
                                                                                    System.out.println();
                                                                                    date1=date.substring(0,2);
                                                                                    date4=date.substring(3,5);
                                                                                    date2=date.substring(2,3);
                                                                                    date3=date.substring(5,6);
                                                                                    date5=date.substring(6);
                                                                                    if(date1.equals("01")==false && date1.equals("04")==false && date1.equals("02")==false && date1.equals("03")==false && date1.equals("05")==false && date1.equals("06")==false && date1.equals("07")==false && date1.equals("08")==false && date1.equals("09")==false && date1.equals("10")==false && date1.equals("11")==false && date1.equals("12")==false && date1.equals("13")==false && date1.equals("14")==false && date1.equals("15")==false && date1.equals("16")==false && date1.equals("17")==false && date1.equals("18")==false && date1.equals("19")==false && date1.equals("20")==false && date1.equals("21")==false && date1.equals("22")==false && date1.equals("23")==false && date1.equals("24")==false && date1.equals("25")==false && date1.equals("26")==false && date1.equals("26")==false && date1.equals("27")==false && date1.equals("28")==false && date1.equals("29")==false && date1.equals("30")==false && date1.equals("31")==false) 
                                                                                    {
                                                                                        System.out.println("Please entr d date correctly.");
                                                                                        i10=0;
                                                                                        continue;
                                                                                    }
                                                                                    if(date2.equals("/")==false || date3.equals("/")==false)
                                                                                    {   
                                                                                        System.out.println("Looks like u hvn't entrd d date in correct order.");
                                                                                        i10=0;
                                                                                        continue;
                                                                                    }
                                                                                    if(date4.equals("01")==false && date4.equals("02")==false && date4.equals("03")==false && date4.equals("04")==false && date4.equals("05")==false && date4.equals("06")==false && date4.equals("07")==false && date4.equals("08")==false && date4.equals("09")==false && date4.equals("10")==false && date4.equals("11")==false && date4.equals("12")==false)
                                                                                    {
                                                                                        System.out.println("Please entr the date correctly.");
                                                                                        i10=0;
                                                                                        continue;
                                                                                    }
                                                                                    if(date5.length()!=4)
                                                                                    {
                                                                                        System.out.println("Looks like u hvn't entrd d date in right format.");
                                                                                        i10=0;
                                                                                        continue;
                                                                                    }
                                                                                    x1=ch_date.check_board_date(T_no,B_name,date);
                                                                                    if(x1.equals("F")==true)
                                                                                    {
                                                                                        System.out.println("D date u hv entrd is either in wrong format or d train doesn't travel on dis date. Please entr a correct value.");
                                                                                        i10=0;
                                                                                        continue;
                                                                                    }
                                                                                    else if(date.equals(null)==true)
                                                                                    {
                                                                                        System.out.println("U can't leave dis field empty. Please re entr the value.");
                                                                                        i10=0;
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                                System.out.println("----------------------------------------------------------------------------------------------FINANCIAL DETAILS---------------------------------------------------------------------");
                                                                                for(int i17=1;i17<=1;i17++)
                                                                                {
                                                                                    if(x9==1)
                                                                                    {
                                                                                    System.out.print("Bank:");
                                                                                    Ba_name=xy.readLine();
                                                                                    System.out.println();
                                                                                    if(Ba_name.length()==0)
                                                                                    {
                                                                                        System.out.println("U cannot leave this field blank.");
                                                                                        i17=0;
                                                                                        continue;
                                                                                    }
                                                                                    }
                                                                                    for(int i18=1;i18<=1;i18++)
                                                                                    {
                                                                                        if(x9==1)
                                                                                        {
                                                                                        System.out.print("Credit Card No:");
                                                                                        Cc_no=xy.readLine();
                                                                                        System.out.println();
                                                                                        System.out.println();
                                                                                        System.out.println();            
                                                                                        System.out.println();
                                                                                        if(Cc_no.length()==0)
                                                                                        {
                                                                                            System.out.println("U can't leave dis field empty.");
                                                                                            i17=0;
                                                                                            continue;
                                                                                        }
                                                                                        }
                                                                                        System.out.println("\fThese r d details u entred:-");
                                                                                        System.out.println("---------------------------------------------------------------------------------------------[P]ERSONAL DETAILS---------------------------------------------------------------------");
                                                                                        System.out.println("[N]ame:"+F_name+" "+M_name+" "+L_name);
                                                                                        System.out.println("---------------------------------------------------------------------------------------------[C]ONTACT DETAILS----------------------------------------------------------------------");
                                                                                        System.out.println("[F]ull Address:"+add);                                                                               
                                                                                        System.out.println("[C]ity:"+C_name);
                                                                                        System.out.println("[S]tate:"+S_name);
                                                                                        System.out.println("[P]in Code:"+P_code);
                                                                                        System.out.println("[M]obile No.:"+M_no);
                                                                                        System.out.println("[L]andline:"+L_no);
                                                                                        if(x9==1)
                                                                                        {
                                                                                            System.out.println("----------------------------------------------------------------------------------------------[J]OURNEY DETAILS----------------------------------------------------------------------");
                                                                                            System.out.println("Train No.:"+T_no);
                                                                                            System.out.println("[C]lass:"+pc);
                                                                                            System.out.println("[D]ate:"+date);
                                                                                            System.out.println("[B]oarding Point:"+B_name);
                                                                                            System.out.println("[De]stination:"+D_name);
                                                                                        }
                                                                                        System.out.println("----------------------------------------------------------------------------------------------[F]INANCIAL DETAILS---------------------------------------------------------------------");
                                                                                        System.out.println("[B]ank:"+Ba_name);
                                                                                        System.out.println("[C]redit Card No:"+Cc_no);
                                                                                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                                        for(int i2=1;i2<=1;i2++)
                                                                                        {
                                                                                            System.out.println("[R]e entr data");
                                                                                            System.out.println("[S]ubmit");
                                                                                            System.out.println("[C]ancel");
                                                                                            choice1=xy.readLine();
                                                                                            if(choice1.equals("S")==true)
                                                                                            {
                                                                                                stat="C";
                                                                                                for(int i3=1;i3<=1;i3++)
                                                                                                {   
                                                                                                    System.out.println("R U Sure[Y/N]?");
                                                                                                    choice2=xy.readLine();
                                                                                                    if(choice2.equals("Y")==true)
                                                                                                    {
                                                                                                        if(T_no.equals("1057")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<20;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t1_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=i4+1;
                                                                                                                        stat1="T";
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t1_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=i4+1;
                                                                                                                        stat2="T";
                                                                                                                    }
                                                                                                                }
                                                                                                                if(stat2.equals("T")==true && stat1.equals("T")==true)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t1_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            
                                                                                                            t1_reserve[y][1]=name;
                                                                                                            t1_reserve[y][2]=date;
                                                                                                            t1_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t1_reserve[y][5]=M_no;
                                                                                                            t1_reserve[y][6]=L_no;
                                                                                                            t1_reserve[y][7]=B_name;
                                                                                                            t1_reserve[y][8]=D_name;
                                                                                                            t1_reserve[y][9]=Ba_name;
                                                                                                            t1_reserve[y][10]=Cc_no;
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t1_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t1_seat[i7][1]=String.valueOf(Integer.parseInt(t1_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t1_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("1058")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<19;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t2_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t2_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t2_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t2_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t2_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t2_reserve[y][1]=name;
                                                                                                            t2_reserve[y][2]=date;
                                                                                                            t2_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t2_reserve[y][5]=M_no;
                                                                                                            t2_reserve[y][6]=L_no;
                                                                                                            t2_reserve[y][7]=B_name;
                                                                                                            t2_reserve[y][8]=D_name;
                                                                                                            t2_reserve[y][9]=Ba_name;
                                                                                                            t2_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t2_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t2_seat[i7][1]=String.valueOf(Integer.parseInt(t2_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t2_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2102")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<9;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t3_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t3_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t3_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t3_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t3_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t3_reserve[y][1]=name;
                                                                                                            t3_reserve[y][2]=date;
                                                                                                            t3_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t3_reserve[y][5]=M_no;
                                                                                                            t3_reserve[y][6]=L_no;
                                                                                                            t3_reserve[y][7]=B_name;
                                                                                                            t3_reserve[y][8]=D_name;
                                                                                                            t3_reserve[y][9]=Ba_name;
                                                                                                            t3_reserve[y][10]=Cc_no;  
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t3_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t3_seat[i7][1]=String.valueOf(Integer.parseInt(t3_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t3_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2137")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<14;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t4_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t4_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t4_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t4_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            stat="C";
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t4_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t4_reserve[y][1]=name;
                                                                                                            t4_reserve[y][2]=date;
                                                                                                            t4_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t4_reserve[y][5]=M_no;
                                                                                                            t4_reserve[y][6]=L_no;
                                                                                                            t4_reserve[y][7]=B_name;
                                                                                                            t4_reserve[y][8]=D_name;
                                                                                                            t4_reserve[y][9]=Ba_name;
                                                                                                            t4_reserve[y][10]=Cc_no;    
                                                                                                            for(int i7=0;i7<4;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t4_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t4_seat[i7][1]=String.valueOf(Integer.parseInt(t4_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t4_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2138")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<15;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t5_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t5_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t5_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t5_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            stat="C";
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t5_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t5_reserve[y][1]=name;
                                                                                                            t5_reserve[y][2]=date;
                                                                                                            t5_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t5_reserve[y][5]=M_no;
                                                                                                            t5_reserve[y][6]=L_no;
                                                                                                            t5_reserve[y][7]=B_name;
                                                                                                            t5_reserve[y][8]=D_name;
                                                                                                            t5_reserve[y][9]=Ba_name;
                                                                                                            t5_reserve[y][10]=Cc_no;    
                                                                                                            for(int i7=0;i7<4;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t5_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t5_seat[i7][1]=String.valueOf(Integer.parseInt(t5_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t5_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2152")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<10;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t6_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t6_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t6_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t6_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t6_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t6_reserve[y][1]=name;
                                                                                                            t6_reserve[y][2]=date;
                                                                                                            t6_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t6_reserve[y][5]=M_no;
                                                                                                            t6_reserve[y][6]=L_no;
                                                                                                            t6_reserve[y][7]=B_name;
                                                                                                            t6_reserve[y][8]=D_name;
                                                                                                            t6_reserve[y][9]=Ba_name;
                                                                                                            t6_reserve[y][10]=Cc_no;      
                                                                                                            for(int i7=0;i7<4;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t6_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t6_seat[i7][1]=String.valueOf(Integer.parseInt(t6_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t6_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2262")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<2;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t7_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t7_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t7_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t7_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t7_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t7_reserve[y][1]=name;
                                                                                                            t7_reserve[y][2]=date;
                                                                                                            t7_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t7_reserve[y][5]=M_no;
                                                                                                            t7_reserve[y][6]=L_no;
                                                                                                            t7_reserve[y][7]=B_name;
                                                                                                            t7_reserve[y][8]=D_name;
                                                                                                            t7_reserve[y][9]=Ba_name;
                                                                                                            t7_reserve[y][10]=Cc_no;      
                                                                                                            for(int i7=0;i7<4;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t7_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t7_seat[i7][1]=String.valueOf(Integer.parseInt(t7_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t7_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2288")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<15;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t8_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t8_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t8_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t8_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t8_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t8_reserve[y][1]=name;
                                                                                                            t8_reserve[y][2]=date;
                                                                                                            t8_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t8_reserve[y][5]=M_no;
                                                                                                            t8_reserve[y][6]=L_no;
                                                                                                            t8_reserve[y][7]=B_name;
                                                                                                            t8_reserve[y][8]=D_name;
                                                                                                            t8_reserve[y][9]=Ba_name;
                                                                                                            t8_reserve[y][10]=Cc_no; 
                                                                                                            for(int i7=0;i7<2;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t8_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t8_seat[i7][1]=String.valueOf(Integer.parseInt(t8_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t8_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2432")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<7;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t9_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t9_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t9_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t9_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t9_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t9_reserve[y][1]=name;
                                                                                                            t9_reserve[y][2]=date;
                                                                                                            t9_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t9_reserve[y][5]=M_no;
                                                                                                            t9_reserve[y][6]=L_no;
                                                                                                            t9_reserve[y][7]=B_name;
                                                                                                            t9_reserve[y][8]=D_name;
                                                                                                            t9_reserve[y][9]=Ba_name;
                                                                                                            t9_reserve[y][10]=Cc_no;       
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t9_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t9_seat[i7][1]=String.valueOf(Integer.parseInt(t9_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t9_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2449")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<4;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t10_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t10_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t10_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t10_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t10_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t10_reserve[y][1]=name;
                                                                                                            t10_reserve[y][2]=date;
                                                                                                            t10_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t10_reserve[y][5]=M_no;
                                                                                                            t10_reserve[y][6]=L_no;
                                                                                                            t10_reserve[y][7]=B_name;
                                                                                                            t10_reserve[y][8]=D_name;
                                                                                                            t10_reserve[y][9]=Ba_name;
                                                                                                            t10_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<4;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t10_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t10_seat[i7][1]=String.valueOf(Integer.parseInt(t10_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t10_reserve[y-i8][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2450")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<4;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t11_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t11_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t11_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t11_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t11_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t11_reserve[y][1]=name;
                                                                                                            t11_reserve[y][2]=date;
                                                                                                            t11_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t11_reserve[y][5]=M_no;
                                                                                                            t11_reserve[y][6]=L_no;
                                                                                                            t11_reserve[y][7]=B_name;
                                                                                                            t11_reserve[y][8]=D_name;
                                                                                                            t11_reserve[y][9]=Ba_name;
                                                                                                            t11_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<4;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t11_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t11_seat[i7][1]=String.valueOf(Integer.parseInt(t11_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t11_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2471")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<11;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t12_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t12_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t12_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t12_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t12_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }    
                                                                                                            t12_reserve[y][1]=name;
                                                                                                            t12_reserve[y][2]=date;
                                                                                                            t12_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t12_reserve[y][5]=M_no;
                                                                                                            t12_reserve[y][6]=L_no;
                                                                                                            t12_reserve[y][7]=B_name;
                                                                                                            t12_reserve[y][8]=D_name;
                                                                                                            t12_reserve[y][9]=Ba_name;
                                                                                                            t12_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t12_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t12_seat[i7][1]=String.valueOf(Integer.parseInt(t12_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t12_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2472")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<10;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t12_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t12_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t12_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t12_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t13_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t13_reserve[y][1]=name;
                                                                                                            t13_reserve[y][2]=date;
                                                                                                            t13_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t13_reserve[y][5]=M_no;
                                                                                                            t13_reserve[y][6]=L_no;
                                                                                                            t13_reserve[y][7]=B_name;
                                                                                                            t13_reserve[y][8]=D_name;
                                                                                                            t13_reserve[y][9]=Ba_name;
                                                                                                            t13_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t13_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t13_seat[i7][1]=String.valueOf(Integer.parseInt(t13_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t13_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2484")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<14;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t12_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t12_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t12_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t12_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t14_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t14_reserve[y][1]=name;
                                                                                                            t14_reserve[y][2]=date;
                                                                                                            t14_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t14_reserve[y][5]=M_no;
                                                                                                            t14_reserve[y][6]=L_no;
                                                                                                            t14_reserve[y][7]=B_name;
                                                                                                            t14_reserve[y][8]=D_name;
                                                                                                            t14_reserve[y][9]=Ba_name;
                                                                                                            t14_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t14_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t14_seat[i7][1]=String.valueOf(Integer.parseInt(t14_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t14_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2618")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<12;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t15_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t15_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t15_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t15_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t15_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t15_reserve[y][1]=name;
                                                                                                            t15_reserve[y][2]=date;
                                                                                                            t15_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t15_reserve[y][5]=M_no;
                                                                                                            t15_reserve[y][6]=L_no;
                                                                                                            t15_reserve[y][7]=B_name;
                                                                                                            t15_reserve[y][8]=D_name;
                                                                                                            t15_reserve[y][9]=Ba_name;
                                                                                                            t15_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t15_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t15_seat[i7][1]=String.valueOf(Integer.parseInt(t15_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t15_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2860")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4>=0;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t16_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t16_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t16_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t16_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }

                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t16_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t16_reserve[y][1]=name;
                                                                                                            t16_reserve[y][2]=date;
                                                                                                            t16_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t16_reserve[y][5]=M_no;
                                                                                                            t16_reserve[y][6]=L_no;
                                                                                                            t16_reserve[y][7]=B_name;
                                                                                                            t16_reserve[y][8]=D_name;
                                                                                                            t16_reserve[y][9]=Ba_name;
                                                                                                            t16_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t16_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t16_seat[i7][1]=String.valueOf(Integer.parseInt(t16_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t16_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2904")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<15;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t17_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t17_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t17_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t17_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t17_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t17_reserve[y][1]=name;
                                                                                                            t17_reserve[y][2]=date;
                                                                                                            t17_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t17_reserve[y][5]=M_no;
                                                                                                            t17_reserve[y][6]=L_no;
                                                                                                            t17_reserve[y][7]=B_name;
                                                                                                            t17_reserve[y][8]=D_name;
                                                                                                            t17_reserve[y][9]=Ba_name;
                                                                                                            t17_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t17_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t17_seat[i7][1]=String.valueOf(Integer.parseInt(t17_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t17_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2908")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<4;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t18_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t18_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t18_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t18_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t18_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t18_reserve[y][1]=name;
                                                                                                            t18_reserve[y][2]=date;
                                                                                                            t18_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t18_reserve[y][5]=M_no;
                                                                                                            t18_reserve[y][6]=L_no;
                                                                                                            t18_reserve[y][7]=B_name;
                                                                                                            t18_reserve[y][8]=D_name;
                                                                                                            t18_reserve[y][9]=Ba_name;
                                                                                                            t18_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<4;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t18_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t18_seat[i7][1]=String.valueOf(Integer.parseInt(t18_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t18_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2910")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<5;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t19_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t19_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t19_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t19_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t19_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t19_reserve[y][1]=name;
                                                                                                            t19_reserve[y][2]=date;
                                                                                                            t19_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t19_reserve[y][5]=M_no;
                                                                                                            t19_reserve[y][6]=L_no;
                                                                                                            t19_reserve[y][7]=B_name;
                                                                                                            t19_reserve[y][8]=D_name;
                                                                                                            t19_reserve[y][9]=Ba_name;
                                                                                                            t19_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<2;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t19_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t19_seat[i7][1]=String.valueOf(Integer.parseInt(t19_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t19_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2926")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<15;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t20_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t20_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t20_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t20_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t20_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t20_reserve[y][1]=name;
                                                                                                            t20_reserve[y][2]=date;
                                                                                                            t20_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t20_reserve[y][5]=M_no;
                                                                                                            t20_reserve[y][6]=L_no;
                                                                                                            t20_reserve[y][7]=B_name;
                                                                                                            t20_reserve[y][8]=D_name;
                                                                                                            t20_reserve[y][9]=Ba_name;
                                                                                                            t20_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t20_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t20_seat[i7][1]=String.valueOf(Integer.parseInt(t20_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t20_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2926A")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<12;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t21_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t21_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t21_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t21_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t21_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t21_reserve[y][1]=name;
                                                                                                            t21_reserve[y][2]=date;
                                                                                                            t21_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t21_reserve[y][5]=M_no;
                                                                                                            t21_reserve[y][6]=L_no;
                                                                                                            t21_reserve[y][7]=B_name;
                                                                                                            t21_reserve[y][8]=D_name;
                                                                                                            t21_reserve[y][9]=Ba_name;
                                                                                                            t21_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<2;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t21_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t21_seat[i7][1]=String.valueOf(Integer.parseInt(t21_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t21_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2952")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<4;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t22_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t22_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t22_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t22_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t22_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t22_reserve[y][1]=name;
                                                                                                            t22_reserve[y][2]=date;
                                                                                                            t22_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t22_reserve[y][5]=M_no;
                                                                                                            t22_reserve[y][6]=L_no;
                                                                                                            t22_reserve[y][7]=B_name;
                                                                                                            t22_reserve[y][8]=D_name;
                                                                                                            t22_reserve[y][9]=Ba_name;
                                                                                                            t22_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t22_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t22_seat[i7][1]=String.valueOf(Integer.parseInt(t22_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t22_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("2954")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<7;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t23_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t23_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t23_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t23_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t23_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t23_reserve[y][1]=name;
                                                                                                            t23_reserve[y][2]=date;
                                                                                                            t23_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t23_reserve[y][5]=M_no;
                                                                                                            t23_reserve[y][6]=L_no;
                                                                                                            t23_reserve[y][7]=B_name;
                                                                                                            t23_reserve[y][8]=D_name;
                                                                                                            t23_reserve[y][9]=Ba_name;
                                                                                                            t23_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<3;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t23_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t23_seat[i7][1]=String.valueOf(Integer.parseInt(t23_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t23_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }  
                                                                                                        else if(T_no.equals("9020")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<13;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t24_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t24_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t24_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t24_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                           
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t24_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t24_reserve[y][1]=name;
                                                                                                            t24_reserve[y][2]=date;
                                                                                                            t24_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t24_reserve[y][5]=M_no;
                                                                                                            t24_reserve[y][6]=L_no;
                                                                                                            t24_reserve[y][7]=B_name;
                                                                                                            t24_reserve[y][8]=D_name;
                                                                                                            t24_reserve[y][9]=Ba_name;
                                                                                                            t24_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<2;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t24_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t24_seat[i7][1]=String.valueOf(Integer.parseInt(t24_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t24_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if(T_no.equals("9024")==true)
                                                                                                        {
                                                                                                            for(int i4=0;i4<13;i4++)
                                                                                                            {
                                                                                                                if(x7!=0)
                                                                                                                {
                                                                                                                    if(B_name.equals(t25_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x7=Integer.parseInt(t25_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x8!=0)
                                                                                                                {
                                                                                                                    if(D_name.equals(t25_stop[i4][1])==true)
                                                                                                                    {
                                                                                                                        x8=Integer.parseInt(t25_stop[i4][0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if(x7!=0 && x8!=0)
                                                                                                                {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            
                                                                                                            if(x9==1)
                                                                                                            {
                                                                                                                t25_reserve[y][0]=PNR_create.PNR1(y,T_no,pc,x7,x8,date,stat);
                                                                                                            }
                                                                                                            t25_reserve[y][1]=name;
                                                                                                            t25_reserve[y][2]=date;
                                                                                                            t25_reserve[y][3]=add+","+C_name+","+S_name+", Pin-"+P_code;
                                                                                                            t25_reserve[y][5]=M_no;
                                                                                                            t25_reserve[y][6]=L_no;
                                                                                                            t25_reserve[y][7]=B_name;
                                                                                                            t25_reserve[y][8]=D_name;
                                                                                                            t25_reserve[y][9]=Ba_name;
                                                                                                            t25_reserve[y][10]=Cc_no;        
                                                                                                            for(int i7=0;i7<1;i7++)
                                                                                                            {
                                                                                                                if(pc.equals(t25_seat[i7][0])==true)
                                                                                                                {
                                                                                                                    t25_seat[i7][1]=String.valueOf(Integer.parseInt(t25_seat[i7][1])-1);
                                                                                                                }
                                                                                                            }
                                                                                                            if(x9==Integer.parseInt(N_T))
                                                                                                            {
                                                                                                                for(int i8=0;i8<x9;i8++)
                                                                                                                {
                                                                                                                    t25_reserve[y-i8+1][4]=pc;    
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        if(x9==Integer.parseInt(N_T))
                                                                                                        {
                                                                                                            System.out.println("Ur seat(s) has(have) been reserved. Thank u for travelling with Avenged Sevenfold Railways.");
                                                                                                            System.out.println("Total Fare::"+fare.f1(pc,B_name,D_name,T_no)*x9);
                                                                                                            a1=y-x9+1;
                                                                                                            System.out.println("PNR No.:"+PNR_create.PNR1(a1,T_no,pc,x7,x8,date,stat));
                                                                                                            System.out.println("Press <ENTER> to return to the Home page.......");
                                                                                                            choice1=xy.readLine();
                                                                                                            o1.step1();
                                                                                                        }
                                                                                                    }
                                                                                                    else if(choice2.equals("N")==true)
                                                                                                    {
                                                                                                        i2=0;
                                                                                                        continue;
                                                                                                    }   
                                                                                                    else
                                                                                                    {
                                                                                                        System.out.println("Please entr a valid option");
                                                                                                        i3=0;
                                                                                                        continue;
                                                                                                    }
                                                                                                }
                                                                                                
                                                                                            }
                                                                                            else if(choice1.equals("R")==true)
                                                                                            {
                                                                                                x5=reservation4.tes2(N_T);  
                                                                                                i2=0;
                                                                                                continue;
                                                                                            }
                                                                                            else if(choice1.equals("C")==true)
                                                                                            {
                                                                                                for(int i4=1;i4<=1;i4++)
                                                                                                {
                                                                                                    System.out.println("R U sure?[Y/N]");
                                                                                                    choice2=xy.readLine();
                                                                                                    if(choice2.equals("Y")==true)
                                                                                                    {
                                                                                                        o1.step1();
                                                                                                    }
                                                                                                    else if(choice2.equals("N")==true)
                                                                                                    {
                                                                                                        i2=0;
                                                                                                        
                                                                                                    }
                                                                                                    else
                                                                                                    {
                                                                                                        System.out.println("Please entr a valid option");
                                                                                                        i4=0;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                System.out.println("Please entr a valid option.");
                                                                                                i2=0;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    
                                                                                }
                                                                            }
                                                                        }
                                                                            else if(x2.equals("F")==true)
                                                                            {
                                                                                System.out.println("Dis train 1st reaches the destination & then further goes on to reach the Boarding Point. It seems datu hv entrd the Boarding & Destination in wrong order.");
                                                                                i15=0;
                                                                                break;
                                                                            }
                                                                            else if(x3.equals("F")==true)
                                                                            {
                                                                                System.out.println("Dis train does not go through dis station.does not hv dis stoppage. Please entr a valid stoppage name.");
                                                                            }
                                                                        }    
                                                                    }                           
                                                                    else if(B_name.length()==0)
                                                                    {
                                                                        System.out.println("U cannot leave this field empty.");
                                                                        i15=0;
                                                                    }
                                                                    else if(x2.equals("F")==true)
                                                                    {
                                                                        System.out.println("Dis train does not go through dis station/does not have this stoppage. Please entr a valid stoppage name.");
                                                                        i15=0;
                                                                    }
                                                                    
                                                                }
                                                            }
                                                            
                                                        } 
                                                    }
                                                    
                                                }
                                            }
                                            
                                        }
                                    }
                                    
                                }
                            }
        }
    }
    return "";
}
}


