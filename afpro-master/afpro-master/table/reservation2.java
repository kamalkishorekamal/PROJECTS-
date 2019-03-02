package table;
import java.io.*;
class reservation2 extends reservation1
{
  public static String N_T;     
  public static String test1()throws IOException
  {
      BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
      int y=x;
      String choice1,choice2,expt;
      for(int i8=1;i8<=1;i8++)
      {
          System.out.print("Class/Coach:");
          pc=xy.readLine();
          System.out.println();
          if(pc.equals(null)==true)
          {
              System.out.println("U cannot leave this field empty.");
              i8=0;
              continue;
          }
          x4="T";
          if(x4.equals("F")==true)
          {
              System.out.println("Dis type of coach is not present on this train. Please re entr this field.");  
              i8=0;
              continue;
          }
          
              for(int i1=1;i1<=1;i1++)
              {
                  System.out.print("Entr no. of people whose reservations are 2 b done 2gether(max. is 5):");
                  N_T=xy.readLine();
                  System.out.println();
                  if(N_T.equals(null)==true)
                  {
                      System.out.println("Please entr a value.");
                      i1=0;
                      continue;
                    }
                    else if(N_T.equals("1")==false && N_T.equals("2")==false && N_T.equals("3")==false && N_T.equals("4")==false && N_T.equals("5")==false)
                    {
                        System.out.println("Please entr a valid input.");
                        i1=0;
                        continue;
                    }
                    for(int i2=1;i2<=Integer.parseInt(N_T);i2++)
                    {
                        expt=reservation3.r1(i2);
                    }
                    x=y;
                }
            }
        
         return "";
    }
}

