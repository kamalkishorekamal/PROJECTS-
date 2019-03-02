package table;
import java.io.*;
class reservation1 extends mainprojekt
{
    public static int c1=0,y=0,x7=0,x8=0;
    public static String name,T_no,pc,choice1,choice2,choice3,choice4,choice5,F_name,M_name,L_name,Cc_no,Ba_name,B_name,D_name,add,C_name,S_name,M_no,L_no,T_name=null,P_code,x1,x2,x3,x4,x5,x6,date,stat;
    public static void mad()throws IOException
    {
        int z=0;
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        mainprojekt o1=new mainprojekt();
        String c18,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17;
        System.out.println("\f");
        for(int i6=1;i6<=1;i6++)
        {
            System.out.println();
            System.out.print("Train No.:");
            T_no=xy.readLine();
            System.out.println();
            for(int i5=0;i5<25;i5++)
            {
                if(T_no.equals(tab_main[i5][0])==true)
                {
                    c1=1;
                    x=i5;
                    break;
                }
            }
            if(c1!=1)
            {
                System.out.println("No train with Train No. "+T_no+" is covered undr dis projekt. V reiterate our request to consult d time table as well as the train list in the enquirires section b'fore applying for a reservation. U hv 2 re-entr a valid train no.");
                i6=0;
                continue;
            }
            System.out.println();
            x6=reservation2.test1();
        }
    }
}
    

