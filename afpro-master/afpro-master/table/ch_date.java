package table;
import java.util.Date;
import java.io.*;
import java.text.*;
import java.util.GregorianCalendar;
class ch_date extends t1
{
     public static String check_board_date(String T_no,String stn_name,String exptDate)
     {
        int day=0;  
        String x1=dates.Leap();
        if(T_no.equals("1057")==true)
        {
            for(int i1=0;i1<20;i1++)
            {
                if(stn_name.equals(t1_stop[i1][2]))
                {
                    day=Integer.parseInt(t1_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("1058")==true)
        {
            for(int i1=0;i1<19;i1++)
            {
                if(stn_name.equals(t2_stop[i1][2]))
                {
                    day=Integer.parseInt(t2_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2102")==true)
        {
            for(int i1=0;i1<8;i1++)
            {
                if(stn_name.equals(t3_stop[i1][2]))
                {
                    day=Integer.parseInt(t3_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2137")==true)
        {
            for(int i1=0;i1<13;i1++)
            {
                if(stn_name.equals(t4_stop[i1][2]))
                {
                    day=Integer.parseInt(t4_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2138")==true)
        {
            for(int i1=0;i1<14;i1++)
            {
                if(stn_name.equals(t5_stop[i1][2]))
                {
                    day=Integer.parseInt(t5_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2152")==true)
        {
            for(int i1=0;i1<10;i1++)
            {
                if(stn_name.equals(t6_stop[i1][2]))
                {
                    day=Integer.parseInt(t6_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2262")==true)
        {
            for(int i1=0;i1<2;i1++)
            {
                if(stn_name.equals(t7_stop[i1][2]))
                {
                    day=Integer.parseInt(t7_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2288")==true)
        {
            for(int i1=0;i1<15;i1++)
            {
                if(stn_name.equals(t8_stop[i1][2]))
                {
                    day=Integer.parseInt(t8_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2432")==true)
        {
            for(int i1=0;i1<7;i1++)
            {
                if(stn_name.equals(t9_stop[i1][2]))
                {
                    day=Integer.parseInt(t9_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2449")==true)
        {
            for(int i1=0;i1<4;i1++)
            {
                if(stn_name.equals(t10_stop[i1][2]))
                {
                    day=Integer.parseInt(t10_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2450")==true)
        {
            for(int i1=0;i1<4;i1++)
            {
                if(stn_name.equals(t11_stop[i1][2]))
                {
                    day=Integer.parseInt(t11_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2471")==true)
        {
            for(int i1=0;i1<11;i1++)
            {
                if(stn_name.equals(t12_stop[i1][2]))
                {
                    day=Integer.parseInt(t12_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2472")==true)
        {
            for(int i1=0;i1<10;i1++)
            {
                if(stn_name.equals(t13_stop[i1][2]))
                {
                    day=Integer.parseInt(t13_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2484")==true)
        {
            for(int i1=0;i1<14;i1++)
            {
                if(stn_name.equals(t14_stop[i1][2]))
                {
                    day=Integer.parseInt(t14_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2618")==true)
        {
            for(int i1=0;i1<12;i1++)
            {
                if(stn_name.equals(t15_stop[i1][2]))
                {
                    day=Integer.parseInt(t15_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2860")==true)
        {
            for(int i1=0;i1<10;i1++)
            {
                if(stn_name.equals(t16_stop[i1][2]))
                {
                    day=Integer.parseInt(t16_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2904")==true)
        {
            for(int i1=0;i1<15;i1++)
            {
                if(stn_name.equals(t17_stop[i1][2]))
                {
                    day=Integer.parseInt(t17_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2908")==true)
        {
            for(int i1=0;i1<4;i1++)
            {
                if(stn_name.equals(t18_stop[i1][2]))
                {
                    day=Integer.parseInt(t18_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2910")==true)
        {
            for(int i1=0;i1<5;i1++)
            {
                if(stn_name.equals(t19_stop[i1][2]))
                {
                    day=Integer.parseInt(t19_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2926")==true)
        {
            for(int i1=0;i1<15;i1++)
            {
                if(stn_name.equals(t20_stop[i1][2]))
                {
                    day=Integer.parseInt(t20_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2926A")==true)
        {
            for(int i1=0;i1<12;i1++)
            {
                if(stn_name.equals(t21_stop[i1][2]))
                {
                    day=Integer.parseInt(t21_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2954")==true)
        {
            for(int i1=0;i1<4;i1++)
            {
                if(stn_name.equals(t23_stop[i1][2]))
                {
                    day=Integer.parseInt(t22_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("9020")==true)
        {
            for(int i1=0;i1<7;i1++)
            {
                if(stn_name.equals(t24_stop[i1][2]))
                {
                    day=Integer.parseInt(t23_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("9024")==true)
        {
            for(int i1=0;i1<13;i1++)
            {
                if(stn_name.equals(t25_stop[i1][2]))
                {
                    day=Integer.parseInt(t24_stop[i1][6])-1;
                    break;
                }
            }
        }
        else if(T_no.equals("2952")==true)
        {
            for(int i1=0;i1<13;i1++)
            {
                if(stn_name.equals(t22_stop[i1][2]))
                {
                    day=Integer.parseInt(t25_stop[i1][6])-1;
                    break;
                }
            }
        }
        return te1(T_no,exptDate,day);
     }
    
    public static String te1(String T_no,String exptDate,int day2)
    {
        String stat="F";
        
        try
        {              
            Date now=new Date();
            GregorianCalendar c=new GregorianCalendar();
            SimpleDateFormat o1=new SimpleDateFormat("dd/MM/yyyy");
            Date thatday1=o1.parse(exptDate);
            GregorianCalendar thatday2=new GregorianCalendar();
            thatday2.setTime(thatday1);
            int exptday=thatday2.get(GregorianCalendar.DAY_OF_WEEK);
            int exptd1=1+day2,exptd2=2+day2,exptd3=3+day2,exptd4=4+day2,exptd5=5+day2,exptd6=6+day2,exptd7=7+day2;
            if(exptd5>7)
            {
                exptd5=7-exptd5;
            }
            if(exptd6>7)
            {
                exptd6=7-exptd6;
            }
            if(exptd7>7)
            {
                exptd7=7-exptd7;
            }
            if(T_no.equals("1057") || T_no.equals("1058") || T_no.equals("2137") || T_no.equals("2138") || T_no.equals("2618") || T_no.equals("2860") || T_no.equals("2904") || T_no.equals("2926A") || T_no.equals("2952") || T_no.equals("2954") || T_no.equals("9020"))
            {
                stat="T";
            }
            else if(T_no.equals("2102"))
            {
                if(exptday==exptd2 || exptday==exptd4 || exptd1==exptday || exptd5==exptday)
                {
                    stat="T";
                }
            }
            else if(T_no.equals("2152"))
            {
                if(exptday==exptd6 || exptday==exptd7)
                {
                    stat="T";
                }
            }
            else if(T_no.equals("2262"))
            {
                if(exptday==exptd2 || exptday==exptd6)
                {
                    stat="T";
                }
            }
            else if(T_no.equals("2288"))
            {
                if(exptday==exptd2)
                {
                    stat="T";
                }
            }
            else if(T_no.equals("2432"))
            {
                if(exptday==exptd4 || exptday==exptd3 || exptday==exptd1)
                {
                    stat="T";
                }    
            }
            else if(T_no.equals("2449"))
            {
                if(exptday==exptd4 || exptday==exptd3)
                {
                    stat="T";
                }    
            }
            else if(T_no.equals("2450"))
            {
                if(exptday==exptd2 || exptday==exptd7)
                {
                    stat="T";
                }    
            }
            else if(T_no.equals("2471"))
            {
                if(exptday==exptd5 || exptday==exptd6 || exptday==exptd2 || exptday==exptd1)
                {
                    stat="T";
                }    
            }
            else if(T_no.equals("2472"))
            {
                if(exptday==exptd3 || exptday==exptd6 || exptday==exptd4 || exptday==exptd7)
                {
                    stat="T";
                }       
            }
            else if(T_no.equals("2484"))
            {
                if(exptday==exptd1)
                {
                    stat="T";
                }    
            }
            else if(T_no.equals("2908"))
            {
                if(exptday==exptd5)
                {
                    stat="T";
                }    
            }
            else if(T_no.equals("2910"))
            {
                if(exptday==exptd1 || exptday==exptd6)
                {
                    stat="T";
                }            
            }
            else if(T_no.equals("9024"))
            {
                if(exptday==exptd4 || exptday==exptd6 || exptday==exptd5 || exptday==exptd1 || exptday==exptd7)
                {
                    stat="T";
                }               
            }
        }
        catch(ParseException e)
        {
            e.printStackTrace();
        }
        return stat;
    }
}