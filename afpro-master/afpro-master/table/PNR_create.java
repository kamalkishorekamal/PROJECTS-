package table;
class PNR_create
{
    public static String PNR1(int Sl_No,String T_no1,String coach,int B_no,int D_no,String DateofTravel,String stat)
    {
        int a1=0;
        String B_no1,Sl_No1,D_no1,T_no=T_no1,DoT1=DateofTravel.substring(0,2),DoT2=DateofTravel.substring(3,5),DoT3=DateofTravel.substring(6);
        if(stat.equals("C")==true)
        {
            a1=1;
        }
        if(B_no<10)
        {
            B_no1="0"+B_no;
        }
        else
        {
            B_no1=""+B_no;
        }
        if(D_no<10)
        {
            D_no1="0"+D_no;
        }
        else
        {
            D_no1=""+D_no;
        }
        if(Sl_No<10)
        {
            Sl_No1="0"+Sl_No;
        }
        else
        {
            Sl_No1=""+Sl_No;
        }
        if(T_no1.equals("2926A")==false)
        {
            T_no="0"+T_no;
        }
        if(Integer.parseInt(DoT1)<10)
        {
            DoT1="0"+DoT1;
        }
        if(Integer.parseInt(DoT2)<10)
        {
            DoT2="0"+DoT2;
        }
        
        String PNR=Sl_No1+T_no+coach+B_no1+D_no1+DoT1+DoT2+DoT3+a1;
        return PNR;
    } 
}



