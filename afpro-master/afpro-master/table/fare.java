package table;
class fare extends t1
{
    public static int f1(String coach,String B_name,String D_name,String T_no)
    {
        int m1=0,m2=0,d1=0,x1=0,fare=0;
        if(T_no.equals("2262"))
        {
            x1=ch_coach(coach);
            fare=x1+2500+600;
        }
        else if(T_no.equals("2432"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t9_stop[i1][3]))
                {
                    m1=Integer.parseInt(t9_stop[i1][6]);
                }
                if(D_name.equals(t9_stop[i1][3]))
                {
                    m2=Integer.parseInt(t9_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+600;
        }
        else if(T_no.equals("1057"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t1_stop[i1][3]))
                {
                    m1=Integer.parseInt(t1_stop[i1][6]);
                }
                if(D_name.equals(t9_stop[i1][3]))
                {
                    m2=Integer.parseInt(t1_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("1058"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t2_stop[i1][3]))
                {
                    m1=Integer.parseInt(t2_stop[i1][6]);
                }
                if(D_name.equals(t2_stop[i1][3]))
                {
                    m2=Integer.parseInt(t2_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2102"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t3_stop[i1][3]))
                {
                    m1=Integer.parseInt(t3_stop[i1][6]);
                }
                if(D_name.equals(t3_stop[i1][3]))
                {
                    m2=Integer.parseInt(t3_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2137"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t4_stop[i1][3]))
                {
                    m1=Integer.parseInt(t4_stop[i1][6]);
                }
                if(D_name.equals(t4_stop[i1][3]))
                {
                    m2=Integer.parseInt(t4_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2138"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t5_stop[i1][3]))
                {
                    m1=Integer.parseInt(t5_stop[i1][6]);
                }
                if(D_name.equals(t5_stop[i1][3]))
                {
                    m2=Integer.parseInt(t5_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2152"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t6_stop[i1][3]))
                {
                    m1=Integer.parseInt(t6_stop[i1][6]);
                }
                if(D_name.equals(t6_stop[i1][3]))
                {
                    m2=Integer.parseInt(t6_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("9020"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t24_stop[i1][3]))
                {
                    m1=Integer.parseInt(t24_stop[i1][6]);
                }
                if(D_name.equals(t24_stop[i1][3]))
                {
                    m2=Integer.parseInt(t24_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2288"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t8_stop[i1][3]))
                {
                    m1=Integer.parseInt(t8_stop[i1][6]);
                }
                if(D_name.equals(t8_stop[i1][3]))
                {
                    m2=Integer.parseInt(t8_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("9024"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t25_stop[i1][3]))
                {
                    m1=Integer.parseInt(t25_stop[i1][6]);
                }
                if(D_name.equals(t25_stop[i1][3]))
                {
                    m2=Integer.parseInt(t25_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2449"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t10_stop[i1][3]))
                {
                    m1=Integer.parseInt(t10_stop[i1][6]);
                }
                if(D_name.equals(t10_stop[i1][3]))
                {
                    m2=Integer.parseInt(t10_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2450"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t11_stop[i1][3]))
                {
                    m1=Integer.parseInt(t11_stop[i1][6]);
                }
                if(D_name.equals(t11_stop[i1][3]))
                {
                    m2=Integer.parseInt(t11_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2471"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t12_stop[i1][3]))
                {
                    m1=Integer.parseInt(t12_stop[i1][6]);
                }
                if(D_name.equals(t12_stop[i1][3]))
                {
                    m2=Integer.parseInt(t12_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2472"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t13_stop[i1][3]))
                {
                    m1=Integer.parseInt(t13_stop[i1][6]);
                }
                if(D_name.equals(t13_stop[i1][3]))
                {
                    m2=Integer.parseInt(t13_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2484"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t14_stop[i1][3]))
                {
                    m1=Integer.parseInt(t14_stop[i1][6]);
                }
                if(D_name.equals(t14_stop[i1][3]))
                {
                    m2=Integer.parseInt(t14_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2618"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t15_stop[i1][3]))
                {
                    m1=Integer.parseInt(t15_stop[i1][6]);
                }
                if(D_name.equals(t15_stop[i1][3]))
                {
                    m2=Integer.parseInt(t15_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2860"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t16_stop[i1][3]))
                {
                    m1=Integer.parseInt(t16_stop[i1][6]);
                }
                if(D_name.equals(t16_stop[i1][3]))
                {
                    m2=Integer.parseInt(t16_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2904"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t17_stop[i1][3]))
                {
                    m1=Integer.parseInt(t17_stop[i1][6]);
                }
                if(D_name.equals(t17_stop[i1][3]))
                {
                    m2=Integer.parseInt(t17_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2908"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t18_stop[i1][3]))
                {
                    m1=Integer.parseInt(t18_stop[i1][6]);
                }
                if(D_name.equals(t18_stop[i1][3]))
                {
                    m2=Integer.parseInt(t18_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2910"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t19_stop[i1][3]))
                {
                    m1=Integer.parseInt(t19_stop[i1][6]);
                }
                if(D_name.equals(t19_stop[i1][3]))
                {
                    m2=Integer.parseInt(t19_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2926"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t20_stop[i1][3]))
                {
                    m1=Integer.parseInt(t20_stop[i1][6]);
                }
                if(D_name.equals(t20_stop[i1][3]))
                {
                    m2=Integer.parseInt(t20_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2926A"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t21_stop[i1][3]))
                {
                    m1=Integer.parseInt(t21_stop[i1][6]);
                }
                if(D_name.equals(t21_stop[i1][3]))
                {
                    m2=Integer.parseInt(t21_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+200;
        }
        else if(T_no.equals("2952"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t22_stop[i1][3]))
                {
                    m1=Integer.parseInt(t22_stop[i1][6]);
                }
                if(D_name.equals(t22_stop[i1][3]))
                {
                    m2=Integer.parseInt(t22_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+600;
        }
        else if(T_no.equals("2954"))
        {
            x1=ch_coach(coach);
            for(int i1=0;i1<7;i1++)
            {
                if(B_name.equals(t22_stop[i1][3]))
                {
                    m1=Integer.parseInt(t22_stop[i1][6]);
                }
                if(D_name.equals(t22_stop[i1][3]))
                {
                    m2=Integer.parseInt(t22_stop[i1][6]);
                }
            }
            d1=cal_dist(m2,m1);
            fare=d1+x1+600;
        }
        return fare;
    }
    public static int ch_coach(String coach)
    {
        int a1=0;
        if(coach.equals("A1"))
        {
            a1=2000;    
        }
        else if(coach.equals("A2"))
        {
            a1=1800;    
        }
        else if(coach.equals("A3"))
        {
            a1=1500;    
        }
        else if(coach.equals("CC"))
        {
            a1=1400;    
        }
        if(coach.equals("SL"))
        {
            a1=800;    
        }
        else if(coach.equals("2S"))
        {
            a1=200;    
        }
        else if(coach.equals("3E"))
        {
            a1=100;    
        }
        return a1;
    }
    public static int cal_dist(int m2,int m1)
    {
        int money$=0;
        if(m2-m1<=4000 && m2-m1>3500)
        {
            money$=4000;
        }
        else if(m2-m1<=3500 && m2-m1>3000)
        {
            money$=3500;
        }
        else if(m2-m1<=3000 && m2-m1>2500)
        {
            money$=3000;
        }
        else if(m2-m1<=2500 && m2-m1>2000)
        {
            money$=2500;
        }
        else if(m2-m1<=2000 && m2-m1>1500)
        {
            money$=2000;
        }
        else if(m2-m1<=1500 && m2-m1>1000)
        {
            money$=1500;
        }
        else if(m2-m1<=1000 && m2-m1>500)
        {
            money$=1000;
        }
        else if(m2-m1<=500)
        {
            money$=100;
        }
        return money$;
    }
}
