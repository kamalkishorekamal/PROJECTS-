package table;
class check_board_dest extends t1 
{
    public static String ch_b_de(String T_no,String B_name,String D_name)
    {
        int x1=0,x2=0;
        String stat="F",stat1="F",stat2="F";
        if(T_no.equals("1057"))
        {
            for(int i1=0;i1<20;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t1_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t1_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }
            }
        }
        else if(T_no.equals("1058"))
        {
            for(int i1=0;i1<19;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t2_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t2_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2102"))
        {
            for(int i1=0;i1<9;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t3_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t3_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2137"))
        {
            for(int i1=0;i1<14;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t4_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t4_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }   
            }
        }
        else if(T_no.equals("2138"))
        {
            for(int i1=0;i1<15;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t5_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t5_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2152"))
        {
            for(int i1=0;i1<10;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t6_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t6_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }   
            }
        }
        else if(T_no.equals("2262"))
        {
            for(int i1=0;i1<2;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t7_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t7_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }  
            }
        }
        else if(T_no.equals("2288"))
        {
            for(int i1=0;i1<15;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t8_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t8_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }  
            }
        }
        else if(T_no.equals("2432"))
        {
            for(int i1=0;i1<7;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t9_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t9_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2449"))
        {
            for(int i1=0;i1<4;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t10_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t10_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2450"))
        {
            for(int i1=0;i1<4;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t11_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t11_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2471"))
        {
            for(int i1=0;i1<11;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t12_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t12_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2472"))
        {
            for(int i1=0;i1<10;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t13_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t13_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2484"))
        {
            for(int i1=0;i1<14;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t14_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t14_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }  
            }
        }
        else if(T_no.equals("2618"))
        {
            for(int i1=0;i1<12;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t15_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t15_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }   
            }
        }
        else if(T_no.equals("2860"))
        {
            for(int i1=0;i1<10;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t16_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t16_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }   
            }
        }
        else if(T_no.equals("2904"))
        {
            for(int i1=0;i1<15;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t17_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t17_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2908"))
        {
            for(int i1=0;i1<4;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t18_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t18_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2910"))
        {
            for(int i1=0;i1<5;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t19_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t19_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2926"))
        {
            for(int i1=0;i1<15;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t20_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t20_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2926A"))
        {
            for(int i1=0;i1<12;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t21_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t21_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2952"))
        {
            for(int i1=0;i1<4;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t22_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t22_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }    
            }
        }
        else if(T_no.equals("2954"))
        {
            for(int i1=0;i1<7;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t23_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t23_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }  
            }
        }
        else if(T_no.equals("9020"))
        {
            for(int i1=0;i1<13;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t24_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t24_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }   
            }
        }
        else if(T_no.equals("9024"))
        {
            for(int i1=0;i1<13;i1++)
            {
                if(stat1.equals("F"))
                {
                    if(B_name.equals(t25_stop[i1][2]))
                    {   
                        x1=i1+1;
                        stat1="T";
                    }
                }
                if(stat2.equals("F"))
                {
                    if(D_name.equals(t25_stop[i1][2]))
                    {
                        x2=i1+1;
                        stat2="T";
                    }
                }
                if(stat1.equals("T") && stat2.equals("T"))
                {
                    if(x1<x2)
                    {
                        stat="T";
                    }
                    break;
                }   
            }
        }
        return stat;
    }
  
    public static String ch_stn(String T_no,String stn_name)
    {
        String stat="F";
        if(T_no.equals("1057")==true)
        {
            for(int i1=0;i1<20;i1++)
            {
                if(stn_name.equals(t1_stop[i1][2]))
                {
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
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
                    stat="T";
                    break;
                }
            }
        }
        return stat;
    }
}