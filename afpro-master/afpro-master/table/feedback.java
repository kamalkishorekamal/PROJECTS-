package table;
import java.io.*;
class feedback
{
   public static void step1F()throws IOException
   {
       mainprojekt o1=new mainprojekt();
       BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("\fPlease entr ur feedback/suggestions b'low. We assure you dat v do not take feedback/suggestion only for d sake of taking it.");
       String choice1=xy.readLine();
       System.out.println("V r obliged 2 u 4 ur suggestions/feedback. Thank U.");
       System.out.println("Press <ENTER> to conttinue.....");
       String choice2=xy.readLine();
       o1.step1();
   }
}
