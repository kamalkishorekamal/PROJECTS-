package table;
import java.io.*;
class help
{
    public static void H()throws IOException
    {
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello dere! Welcome to this COMPUTERISED RAILWAY SYSTEM. Here r the things u can do with this SYSTEM-:");
        System.out.println("RESERVATION             -->                 Reserve ur ticket");
        System.out.println("CANCELLATION            -->                 Cancel an already reserved ticket ");
        System.out.println("ENQUIRY                 -->                 Get a list of all trains showing their Time-Table, Schedule & stoppages of various trains Get PNR status, Coach Codes,Station Codes & names, Seat Availability of different trains etc.");
        System.out.println("FUN & GAMES             -->                 Here u can spend ur time entrtaining urself aftr a long boring day. Play the highly intersting game--TRAIN DRIVER.");
        System.out.println("HELP                    -->                 U r presently in the HELP section. So, v r not takin' d pains of explaining what occcurs in it. This statement is based on the assumption that u know English.");
        System.out.println("DONATE                  -->                 Here u can donate money for the improvememt of this site.");
        System.out.println("HALL OF FAME            -->                 Here u will find names of people who helped build this project & those who have donated a good amount of money in the former's pockets.");
        System.out.println("SUGGESTIONS/FEEDBACK    -->                 Here u can give ur suggestions and ur feedback on the system so that v can improve it. ");
        System.out.println("QUIT                    -->                 By choosing dis option, u bid a final adieu to Avemged Sevenfold Railways website.");  
        System.out.println();
        System.out.println();
        System.out.println("Press <ENTER> to go back.....");
        String choice1=xy.readLine();
        mainprojekt o1=new mainprojekt();
        o1.step1();
    }
}
