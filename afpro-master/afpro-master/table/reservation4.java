package table;
import java.io.*;
class reservation4 extends reservation3
{
    public static String x1;
    public static String tes2(String N_T)throws IOException
    {
        String choice1,choice2,choice3,choice4,choice5,choice6,test11,test12;
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        for(int i1=1;i1<=1;i1++)
        {
                System.out.print("Do u want to re-entr any field[Y/N]?");
                System.out.println();
                choice1=xy.readLine();
                if(choice1.equals("N")==true)
                {
                }
                else if(choice1.equals("Y")==true)
                {
                    for(int i2=1;i2<=1;i2++)
                    {
                        System.out.print("Please entr the representative option of the field u wanna reset(i.e.entr d section option followed by the field option):");
                        choice2=xy.readLine();
                        System.out.println();
                        test11=choice2.substring(0,1);
                        test12=choice2.substring(1);
                        if(test11.equals("P")==true && choice2.equals("PN")==true)
                        {
                            for(int i3=1;i3<=1;i3++)
                            {
                                System.out.print("Please entr ur full name:");
                                name=xy.readLine();
                                System.out.println();
                                if(name.length()==0)
                                {
                                    System.out.println("Please entr a name. U can't leave this field empty.");
                                    i3=0;
                                }
                            }
                        }
                        else if(test11.equals("C")==true)
                        {
                            if(test12.equals("F")==true)
                            {
                                for(int i3=1;i3<=1;i3++)
                                {
                                    System.out.print("Please entr ur full address(excluding City & State):");       
                                    add=xy.readLine();
                                    System.out.println();
                                    if(add.length()==0)
                                    {
                                        System.out.println("U can't leave this field empty.");
                                        i3=0;
                                    }
                                }
                                
                            }
                            else if(test12.equals("C")==true)
                            {
                                for(int i3=1;i3<=1;i3++)
                                {
                                    System.out.print("Please entr ur City name:");       
                                    C_name=xy.readLine();
                                    System.out.println();
                                    if(C_name.length()==0)
                                    {
                                        System.out.println("U can't leave this field empty.");
                                        i3=0;
                                    }
                                }    
                            }
                            else if(test12.equals("S")==true)
                            {
                                for(int i3=1;i3<=1;i3++)
                                {
                                    System.out.print("Please entr ur State name:");       
                                    S_name=xy.readLine();
                                    System.out.println();
                                    if(S_name.length()==0)
                                    {
                                        System.out.println("U can't leave this field empty.");
                                        i3=0;
                                    }
                                }
                            }
                            else if(test12.equals("P")==true)
                            {
                                for(int i3=1;i3<=1;i3++)
                                {
                                    System.out.println("Please entr the new value of Pin Code:");
                                    P_code=xy.readLine();
                                    if(P_code.length()==0)
                                    {
                                        System.out.println("U can't leave dis field empty.");
                                        i3=0;
                                    }
                                }
                            }
                            else if(test12.equals("M")==true)
                            {
                                for(int i3=1;i3<=1;i3++)
                                {
                                    System.out.print("Please entr ur Mobile No.:");       
                                    M_no=xy.readLine();
                                    System.out.println();
                                }
                            }
                            else if(test12.equals("L")==true)
                            {
                                for(int i3=1;i3<=1;i3++)
                                {
                                    System.out.print("Please entr ur Landline No(along with STD code---<code>-<number>):");       
                                    L_no=xy.readLine();
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Please entr a valid option.");
                                i2=0;
                            }
                        }
                        else if(test11.equals("J")==true)
                        {
                            if(test12.equals("C")==true)
                            {
                                for(int i3=1;i3<=1;i3++)
                                {
                                    System.out.print("Class/Coach:");       
                                    pc=xy.readLine();
                                    System.out.println();
                                    if(S_name.length()==0)
                                    {
                                        System.out.println("U can't leave this field empty.");
                                        i3=0;
                                    }
                                    else
                                    {
                                        if(Integer.parseInt(N_T)>1)
                                        {
                                            System.out.println("Please B warnd dat any change to dis field will b d cause of similar changes in all the oder entries dat are being booked along with you");
                                        }
                                    }
                                }
                            }
                            else if(test12.equals("D")==true)
                            {
                                for(int i3=1;i3<=1;i3++)
                                {
                                    System.out.print("Please entr the new date:");
                                    x1="T";
                                    if(x1.equals("F")==true)
                                    {
                                        System.out.println("D date u hv entrd is either in wrong format or d train doesn't travel on dis date. Please entr a correct value.");
                                        i3=0;
                                        continue;
                                    }
                                }
                            }
                            else if(test12.equals("De")==true)
                            {
                            }
                            else if(test12.equals("B")==true)
                            {
                            }
                            else
                            {
                                System.out.println("Please entr a valid option.");
                                i2=0;
                            }
                        }
                        else if(test11.equals("F")==true)
                        {
                            if(test12.equals("B")==true)
                            {
                                for(int i3=1;i3<=1;i3++)
                                {
                                    System.out.print("Please entr ur bank(V recommend Bank FORT KNOXX):");
                                    Ba_name=xy.readLine();
                                    if(Ba_name.length()==0)
                                    {
                                        System.out.println("Please entr a value. u can't leave dis field blank.");
                                        i3=0;
                                        continue;
                                    }
                                }
                            }
                            else if(test12.equals("D")==true)
                            {
                            }
                        }
                        else
                        {
                            System.out.println("Please entr a valid option.");
                            i2=0;
                        }
                    }
                }
            
            else
            {
                System.out.println("Please entr a valid option.");
                i1=0;
            }
        }
        return null;
    }
}


