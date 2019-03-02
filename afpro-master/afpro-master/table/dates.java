package table;
import java.text.SimpleDateFormat;
import java.util.Date;
public class dates
{
    public static Date now=new Date();
    public static SimpleDateFormat sdfDate=new SimpleDateFormat("dd/MM/yyyy");
    public static String d=sdfDate.format(now);
    public static String universal[]=new String[31];
    public static String Leap()
    {
        int Leap;
        if(Integer.parseInt(d.substring(6))%4==0)
        {
            Leap=1;
        }
        else
        {
            Leap=0;
        }
        String a1=date1(Leap);
        return "";
    }
    public static String date1(int Leap2)
    {
        int d1=Integer.parseInt(d.substring(0,2));
        int d2=Integer.parseInt(d.substring(3,5));
        int d3=Integer.parseInt(d.substring(6)); 
        int c1=0;
        int d4,d5,d6=0;
        if(d2==2)                                                   
        {
            d6=28+Leap2;
        }    
        else if(d2%2==1 || d2==8)
        {
            d6=31;
        }
        else if(d2%2==0 && d2!=8)
        {
            d6=30;
        }
        for(int i1=d1;i1<=d6;i1++)
        {
            if(c1==31)
            {
                break;
            }
            c1=c1+1;
            universal[i1-d1]=i1+"/"+d2+"/"+d3;
        }
        if(d2==12)
        {
            d4=1;
            d5=d3+1;
        }
        else    
        {
            d4=d2+1;
            d5=d3;
        } 
        if(c1<31)
        {
            int c2=c1;
            for(int i5=1;i5<=31-c2;i5++)
            {       
                 if(i5<10)
                 {
                     if(d4<10)
                     {
                        universal[c1]="0"+i5+"/"+"0"+d4+"/"+d5;
                     }
                     else
                     {
                         universal[c1]="0"+i5+"/"+d4+"/"+d5;
                     }
                 }
                 else
                 {
                    if(d4<10)
                     {
                        universal[c1]=i5+"/"+"0"+d4+"/"+d5;
                     }
                     else
                     {
                         universal[c1]=i5+"/"+d4+"/"+d5;
                     }    
                 }
                 c1=c1+1;
            }
        }
        return "";
    }
}
