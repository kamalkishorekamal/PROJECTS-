package table;
class can2
{
    public static BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    public static mainprojekt o1=new mainprojekt();
    public static void C1()throws IOException
    {
        int x1=0,x3=0,x5=0,x6=0,x9=0;
        mainprojekt o1=new mainprojekt();
        String PNR,T_no,choice1,choice2,stat,choice3,choice4,choice5,x2,x4,x7,x8,stat1="F",stat2="F";
        x7=new String();
        x8=new String();
        int m1=0,m2=0;
a:      for(int i1=1;i1<=1;i1++)
        {
            System.out.print("\fEnter PNR No.:");
            PNR=xy.readLine();
            System.out.println();
            if(PNR==null)
            {
                System.out.println("Please entr a value. U can't leave dis field empty.");
                continue;
            }
            else if(PNR.length()!=22)
            {
                System.out.println("\fD value u entrd is not a PNR. What do you wanna do?");
                for(int i4=1;i4<=1;i4++)
                {
                    System.out.println("[R]e entr");
                    System.out.println("[H]ome");
                    choice4=xy.readLine();
                    if(choice4==null)
                    {
                        System.out.println("Please entr a value.");
                        i4=0;
                        continue;
                    }
                    else if(choice4.equals("R")==true)
                    {
                        i1=0;
                        m2=1;
                        i4=2;
                        break;
                    }
                    else if(choice4.equals("H")==true)
                    {
                        o1.step1();    
                    }
                }
            }
            if(m2==1)
            {
                continue;
            }
            T_no=PNR.substring(2,7);
            stat=PNR.substring(21);
            for(int i4=0;i4<36;i4++)
                {
                    if(PNR.equals(t1_reserve[i4][0]))
                    {
                        stat1="T";
                        x1=i4;
                        break;
                    }
                    else if(PNR.equals(t1_waiting[i4][0]))
                    {
                        stat2="T";
                        break;
                        
                    }
                }
                for(int i5=0;i5<36;i5++)
                {
                    if(PNR.equals(t2_reserve[i5][0]))
                    {
                        stat1="T";
                        x1=i5;
                        break;
                    }
                    else if(PNR.equals(t2_waiting[i5][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i6=0;i6<42;i6++)
                {
                    if(PNR.equals(t3_reserve[i6][0]))
                    {
                        stat1="T";
                        x1=i6;
                        break;
                    }
                    else if(PNR.equals(t3_waiting[i6][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i7=0;i7<42;i7++)
                {
                    if(PNR.equals(t4_reserve[i7][0]))
                    {
                        stat1="T";
                        x1=i7;
                        break;
                    }
                    else if(PNR.equals(t4_waiting[i7][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i8=0;i8<42;i8++)
                {
                    if(PNR.equals(t5_reserve[i8][0]))
                    {
                        stat1="T";
                        x1=i8;
                        break;
                    }
                    else if(PNR.equals(t5_waiting[i8][0]))
                    {
                        stat1="W";
                        x1=i8;
                        break;
                    }
                }
                for(int i9=0;i9<42;i9++)
                {
                    if(PNR.equals(t6_reserve[i9][0]))
                    {
                        stat1="T";
                        x1=i9;
                        break;
                    }
                    else if(PNR.equals(t6_waiting[i9][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i10=0;i10<42;i10++)
                {
                    if(PNR.equals(t7_reserve[i10][0]))
                    {
                        stat1="T";
                        x1=i10;
                        break;
                    }
                    else if(PNR.equals(t7_waiting[i10][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i11=0;i11<42;i11++)
                {
                    if(PNR.equals(t8_reserve[i11][0]))
                    {
                        stat1="T";
                        x1=i11;
                        break;
                    }
                    else if(PNR.equals(t8_waiting[i11][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i12=0;i12<26;i12++)
                {
                    if(PNR.equals(t9_reserve[i12][0]))
                    {
                        stat1="T";
                        x1=i12;
                        break;
                    }
                    else if(PNR.equals(t9_waiting[i12][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i13=0;i13<28;i13++)
                {
                    if(PNR.equals(t10_reserve[i13][0]))
                    {
                        stat1="T";
                        x1=i13;
                        break;
                    }
                    else if(PNR.equals(t10_waiting[i13][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i14=0;i14<42;i14++)
                {
                    if(PNR.equals(t11_reserve[i14][0]))
                    {
                        stat1="T";
                        x1=i14;
                        break;
                    }
                    else if(PNR.equals(t11_waiting[i14][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i15=0;i15<36;i15++)
                {
                    if(PNR.equals(t12_reserve[i15][0]))
                    {
                        stat1="T";
                        x1=i15;
                        break;
                    }
                    else if(PNR.equals(t12_waiting[i15][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i16=0;i16<36;i16++)
                {
                    if(PNR.equals(t13_reserve[i16][0]))
                    {
                        stat1="T";
                        x1=i16;
                        break;
                    }
                    else if(PNR.equals(t13_waiting[i16][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i17=0;i17<36;i17++)
                {
                    if(PNR.equals(t14_reserve[i17][0]))
                    {
                        stat1="T";
                        x1=i17;
                        break;
                    }
                    else if(PNR.equals(t14_waiting[i17][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i18=0;i18<36;i18++)
                {
                    if(PNR.equals(t15_reserve[i18][0]))
                    {
                        stat1="T";
                        x1=i18;
                        break;
                    }
                    else if(PNR.equals(t15_waiting[i18][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i19=0;i19<36;i19++)
                {
                    if(PNR.equals(t16_reserve[i19][0]))
                    {
                        stat1="T";
                        x1=i19;
                        break;
                    }
                    else if(PNR.equals(t16_waiting[i19][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i20=0;i20<36;i20++)
                {
                    if(PNR.equals(t17_reserve[i20][0]))
                    {
                        stat1="T";
                        x1=i20;
                        break;
                    }
                    else if(PNR.equals(t17_waiting[i20][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i21=0;i21<42;i21++)
                {
                    if(PNR.equals(t18_reserve[i21][0]))
                    {
                        stat1="T";
                        x1=i21;
                        break;
                    }
                    else if(PNR.equals(t18_waiting[i21][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i22=0;i22<17;i22++)
                {
                    if(PNR.equals(t19_reserve[i22][0]))
                    {
                        stat1="T";
                        x1=i22;
                        break;
                    }
                    else if(PNR.equals(t19_waiting[i22][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i23=0;i23<28;i23++)
                {
                    if(PNR.equals(t20_reserve[i23][0]))
                    {
                        stat1="T";
                        x1=i23;
                        break;
                    }
                    else if(PNR.equals(t20_waiting[i23][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i24=0;i24<26;i24++)
                {
                    if(PNR.equals(t21_reserve[i24][0]))
                    {
                        stat1="T";
                        x1=i24;
                        break;
                    }
                    else if(PNR.equals(t21_waiting[i24][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i25=0;i25<28;i25++)
                {
                    if(PNR.equals(t22_reserve[i25][0]))
                    {
                        stat1="T";
                        x1=i25;
                        break;
                    }
                    else if(PNR.equals(t22_waiting[i25][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i26=0;i26<28;i26++)
                {
                    if(PNR.equals(t23_reserve[i26][0]))
                    {
                        stat1="T";
                        x1=i26;
                        break;
                    }
                    else if(PNR.equals(t23_waiting[i26][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i27=0;i27<20;i27++)
                {
                    if(PNR.equals(t24_reserve[i27][0]))
                    {
                        stat1="T";
                        x1=i27;
                        break;
                    }
                    else if(PNR.equals(t24_waiting[i27][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
                for(int i28=0;i28<14;i28++)
                {
                    if(PNR.equals(t25_reserve[i28][0]))
                    {
                        stat1="T";
                        x1=i28;
                        break;
                    }
                    else if(PNR.equals(t25_waiting[i28][0]))
                    {
                        stat2="T";
                        break;
                    }
                }
            if(stat1.equals("F")==true && stat2.equals("F")==true)
            {
                m1=C2();
            }
            if(m1==1)
            {
                i1=0;
                continue;
            }
            for(int i2=1;i2<=1;i2++)
            {
                System.out.println("Do u want to continue[Y/N]? V warn u dat once u press the Yes[Y] button, there's no returning back from that dark & foreboding abyss in which u may either be trapped for ever or u may find a path that leads u on\n in ur life. In the former, ur soul shall not find solace ever & shall roam around even aftr ur death trying to hack in our server databank to get the passowrd to our financial accounts to get back the money \nwhich u lost(b assured. It won't really find solace 4 evr as our server databank is protected by programs by non oder than the gr8 Afzalul Hauqe alias goluhaque as called in d net world.\n He is ably supported by in dis work by gr8 frnds of his like ATX,Anurag,Mukesh,Rishav,Sourav etc.). D explanation of d latter is given by the fact dat every occurence in anyone's life is just a milestone on the road called destiny or fate dat leads a person to his death or MOKSHA from his \nbirth. Remembr dis always visitors-->life is but an empty dream & History Teaches us dat it  teaches us nothing. ");
                choice1=xy.readLine();
                System.out.println();
                if(choice1.equals("Y")==true)
                {
                    
                    if(T_no.equals("01057")==true)
                    {
                        for(int i3=x1+1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t1_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t1_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("01058")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t2_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t2_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02102")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t3_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t3_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02137")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t4_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t4_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02138")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t5_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t5_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02152")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t6_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t6_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02262")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t7_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t7_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02288")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t8_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t8_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02432")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t9_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t9_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02449")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t10_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t10_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02450")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t11_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t11_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02471")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t12_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t12_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02472")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t13_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t13_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02484")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t14_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t14_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02618")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t15_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t15_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02860")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t16_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t16_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02904")==true)
                    {
                        for(int i3=x1+1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t17_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t17_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02908")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t18_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t18_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02910")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t19_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t19_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02926")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t20_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t20_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("2926A")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t21_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t21_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02952")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t22_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t22_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("02954")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t23_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t23_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("09020")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t24_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t24_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("09024")==true)
                    {
                        for(int i3=x1;i3<36;i3++)
                        {
                            if(stat1.equals("T"))
                            {
                                if(t25_reserve[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                            else if(stat2.equals("T"))
                            {
                                if(t25_waiting[i3][0]!=null)
                                {
                                    x3=i3;
                                }
                            }
                        }
                    }
                    if(T_no.equals("01057"))
                    {
                       
                            
                            for(int i5=0;i5<11;i5++)
                            {
                                
                                if(stat1.equals("T")==true)
                                {
                                    t1_reserve[x1][i5]=null;
                                    
                                }
                                else if(stat2.equals("T"))
                                {
                                    t1_waiting[x1][i5]=null;
                                    
                                }
                            }
                       
                       
                    }
                    else if(T_no.equals("01058"))
                    {
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t2_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t2_waiting[x1][i5]=null;
                                }
                            }
                       
                    }
                    else if(T_no.equals("02102"))
                    {
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t3_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t3_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("02137"))
                    {
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t4_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t4_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("02138"))
                    {
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t5_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t5_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("02152"))
                    {
                       
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t6_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t6_waiting[x1][i5]=null;
                                }
                            }
                       
                    }
                    else if(T_no.equals("02262"))
                    {
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t7_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t7_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("02288"))
                    {
                       
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t8_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t8_waiting[x1][i5]=null;
                                }
                            }
                       
                    }
                    else if(T_no.equals("02432"))
                    {
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t9_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t9_waiting[x1][i5]=null;
                                }
                            }
                       
                    }
                    else if(T_no.equals("02449"))
                    {
                       
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t10_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t10_waiting[x1][i5]=null;
                                }
                            }
                       
                    }
                    else if(T_no.equals("02450"))
                    {
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t11_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t11_waiting[x1][i5]=null;
                                }
                            }
                      
                    }
                    else if(T_no.equals("02471"))
                    {
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t12_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t12_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("02472"))
                    {
                       
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t13_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t13_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("02484"))
                    {
                        
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t14_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t14_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("02618"))
                    {
                        
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t15_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t15_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("02860"))
                    {
                        
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t16_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t16_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("02904"))
                    {
                        
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t17_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t17_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("02908"))
                    {
                        
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t18_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t18_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("02910"))
                    {
                        
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t19_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t19_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("02926"))
                    {
                        
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t20_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t20_waiting[x1][i5]=null;
                                }
                            
                        }
                    }
                    else if(T_no.equals("2926A"))
                    {
                        
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t21_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t21_waiting[x1][i5]=null;
                                }
                            
                        }
                    }
                    else if(T_no.equals("02952"))
                    {
                        
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t22_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t22_waiting[x1][i5]=null;
                                }
                          
                        }
                    }
                    else if(T_no.equals("02954"))
                    {
                        
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t23_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t23_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("09020"))
                    {
                        
                        
                            for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t24_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t24_waiting[x1][i5]=null;
                                }
                            }
                        
                    }
                    else if(T_no.equals("09024"))
                    {
                        
                        
                           for(int i5=0;i5<11;i5++)
                            {
                                if(stat1.equals("T"))
                                {
                                    t25_reserve[x1][i5]=null;
                                }
                                else if(stat2.equals("T"))
                                {
                                    t25_waiting[x1][i5]=null;
                                }
                            }
                        }
                    
                }   
                else if(choice1.equals("N")==true)
                {
                    o1.step1();
                }
                else
                {
                    System.out.println("OMG! All dat philosphical s*#! above didn't even affect you? V r sorry but as a punishment u'll hv 2 go through it again n again unless u entr a valid option.");
                }
               
            }
        }
        System.out.println("Ur seat has been cancelled.");
        System.out.println("V hope dat u r not daunted by the philosphical lesson v taught u above & will allow us 2 please u once more. Thanking u, this is Avenged Sevenfold Railways Team(!).");
        System.out.println();
        System.out.println("Press <ENTER> to go to home....");
        String choice10=xy.readLine();
        o1.step1();
    }
    public static int C2()throws IOException
    {
        String choice3;
        int m1=0;
        System.out.println("\fDere's no such PNR.");
        for(int i4=1;i4<=1;i4++)
        {
            System.out.println("[R]e entr");
            System.out.println("[H]ome");
            choice3=xy.readLine();
            if(choice3.equals("R")==true)
            {
                m1=1;
            }
            else if(choice3.equals("H")==true)
            {
                o1.step1();
            }
            else if(choice3==null)
            {
                System.out.println("Please entr an option. It can't possibly b nothing.");
                i4=0;
            }
            else
            {
                System.out.println("Please entr a valid option");
                i4=0;
            }
        }
        return m1;
    }
}
