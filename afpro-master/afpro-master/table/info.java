package table;
import java.io.*;
public class info
{
    public static void step1I()throws IOException
    {
        System.out.println("\f");
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        String choice1,choice2,choice3,choice4,choice5,choice6,choice7;
        mainprojekt o1=new mainprojekt();
        System.out.println();
        System.out.println();
        for(int i1=1;i1<=1;i1++)
        {
            System.out.println("\f[A]bout Us & Discalimer");
            System.out.println("[R]ules & Information");
            System.out.println("[H]ome");
            choice1=xy.readLine();
            if(choice1.equals("A")==true)
            {
                System.out.println("\fThis software is just a projekt made by 2 students of Std.X, St.Xavier's School, B.S.City , Jharkhand, India for their ICSE Board assesment.  The data is purely fictious & is not related to any true train");
                System.out.println("in any way. Any similarity in the data presented in the projekt to real dat is purely coincidential. Please contact the authors/developers of this software for further enquirires concerning the nature of ");
                System.out.println("this projekt & other related enquiries. The responsibility of all legal proceedings, if undertaken, by any person lies with the school itself. The authors/developers are in no way responsible & answerable ");
                System.out.println("to any legal court. It may also be noted that any data in this software should not b used in any other database for any commercial or private usage. Legal Proceedings shall be initiated & undertaken against");
                System.out.println("those who do the same.");
                System.out.println();
                System.out.println("Press <ENTER> to return...");
                xy.readLine();
                i1=0;
                continue;
            }
            else if(choice1.equals("R")==true)
            {
                rules();
            }
            else if(choice1.equals("H")==true)
            {
                o1.step1();
            }
            else
            {
                System.out.println("Please entr a valid option.");
                i1=0;
            }
        }
    }
    
    public static void rules()throws IOException
    {
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        mainprojekt o2=new mainprojekt();
        String choice1,choice2,choice3,choice4,choice5,choice6,choice7;
        for(int i1=1;i1<=1;i1++)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("\f[1T]ypes of Accomodation");
            System.out.println("[C]hange in name of a confirmed Passenger");
            System.out.println("[Ch]arging of a Senior Citizen");
            System.out.println("[G]eneral Concession Rules");
            System.out.println("[L]uggage Rules");
            System.out.println("[1R]efund Rules");
            System.out.println("[2R]eservation Rules");
            System.out.println("[2T]atkal Scheme");
            System.out.println("[A]ll of the above");
            System.out.println("[B]ack");
            System.out.println("[H]ome");
            choice1=xy.readLine();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();            
            if(choice1.equals("1T")==true)
            {
                r1T();
            }
            else if(choice1.equals("C")==true)
            {
                rC();
            }
            else if(choice1.equals("Ch")==true)
            {
                rCh();                        
            }
            else if(choice1.equals("G")==true)
            {
                rG();
            }
            else if(choice1.equals("L")==true)
            {
                rL();
            }
            else if(choice1.equals("1R")==true)
            {
                r1R();
            }
            else if(choice1.equals("2R")==true)
            {
                r2R();
            }
            else if(choice1.equals("2T")==true)
            {
                r1T();    
            }
            else if(choice1.equals("A")==true)
            {
                System.out.println("\f----------------------------------------------------------------------------------------------TYPES OF ACCOMODATION---------------------------------------------------------------");
                r1T();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------CHANGE IN NAME OF A CONFIRMED PASSENGER-----------------------------------------------------------------------");
                rC();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("--------------------------------------------------------------------------------------------CHARGES LEVIED ON SENIOR CITIZENS---------------------------------------------------------------");
                rCh();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("---------------------------------------------------------------------------------------------GENERAL CONCESSION RULES---------------------------------------------------------------");
                rG();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("---------------------------------------------------------------------------------------------------LUGGAGE RULES---------------------------------------------------------------------");
                rL();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("----------------------------------------------------------------------------------------------------REFUND RULES---------------------------------------------------------------");
                r1R();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------------------RESERVATION RULES---------------------------------------------------------------");
                r2R();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------------------------TATKAL SCHEME---------------------------------------------------------------");
                r2T();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                i1=0;
                System.out.println("Press <ENTER> to return....");
                xy.readLine();
                continue;
           }
           else if(choice1.equals("B")==true)
           {
               step1I();
           }
           else if(choice1.equals("H")==true)
           {
               o2.step1();
           }
           else
           {
               System.out.println("Please entr a valid option.");
               i1=0;
               continue;
            }
        }
    }
    public static void r1T()
    {
        System.out.println("\fThe following class-accommodation combinations are created for by the system:"); 
        System.out.println("1.)A.C. Berths for night and seats for day. Both berths and seats are considered identical with respect to fare and accommodations.");
        System.out.println("2.)AC 2-tier sleeper. Berths for night and seats for day are considered identical with respect to fare. The extent of accommodation for night journey and day journey (i.e. sitting and sleeping accommodation) ");
        System.out.println("   generally remains same.");
        System.out.println("3.)I Class. Berths and seats are considered identical with respect to fare but during the day, number of seats are greater than the number of berths during the night.");                                                                                                                                                                                            
        System.out.println("4.)AC 3-Tier");                                                                               
        System.out.println("5.)AC chair car");                                                                  
        System.out.println("6.)Sleeper class berths");
        System.out.println("7.)II Class sitting (Day coaches)");
    }
    public static void rC()
    {
         System.out.println("\f1.  Save as otherwise, a berth or a seat reserved in the name of a person shall be used only by the person and shall not be transferable to any other person.");
                System.out.println("2.  Chief Reservation Supervisor of important stations are authorised by Railway Administration to permit the change of name of a passenger having a seat or berth reserved in his name in the following ");
                System.out.println("    circumstances namely:- ");
                System.out.println("    a.Where the passenger is a Government Servant, proceeding on duty and appropriate authority, makes a request in writing 24 hours before the scheduled departure of trains ");
                System.out.println("    b.Where the passenger makes a request in writing 24 hours before the scheduled departure of the train that the reservation made in his name may be transferred to another member of his family, meaning, Father, Mother, Brother, Sister, Son, Daughter, Husband and Wife.");
                System.out.println("    c.Where the passengers are students of a recognised educational institution and the Head of the institution makes a request in writing 48 hours before the scheduled departure of the train, that the reservation made in the name of any student be transferred to any other student of the same institute. ");
                System.out.println("    d.Where the passengers are members of a marriage party and any person deemed to be Head of such party makes a request in writing 48 hours before the scheduled departure of the train that the reservation made in the name of any member of the marriage party be transferred to any other person. ");
                System.out.println("    e.Where the passengers are a group of cadets of National Cadet Corps and any officer who is the head of the group, makes a request in writing at least 24 hours before the departure of the train that the reservation made in the name of any cadet be transferred to any other cadet.");
                System.out.println("    f.Such request will be granted only once. Regarding item no. (c), (d) and (e), such request for change in excess of 10% of the total strength of group shall not be granted.");
    }
    public static void r2T()
    {
        System.out.println("\f-->As announced by Hon'ble Minister of Railways while presenting Railway Budget 2009-10 in the parliament on 03-07-2009, it has been decided to reduce Tatkal Charges as given below:-");
                System.out.println("Class of Travel Minimum Tatkal Charges (in Rs.) Maximum Tatkal Charges (in Rs.)");
                System.out.println("Second (sitting)    10.00   15.00");
                System.out.println("Sleeper 75.00   150.00");
                System.out.println("AC Chair Car    75.00   150.00");
                System.out.println("AC 3 Tier   200.00  300.00");
                System.out.println("AC 2 Tier   200.00  300.00");
                System.out.println("Executive   200.00  300.00");
                System.out.println("-->The above charges will be levied uniformly both in peak period & non-peak periods.");
                System.out.println("-->Tatkal tickets will be issued for actual distance of travel, instead of end-to-end, subject to the distance restriction applicable to the train. The same Tatkal berth/seat may be booked in multiple legs till preparation of charts. At the time of preparation of charts, unutilized portion may be released to the General RAC/Waiting list passengers. ");
                System.out.println("-->Tatkal facility will be introduced in Executive Class of Shatabadi Express trains also, by earmarking 10% of the accommodation available i.e. 5 seats per coach. ");
                System.out.println("-->Tatkal booking opens at  8 AM on Two days in advance  actual date of journey excluding date of journey w.e.f. of 01-08-2009, e.g. for train leaving on 6th, Tatkal Booking will Commence at 8 AM on 4th.");
                System.out.println("-->No identity proof is required to be produced by the passenger seeking reservation under tatkal scheme neither at the time of booking nor during the journey.");
                System.out.println("-->Instead of full coach being presently nominated as Tatkal Coach, there will be Tatkal quota in each train in 2A, 3A, AC Chair Car, Sleeper and 2S (Second Sitting) classes as under:-");
                System.out.println("Classes                               No. of berths to be earmarked in trains with average occupancy level of Tatkal Quota");
                System.out.println("Less than 80%                                                                More than 80%");
                System.out.println("2 AC                                        4 Berths Per Coach                                           10 Berths Per Coach");
                System.out.println("3 AC                             6 Berths Per Coach                     16 Berths Per Coach");
                System.out.println("AC Chair Car                          6 Seats  Per Coach                        16 Seats  Per Coach");
                System.out.println("SL                      10% of the accommodation or one coach whichever is less     30% of the accommodation");
                System.out.println("Reserved Second Sitting (2S)                            10% of the accommodation");
                System.out.println();        
                System.out.println();     
                System.out.println("-->However, powers for earmarking of Tatkal accommodation in different classes are delegated to Zonal Railways who take a decision in this regard keeping in view the utilization pattern in that class during the previous financial year as well as availability of accommodation. The accommodation so earmarked, however, in no case exceed the maximum Tatkal accommodation permissible to be earmarked as per extant instructions.");
                System.out.println("-->In those trains and classes where average utilization of Tatkal accommodation during six months period i,e April to September is 80% and above, tatkal charges applicable during peak period will be charged through out the year i.e for both peak and non peak period."); 
                System.out.println("-->There will be no separate Tatkal train defined. The unutilised Tatkal quota will get released to waitlisted passengers.");
                System.out.println("-->The facility of change of name is not permitted on the bookings made under Tatkal scheme.");
                System.out.println("-->For the purpose of granting refunds & issuing TDRs for W/L, the time limit will be the same as applicable for refund of normal tickets. ");
                System.out.println();
                System.out.println();
                System.out.println("REFUNDS   ");
                System.out.println();      
                System.out.println("A flat refund of 25% of total fare charged on the ticket, excluding tatkal charge is granted on cancellation of tatkal ticket, which is presented for cancellation upto 24 hours before the scheduled departure of the train. However, full refund of fare and tatkal charges will be granted on the tickets booked under Tatkal scheme in the following circumstances :- ");
                System.out.println("-->If the train is delayed by more than 3 hours at the journey originating point of the passenger & not the boarding point if the passenger's journey originating point and boarding point are different.");
                System.out.println("-->If the train is to run on a diverted route and passenger is not willing to travel.");
                System.out.println("-->If the train is to run on diverted route and boarding station or the destination or both the stations are not on the diverted route.");
                System.out.println("-->In case of non attachment of coach in which Tatkal accommodation has been earmarked and the passenger has not been provided  accommodation in the same class.");
                System.out.println("-->If the party has been accommodated in lower class and does not want to travel. In case the party travels in lower class, the passenger will be given refund of difference of fare and also the difference of Tatkal charges, if any.");
    }
    public static void rCh()
    {
        System.out.println("\fNo. 360-P/Sr. Citizen/2001The issue regarding charging of senior citizens travelling on concession, who do not produce age proof during journey, has been examined. MINISTRY OF RAILWAYS HAVE DECIDED THAT IN SUCH CASES, ONLY THE DIFFERENCE OF CONCESSIONAL FARE PAID AND NON-CONCESSIONAL FARE PAYABLE SHALL BE CHARGED. PENALTY WILL NOT BE CHARGED IN SUCH CASES.  Necessary instructions have been issued to all concerned immediately.");
                System.out.println("GENERAL INFORMATION");
                System.out.println("");     
                System.out.println("If you wish to go on a pilgrimage or sightseeing trip to many destinations, Indian Railways provides the facility of booking Circular Journey Tickets. These tickets offer you unique travel flexibility, as they are issued for all journeys (other than regular routes), which begin and complete at the same station. Circular journey Tickets can be purchased for all classes of travel. A maximum of eight break journeys will be admissible on these tickets. Standard Circular Journey Tickets are also offered by Zonal Railways. These cover popular destinations for the Convenience of tourists. The details of route, fare etc., for these tickets can be obtained from nominated stations in each Zonal Railway. You can purchase these tickets if any one of the standard routes suits your convenience. Otherwise you can inform the Zonal Railways about your itinerary and Circular Journey Tickets can be drawn up to suit your requirements.");
                System.out.println("Advantages of Booking a Circular Journey Ticket");
                System.out.println("Circular Journey Tickets give you the benefit of telescopic rates, which are considerably lower than regular point to point fare. With these tickets, you not only save time but also the inconvenience of booking ticket at each leg of the journey.");
                System.out.println();   
                System.out.println();
                System.out.println("BOOKING PROCEDURE OF CICULAR JOURNEY TICKET");
                System.out.println();   
                System.out.println("1.  Once your itinerary is finalized, you can approach the Divisional Commercial Manager of  the Division of certain major stations to which the journey commencing station belongs. The Divisional Commercial Manager or the station authorities will then calculate the cost of the tickets based on your itinerary. He will also inform the Station Manager of the same in a prescribed format.");
                System.out.println("2.  You can purchase Circular Journey Tickets by presenting this form at the Booking Office of the station where you propose to start your journey. After purchasing the Circular Journey Ticket, you must approach the Reservation Office to reserve your accommodation for various laps of your journey. You will then be issued reserved journey ticket for the journey.");
                System.out.println("3.  No Standard Circular Journey Tickets are issued by Southern Railways, only non-standard Circular Journey Tickets as per the itenary given by the passengers are issued by the Southern Railways. A Circular Journey Ticket is charged for as two single journeys, the length of each single journey being taken as half of the total distance.");
                System.out.println("4.  30% concession is granted on the cost of the Circular Journey Tickets for Senior Citizens when travelling a minimum distance of 1000 kms.");
    }
    public static void r2R()
    {
        System.out.println("\fImportant - for Senior Citizens :-  From 1st September 2001 onwards, concession to senior citizens through PRS (Passenger Reservation System) shall be granted only on demand and not by default as at present. The demand for concession shall be made on Reservation Requisition form in the case of reserved tickets. In the case of tickets issued to senior citizens on concession, during journey the concerned passengers are instructed to carry some documentary proof showing their age or date of birth, issued by any Government  Institution/Agency/Local Body. like Identity card, Driving License, Passport, Educational certificate, certificate from Local Bodies like Panchayat/Corporation/Municipality, or any other authentic and recognised document. This documentary proof of age should be produced if demanded by some Railway official during the journey. ");
                System.out.println();
                System.out.println();    
                System.out.println("General Conditions :- The Railway Administration reserves seats, berths, compartments, or carriage in accordance with the rules and conditions published in the Coaching Tariff. A passenger seeking reservation of berth or seats should purchase tickets from the Railway Reservation Offices/Authorised Travel Agency only.");
                System.out.println("Advance reservations are made generally up to 60 days in advance for all classes and all trains. The period of advance reservation (ARP) is exclusive of the day of departure of the train.");
                System.out.println("At intermediate stations where the train arrives on the following day, such reservations can be done more than 60 days in advance of date of journey from the intermediate station. ARP is in relation to the date of journey from train originating station. In case of some Inter-city day trains, the ARP is less.");
                System.out.println("An individual can book only up to six passengers on one requisition form provided all passengers are for the same destination and for the same train.");
                System.out.println("Only one requisition form is accepted from a person at one time. However, if onward/return journey are involved, 2 or 3 forms can be accepted for the same passengers.");
                System.out.println("Accommodation will not be reserved without purchase of necessary journey ticket. No reservation of accommodation will be made on provisional basis.");
                System.out.println("When berths are reserved for passengers, the intention is to provide sleeping accommodation between 9 PM to 6 AM. During 6 AM to 9 PM, the passengers concerned, if required make room for other passengers in compartment up to its carrying capacity.");
                System.out.println("Passengers are requested to quote PNR number which is printed on each tickets on the top left hand side for any enquiry or complaint relating to reservations.");
                System.out.println("Reservation ticket issued by the computerised system against pre-bought ticket must be accompanied by the journey tickets on train. Similarly journey cum reservation tickets bearing zero amount are not valid for journey unless accompanied by the valid authority to travel authorising issue of such tickets.");
                System.out.println("Allotment of accommodation is done by the computer as per pre-defined logic. Efforts are made to provide compact accommodation to persons booked under the same PNR on first come first served basis.");
                System.out.println("The Railway Administration will endeavour to provide reserved accommodation but does not guarantee the same and will admit no claim for compensation for inconvenience, loss or extra expense due to such accommodation including carriages, not being provided or reserved carriage not been attached to a particular train. The supply of any particular type of carriage or the provision of a particular berth and seat is also not guaranteed.");
                System.out.println("Departure time printed on the ticket is indicative for the guidance of the passengers. Passengers must ascertain correct timings from the Railway station on the day of journey. Such tickets are printed up to 60 days in advance. Any changes in timing after the issue of ticket can not be advised.");
                System.out.println("While every endeavour is made to advise changes in Time Table by due publicity, Railway Administration shall not be liable for any claim/compensation if a passenger misses a train on this account.");
                System.out.println();
                System.out.println();
                System.out.println("TRANSFER/RESALE OF TICKETS PROHIBITED :- Under Section 142 of the Railways ACT, journey tickets including any half of a return ticket and season ticket are not transferable.");
                System.out.println("If any person not being a Railway Servant or an agent authorised in this behalf :");
                System.out.println("a.  sells or attempts to sell any ticket or any half of a return ticket, or ");
                System.out.println("b.  parts or attempts to part with the possession of a ticket against which reservation of a seat or a berth has been made or any half of a return ticket or season ticket. He shall be punishable under the Railways Act.");
                System.out.println("In addition, if the purchaser or holder of transferred ticket travels or attempts to travel therewith, he shall forfeit the ticket which he so purchased or obtained and shall be deemed to be travelling without a proper ticket.");
                System.out.println();
                System.out.println();
                System.out.println("PAYMENT THROUGH CREDIT CARDS :- Payment through credit cards for issue of reserved tickets is accepted on some nominated counters of computerised locations in India. In Northern Railway these counters are at IRCA, Reservation Office, New Delhi, Delhi Jn., Sarojini Nagar, Kirti Nagar and Karkadooma and the computerised reservation office, Lucknow . All Master Cards and Visa Cards are accepted. ");
                System.out.println();
                System.out.println();
                System.out.println("RESERVATION FEE AND SUPPLEMENTARY CHARGES ON SUPERFAST TRAINS :- The reservation fee and supplementary charge on superfast train are as under :- ");
                System.out.println();  
                System.out.println();
                System.out.println();        
                System.out.println("CLASS                                                                                 RESERVATION FEE                          SUPPLEMENTARY CHARGES FOR SUPERFAST TRAINS");
                System.out.println();
                System.out.println("AC Ist                                                                                             Rs. 35                                                                            Rs. 50");
                System.out.println("AC 2 Tier                                                                   Rs. 25                      Rs. 30");
                System.out.println("Ist  (Mail/Express)                     Rs. 25                      Rs. 30");
                System.out.println("Ist  (Ordinary)                     Rs. 25                          --");
                System.out.println("AC - 3 Tier                     Rs. 25                      Rs. 30");
                System.out.println("AC Chair Car                        Rs. 25                      Rs. 30");
                System.out.println("Sleeper (Mail/Express)                  Rs. 20                      Rs. 20");
                System.out.println("Second Sitting (Mail/Express)               Rs. 15                      Rs. 10");
                System.out.println("Sleeper (Ordinary)                      Rs. 20                          --");
                System.out.println("Second Sitting (Ordinary)                   Rs. 15                                                  --");
                System.out.println();   
                System.out.println();
                System.out.println();
                System.out.println("REVISION OF RESERVATION  FEE:");
                System.out.println("--> The cluster stations definition is now suspended.");
                System.out.println("--> The system of issuing BPTs(Blank Paper Tickets) is now disabled.");
                System.out.println();
                System.out.println("1. For travel by all trains except Rajdhani,Shatabdi and Jan Shatabdi Express trains,the revised reservation fee,leviable on tickets booked for journeys originating from other then the ticket booking station is shown below.");
                System.out.println();
                System.out.println(); 
                System.out.println("CLASS                                   EXISTING RESERVATION FEE                           ENHANCED RESERVATION FEE FOR JOURNEYS ");
                System.out.println("ORIGINATING FROM A STATION OTHER THAN ONE FROM WHERE TICKET HAS BEEN ISSUED");
                System.out.println("AC Ist                              Rs. 35                      Rs. 50");
                System.out.println("AC 2 Tier                                           Rs. 25                                                                     Rs. 40");
                System.out.println("AC - 3 Tier                         Rs. 25                       Rs. 40");
                System.out.println("First                               Rs. 25                                  Rs. 40");
                System.out.println("AC Chair Car                                                                                  Rs. 25                                    Rs. 40");
                System.out.println("Sleeper                                  Rs. 20                              Rs.30");
                System.out.println("Second Sitting                           Rs. 15                                                             Rs.25");
                System.out.println();  
                System.out.println();
                System.out.println("2.  For   travel   by  Rajdhani,Shatabdi and Jan Shatabdi Express trains,also ,the increase in reservation Fee will be applicable on ticket issued for journeys originating from other than the ticket booking stations. The additional reservation fee for such tickets,to be addedd additional in the basic fares shown in Passenger Fare Table,is shown below     :   ");
                System.out.println("CLASS                               IN ADDITION TO TOTAL CHARGEABLE FEES");
                System.out.println("                                                                                 Rajdhani Express trains");
                System.out.println("AC First                                                    Rs. 20");
                System.out.println("AC 2-Tier                                                   Rs. 20");
                System.out.println("AC 3-Tier                                                   Rs. 20");
                System.out.println("AC Chair Car                                                Rs. 20");
                System.out.println("Shatabdi Express trains");
                System.out.println("Executive                                               Rs. 20");
                System.out.println("AC Chair Car                                                Rs. 20");
                System.out.println("Jan Shatabdi Express trains");
                System.out.println("Second                                                             Rs. 15");
                System.out.println("AC.Chair Car                                                Rs. 20");
                System.out.println();
                System.out.println();
                System.out.println("-->Military Officers travelling on free warrants, officers and staff of the Railway and P&T department travelling on Railway passes and MPs travelling on Identity Card are exempted from payment of reservation fee. ");
                System.out.println("-->The supplementary charge is not recoverable from MPs travelling on Identity Card, tourist holding Indrail passes, Railway Staff travelling on duty passes, privilege passes and PTOs. ");
                System.out.println("-->A passenger found travelling in a Super Fast Train without paying supplementary charge is liable to pay a penalty of Rs. 50/- in addition to the supplementary charge. However, passenger holding through ticket duly fulfilling distance restriction and boarding a superfast train at an intermediate station as per the ticket, is required to pay only the supplementary charge.");
                System.out.println();   
                System.out.println();
                System.out.println("INDICATION OF BERTH/SEAT NUMBERS :- Passengers with confirmed reservation will be allotted berths at the time of booking and the coach and berth numbers are indicated on the ticket itself, except in case of first class ACC and first class coaches. The compartment/cabin/coupe numbers for first ACC and first class are allotted at the time of chart preparation.");
                System.out.println();
                System.out.println();
                System.out.println("RESERVATION AGAINST CANCELLATION (R.A.C.) :- The passengers whose names figure under R.A.C., are provided reserved sitting accommodation initially and are likely to get berths becoming vacant due to last minutes cancellation of reservation of passengers not turning up in time before the departure of the train.");
                System.out.println();
                System.out.println(); 
                System.out.println("WHEN RESERVATION WORK CEASES :- The requests for reservation at the reservation counters are accepted up to 4 hours before the scheduled departure of the train, after which, the reservation will be done at the current counters at the stations  up to one hour before the scheduled departure of the train and thereafter by the Ticket Collector/Conductor on the platform, if vacant berths/seats are available.");
                System.out.println();
                System.out.println();  
                System.out.println("RESERVATION FROM INTERMEDIATE STATIONS :- (a) Requisition for reservation of berths in all classes from intermediate stations not having computerised reservation facility are entertained on purchase of journey tickets only. Such requisition should be given to the Station Master of the Intermediate station 72 hours before the scheduled departure of the train from the station. Such application shall be sent to the nearest computerised reservation office at the earliest.");
                System.out.println();
                System.out.println("CANCELLATION OF RESERVATION DUE TO LATE ARRIVAL OF PASSENGER :- If a passenger, for whom a berth or seat has been reserved, does not turn up up to 10 minutes before the scheduled departure of the train, the Railway Administration may cancel the accommodation reserved for him and allot it to the passenger on the RAC list/Waiting list accordingly on priority.");
                System.out.println();
                System.out.println("CHANGE OF BOARDING POINT :- If a passenger desires to occupy reserved accommodation from any station enroute, he would be permitted to entrain at any intermediate station he chooses irrespective of the distance from the starting station subject to the following conditions :-");
                System.out.println("i.  A specific request must be made in writing at the station from where the ticket is purchased and reservation made atleast 24 hours before the scheduled departure of the train from the starting station. ");
                System.out.println("ii. The Railway Administration reserves the right to use such accommodation from the originating station up to the station at which the passenger is due to entrain. ");
                System.out.println("iii.No refund will be permissible for the portion of journey not performed by the passenger.");
                System.out.println();
                System.out.println();
    }
    public static void rG()
    {
        System.out.println("\fThe detailed rules, procedures, entitlement, purposes, etc for grant of concession are contained under different serial numbers in IRCA Coaching Tariff, Part I (Vol. II) which can be purchased from the General Secretary, I.R.C.A., Chelmsford Road, New Delhi.  For any complaints or clarifications, the General Manager or the Chief Commercial Superintendent of the concerned Zonal Railway Administration should be approached.  The important general rules for concession, in reference to the above mentioned Tariff, are as under: ");
                System.out.println(" 1.> a.) All concessional fares shall be calculated on the basis of fares for Mail/Express trains irrespective of the type of train, i.e. Mail,Express or Passenger, by which the passenger travels.");   
                System.out.println("     b.) Concession shall not be granted for any journey the cost of which is borne by the Central or State Government or a local authority or a Statutory body or a Corporation or a Government Undertaking or a University.");
                System.out.println("         However, the students participating in the tournaments held or recognized by the schools or universities will be eligible to the concession.");
                System.out.println("     c.) Concession shall be admissible only in respect of basic fares.  No concession is admissible in respect of other charges, viz. superfast surcharge, reservation fee, etc. However, in cases where concession has been allowed in Rajdhani/Shatabdi/Jan Shatabdi trains, the concession shall be admissible in the total charges (including catering) of these trains."); 
                System.out.println("     d.) The concessions will be admissible subject to the minimum distance of 300 Kms, except in the case of students, blind, orthopaedically handicapped/paraplegic persons, TB and Cancer patients, Kidney patients, non-infectious leprosy patients, mentally retarded persons, thalassamia major disease patients, Heart, Hemophilia Patients, War Widows, Widows of IPKF, Widows of martyrs of Operation Vijay 1999 (Kargil), Widows of defence personnel killed in action against terrorists & extremists, National Awardee Teachers, Shram Awardee Industrial Workers, Widows of Policemen killed in action against terrorists & extremists, Senior Citizens, Allopathic Doctors, parents accompanying the National Bravery Awardee child, Police Medal Awardees, Dronacharya Awardees coaches, sportsmen, Unemployed Youths for attending interviews for jobs, and their escorts, wherever admissible under the rules, in             whose case the above mentioned distance restriction will not apply. However, the distance restrictions otherwise applicable to general public for travel in each individual train will apply for issue of concessional tickets also.");
                System.out.println(" 2.> Only one type of concession is admissible at a time at the choice of passenger and no person is allowed two or more concessions simultaneously.");
                System.out.println(" 3.> a.) Break of journey en-route shall not be allowed on a concession ticket for a journey for a specific purpose viz. a student travelling            to/from    an examination Centre, a Cancer patient travelling to/from a hospital, a professor travelling to/from a Conference, etc. It is allowed only where a break of journey is a natural event."); 
                System.out.println("     b.) Passengers breaking their journey are required to have their ticket endorsed from the Station Master where journey is broken."); 
                System.out.println("     c.) Passengers terminating journey en route, must surrender their ticket at the station where the journey is terminated.  Refund for the untravelled portion on such tickets will not be allowed."); 
                System.out.println(" 4.> Except Senior Citizens, concession on Indian Railway will be admissible on production of the requisite certificate from the concerned Person/Organization in India and the documents issued by persons/organizations in other countries shall not be valid for the purpose of concession."); 
                System.out.println(" 5.> In the case of Senior citizens, no proof of age is required at the time of purchasing tickets.  Concession tickets are issued on demand made through the option in reservation form.  However, they are required to carry some documentary proof showing their age or date of birth and produce it if demanded by some Railway Official during the journey.  Any document issued by any Government Institution/ Agency/Local Body, like Identity Card, Ration Card, Driving Licence, Pass Port, Educational certificate, certificate from Panchayat/Corporation/ Municipality, or any other authentic & recognised document, is acceptable for this purpose. The Pass Port issued by foreign countries is also valid."); 
                System.out.println(" 6.> The holder of a concession ticket is not permitted to change the ticket to a higher class even by paying the difference of actual fares.              However, the categories of persons eligible for concession in first class (and not in AC 2-tier) can purchase tickets for AC 2-tier sleeper also on payment of the first class concessional fare plus difference of actual fares of AC 2-tier sleeper & first class.");
                System.out.println(" 7.> Save as otherwise specifically provided, concession is not admissible in season tickets, circular journey tickets and prestigious trains like Rajdhani Express, Shatabdi Express, etc. which have separate all inclusive fare structure. Concession is admissible to any one in Garib Rath Express trains."); 
                System.out.println(" 8.> In case where concessional Single/Return Journey Tickets or Season tickets or Circular journey tickets are to be issued for two or more persons, the concessional fare shall be calculated separately for each person. ");
                System.out.println(" 9.> All the concessions are to be granted across the counters at Stations/ Reservation Offices/Booking Offices only.  If some person enters the             train without ticket or without proper ticket or extends journey on concession ticket or changes the concession to higher class, etc., he shall not be granted any concession in train, even if he is otherwise eligible for it under the rules.");
    }
    public static void rL()
    {
        System.out.println("\fLuggage which is not fully and legibly addressed in English or Hindi will not  be accepted for booking and carriage by train. Luggage which is not securely packed will not be accepted for booking and carriage unless the sender or his authorized agent executes a forwarding note and record there in such defects or improper packing. Luggage which is required to travel by the same train with the owner should be presented at the luggage office of the booking station at least 30 minutes before the advertised departure time of the train . Passengers booking their accommodation in advance are permitted to  book their luggage in advance at the same time. Bulky surcharge is applicable only on package weighing above 100 kgs or exceeding  1m*1m*0.7m  in outside measurement. Package s exceeding any one of the dimension specified will be treated as bulky even though the actual weight is less than 100 kgs  on volu-metric basis. However if one of the dimension is exceeded by 10% of the prescribed measurement  but weight is within 100 kgs., on volumetric basis, it will not be treated as bulky. Bulky surcharge will be levied at double the normal rate.");
                System.out.println("Offensive articles, explosive, dangerous, inflammable articles and empty gas cylinders, dead poultry, and game, acids and other corrosive substance are not permitted to be booked as luggage.");
                System.out.println("Trunks, suitcase and boxes having outside measurement of 100 cms. x 60 cms x 25 cms (length x breadth x height)  will be allowed to be carried in the passenger compartments as personal luggage. If the trunks, suitcase, and boxes, which in outside measurement exceed any one of the dimension, such articles are required to be booked and carried in the brake van  and not in the passengers' compartment . Maximum size of the trunks/suitcase than can be carried in the AC-3 tire and AC chair Car compartment is 55 cmsx45 cms x 22.5 cms.");
                System.out.println("Oxygen cylinder with its supporting stand with patients under medical certificate can be permitted to be carried in all classes. Free allowance of luggage will be granted  on oxygen  cylinder and its supporting stand.");
                System.out.println("Merchandized items are not permitted for booking and carriage in the compartment as personal luggage.");
                System.out.println("Luggage of larger dimension are to be carried only by brake van . The minimum charge for luggage is Rs.30. ");
                System.out.println("As per instructions, there is no restriction on carriage of luggage in brake van of passenger trains as far as quantity and type (personal or merchandise) of luggage offered for booking is concerned .However, the excess luggage in owner's charge beyond the free allowance is charged at 1.5 times the rates under scale-L.");
                System.out.println("// Each passenger is allowed a free allowance upto which he can carry luggage with him in the compartment, free of cost. The free allowance varies for different classes of travel. Children aged 5 and below 12 years are allowed half of the free allowance subject to the maximum of 50 Kgs. You are also permitted a marginal allowance. there is a maximum ceiling on the luggage which can be carried inside the compartment for each class. These are indicated in the table below : -//");
                System.out.println("The following maximum limit free allowance, marginal allowance are admissible for carriage of luggage in the compartment :-");
                System.out.println();                                
                System.out.println("CLASS           FREE ALLOWANCE               MARGINAL ALLOWANCE         MAXIMUM QUANTITY PERMIITED");
                System.out.println("                                    ( including free allowance)");
                System.out.println();                     
                System.out.println("AC First Class             70 Kgs                      15 Kgs                      150 Kgs");
                System.out.println("AC 2-Tier sleeper/First class       50 Kgs                     10 Kgs                      100 Kgs.");
                System.out.println("AC 3-tier sleeper/AC chair car     40 Kgs                      10 Kgs                                   40 Kgs.");
                System.out.println("Sleeper class              40 Kgs                      10 Kgs                                           80 Kgs.");
                System.out.println("Second class               35 Kgs.                     10 Kgs                         70 Kgs.");
                System.out.println();
                System.out.println("The maximum limit includes free allowance.");
                System.out.println(); 
                System.out.println("Passenger are allowed to book and carry excess luggage beyond the free allowance with them in the compartment up to the maximum limit as per class mentioned above on payment of charge at 1.5 times of luggage rate.");
                System.out.println("When a passenger is detected either en route or at the destination with un booked  or partially booked luggage weighing more than the free allowance, the excess un booked weight exceeding free allowance of luggage is charged at six times the luggage scale rate instead of 6 times of scale  -R as earlier. However, if  un booked or partially booked luggage is detected more than the free allowance of then luggage but within the marginal allowance, it is charged at 1.5 times the luggage scale rate . when a passenger is detected either en route or at destination with un booked or partially booked luggage weighing more than the maximum limit permitted the excess weight exceeding free allowance of luggage is charged at six times of the luggage scale rate subject to a minimum of Rs.50/-.");
                System.out.println("Luggage beyond the above quantity can be booked in advance and carried in brake Van.");
                System.out.println("If your luggage marginally exceeds the free allowance, you will be charged at the normal luggage rates applicable to your class of travel. Above marginal allowance penalty will be charged ,If detected . Make sure to book your excess luggage in the luggage office, pay the prescribed charges and get your tickets endorsed by cross-referencing the luggage ticket details, before commencing your journey. Free allowance is not admissible for articles such as scooters, cycles etc.");
                System.out.println();
                System.out.println();
                System.out.println("LUGGAGE GETS STOLEN EN ROUTE -");
                System.out.println();      
                System.out.println("IN case of theft of luggage, robbery / dacoity in running trains, you can approach train conductors/coach attendant/guards or GRP escort. They will give you the FIR Forms ,which may be duly filled in and handed over to them. The complaint will then be forwarded to the Police Station for necessary action. You need not break your Journey to lodge a complaint with the police .you can also approach the RPF Assistance Posts at major railway stations, for any assistance in lodging the complaint.");
                System.out.println();
                System.out.println();         
                System.out.println("LUGGAGE  IS LOST  OR  DAMAGE -");
                System.out.println();    
                System.out.println("Where value of the luggage booked has not been declared beforehand by the consignor and the prescribing percentage charge not paid the monetary liability of the railways has been limited to Rs. 100/- per Kg. However, where the consignor has declared the value of the consignment and has also paid percentage charges, he will be entitled to get the claimed amount which will not exceed the value of the luggage so declared at the time of booking . The procedure of payment of percentage charge can be enquired from the luggage booking office.");
                System.out.println();
                System.out.println();          
                System.out.println("THEFT  OF  LUGGAGE -");
                System.out.println();     
                System.out.println("•   A prescribed FIR Form in English, Hindi and regional Language is available in the Timetable or with 'TTEs/Guards or GRP escort. After filling it up, the form may be handed over to one of the official viz., TTE, Guard or GRP escort for registration of the report at the next police station. ");
                System.out.println("•   All at the above services and commitments will be honored without the citizens' having to pay any bribe.");
                System.out.println();
                System.out.println();
                System.out.println("RULES FOR CARRYING PETS,DOGS,HORSES OTHER LIVE ANIMALS AND BIRDS RISK:-");
                System.out.println();
                System.out.println("(1) Under section 77-A of the Indian Railway Act,the liability of Railways as carriers of animals is limited as specfied below,unless the sender elects to pay the percentage charge on value as shown in the Rule 1301:- Per Head Elephants Rs.1500/- Horses Rs.750/- Mules,Camels or Horned Cattle Rs.200/- Donkeys,sheep,goats,dogs and other animals or birds Rs.30/-");
                System.out.println("(2) The sender or his authorized agent is required to declare the value of each animal on the Forwarding Note when the value of an animal exceeds the amount specified above.The sender or his authorised agentmust also record in the Forwarding Note whether he engages to pay the notified percentage charge on value.Should he elect no to pay the notified percentage value on value,the animal will be accepted for carriage under the terms and conditions of Section 77-A of Indian Railway Act.");
                System.out.println("(3) The Railway will not be liable for the loss,destruction or damage arising from freight or restiveness of the animal or from overloading of vehicle or wagon by the consigner or his agent or delay not caused by the negligence or misconduct of their servants,irrespective of whether the sender has engaged to pay the percentage charge on value or not.");
                System.out.println("(4) Railway will not be responsible for the loss,destruction,damage, deterioration or non_delivery of animals after the termination of transit as defined in Rule 153.");
                System.out.println();
                System.out.println();  
                System.out.println("RULE AND RATES FOR CONVEYANCE OF DOGS:");
                System.out.println();   
                System.out.println("(1) Dogs when carried in the break-van and/or A.C.C. and first class passenger compartments will be charged for at Scale 'L'(luggage Rates)on the basis of weights indicated below, subject to a minimum charge of Rs.10/- per dog, charges being Prepaid:- When carried in break_van (Dog-Box) 30 Kgs When carried in passengers compartments 60 Kgs seeing eye dog travelling with a blind person in the compartment (First class) will, however, be charged the same tariff as for dogs carried in brake_van. The dogs must be provided with Collars and Chains.Owners should make their own arrangements for food and water for the dog during the journey. Dogs detected unbooked will be charged at six times the Luggage Scale Rate subject to a minimum of Rs.50/-");
                System.out.println("(2) A passenger travelling in First Aircondition class or first class may take a dog into the compartment only with the concurrence of fellow passengers on payment of charges vide Clause(1) above.The charges are to be prepaid.If fellow passengers subsequently object to the dog remainig in the compartment,it will be removed to the Guard's van,no refund being given. Dogs detected unbooked with the passenger in IA and Ist class compartments will be charged six times the Luggage scale Rate subject to a minimum of Rs.50/-. A lady travelling alone with children under 12 years of age in a first class compartment may take with her in the compartment one dog on payment of charges at the Dog Box Rates,subject to a minimum of Rs.10/-provided that if another lady enters the compartment,the dog can only be allowed to remain in the compartment with her consent.Any dog detected unbooked will be charged at double the dog-box rate for the distance up to the point of detection and at the dog-box rate for the distance beyond the total charge being subject to a minimum of Rs.20/- for each dog. ");
                System.out.println("(3) Dogs are not allowed to be carried in ACC Sleeper Coaches,Acc chair car coaches sleeper class and second class coaches.If a dog is found being carried in contravention of this rule,it will be removed immediately to the brake-van and charges will be levied six times the Luggage Scale Rate subject to a minimum of Rs.50/-.");
                System.out.println("(4) Charge for dog carried in reserved compartments will be levied at the dog-box rate.Any dog tetected unbooked will be charged six times the Luggage Scale Rate subject to a minimum of Rs.50/- ");
                System.out.println("(5) Large dogs which cannot be carried in the dog-box of a brake van will be carried in a special vehicle at the same rates and conditions as for horses.");
            
        }
        public static void r1R()
        {
             System.out.println("\fUNUSED TICKETS ON WHICH NO RESERVATION HAS BEEN MADE : ");
                System.out.println();      
                System.out.println("If a ticket on which no reservation of a seat or berth has been made is presented for cancellation within  three hours after the actual departure of the train for which the ticket is issued or for any ticket valid for the whole day, within three hours after the actual departure of the last train of the day for the destination station, refund of fare shall be made on every such ticket after deducting Rs. 20/- per passenger as  clerikage.");
                System.out.println();
                System.out.println();       
                System.out.println("UNUSED TICKETS ON WHICH RESERVATION HAS BEEN MADE : ");
                System.out.println();        
                System.out.println("(1) Subject to the provision of these rules, if a ticket on which reservation of a seat or berth has been made, is presented for cancellation, refund of fare shall be made after deducting cancellation charge from the fare as follows :-");
                System.out.println("    (a) If a ticket is presented for cancellation more than 24 hours before the  scheduled departure of the train  cancellation charge shall be deducted at the flat rate of Rs. 70/- for  A.C First Class/Executive Class, Rs. 60/- for A.C. 2 Tier sleeper class/ A.C. 3 Tier sleeper class/ First class/A.C Chair Car, Rs. 40/- for Sleeper class and Rs. 20/- for Second class.");
                System.out.println("    (b) If the ticket is presented for cancellation within 24 hours  and up to four hours before the scheduled departure of the train, cancellation charges shall be 25% of the fare subject to the min. flat rate mentioned in clause (a).");
                System.out.println("    (c) If the ticket is presented for cancellation within four hours before the  scheduled departure of the train and  up to -");
                System.out.println("        (i) Three hours, when the ticket is for a destination station up to 200 KM.");
                System.out.println("        (ii) Six hours, when the ticket is for a destination  station of more than 200 KM but up to 500 KM., and");
                System.out.println("        (iii) Twelve hours , when the ticket is for a destination station of more than 500 KM.,");
                System.out.println("        after the actual departure of the train, cancellation charges shall be 50 % of the fare subject to the min. flat rate  mentioned in clause (a).");
                System.out.println("Provided that for night train leaving  between 21:00 hours and 06:00 hours (actual departures), refunds shall be admissible at the station within the time limit specified above or within two hours after the opening of reservation office, whichever is later.");
                System.out.println("(2) No refunds shall be granted at the station if the ticket is surrendered for cancellation after the expiry of the period mentioned under clause (c)  of sub rule (1).");
                System.out.println("Note: (1) In the case of tickets issued for travel from some other stations refunds shall be admissible at the ticket issuing station provided that the ticket is surrendered before the schedule departure of the train from the station from where the ticket is valid.");
                System.out.println("      (2) On a party/family ticket issued for more than one person, where some persons have confirmed reservations and others are on waiting list, full refund less clerkage charges is admissible for confirmed passengers provided that the entire ticket is surrendered for cancellation at the journey commencing station within four hours before the scheduled departure of the train and up to three hours after actual departure of the train.");
                System.out.println();
                System.out.println();    
                System.out.println("UNUSED WAIT LISTED OR RAC TICKETS ");
                System.out.println();  
                System.out.println("(1A) Subject to provisions of subrule (2), no cancellation charges shall be payable if a wait-listed or RAC ticket is presented for cancellation up to -");
                System.out.println("     (i) Three hours, when the ticket is for a destination station up to 200 KM.");
                System.out.println("     (ii) Six hours, when the ticket is for a destination  station of more than 200 KM but up to 500 KM., and");
                System.out.println("     (iii) Twelve hours , when the ticket is for a destination station of more than 500 KM.,");
                System.out.println("after the actual departure of the train except for a deduction of a clerkage charge of Rs. 20/- per passenger.");
                System.out.println("Provided that for night train leaving  between 21:00 hours and 06:00 hours (actual departures), refunds shall be admissible at the station within the time limit specified above or within four hours of  opening of the reservation office, whichever is later.");
                System.out.println("(2A) Where confirmed reservation has been provided to RAC or wait-listed ticket holder at any time up to the final preparation of reservation chart, such ticket shall be treated as a reserved ticket and cancellation charges shall be payable in accordance with rules mentioned above.");
                System.out.println();
                System.out.println();     
                System.out.println("CANCELLATION CHARGES ON MULTIPLE JOURNEY TICKETS :- ");
                System.out.println();
                System.out.println("With effect from 1st March 2000, when an unused ticket involving more than one journey is surrendered for cancellation, the entire ticket shall be treated as one single journey ticket and refund of fare of entire ticket shall be granted as per rules (1) and (2) above, according to the reservation status of the first lap of journey, i.e. if reservation status of first lap of journey is confirmed, refund shall be granted in accordance with the rule (1) and (2)  above and if the reservation status of first lap of journey is RAC/Wait-list, refund shall be granted in accordance with the rule (1A) and (2A) above. The cancellation charges or clerkage charge as the case may be, shall be levied only once on the entire amount of the ticket, irrespective of the reservation status of different laps of journey, and not separately for each lap of journey.");
                System.out.println();  
                System.out.println();
                System.out.println("REFUND ON PARTIALLY USED TICKETS ");
                System.out.println();   
                System.out.println("For partially used tickets where a passenger terminates his journey enroute, a ticket deposit receipt shall be issued by the station master and the ticket holder may apply for refund to the chief commercial manager (Refunds) of the concerned railway.");
                System.out.println();
                System.out.println();          
                System.out.println("REFUND DUE TO LATE RUNNING OF TRAINS");                 
                System.out.println("No cancellation charge or clerkage shall be levied and full fare shall be refundable to all passengers holding Reserved, RAC, and Waitlisted tickets, if the journey is not undertaken due to late running of the train by more than 3 hours of the scheduled departure of the train from the journey commencing station provided that the ticket is surrendered upto the maximum time limits prescribed in clause (c) of sub-rule (1) of rule 6 .Which is given below:");
                System.out.println("Full refund will be permitted even after the departure of train  in the event of train running more than 3 hours late and that the time limits will be up to 3 hours if the distance of the ticket is up to 200Kms., up to 6 hours if the distance of the ticket is 201-500 Kms. and up to 12 hours after the departure of the train if the distance of the ticket is more than 500 Kms. ");
                System.out.println();    
                System.out.println();
                System.out.println("REFUND OF TICKETS WHERE RAILWAY ADMINISTRATION IS UNABLE TO PROVIDE ACCOMMODATION ");
                System.out.println();  
                System.out.println("Full refund of fares shall be granted in case the railway administration is not able to provide accommodation for any reason whatsoever to passengers holding  reserved tickets, provided such tickets are cancelled within three hours of the actual departure of the trains.");
                System.out.println("In case a train is cancelled due to accidents, breaches or floods, the full refund of fare is granted within three days excluding the scheduled day of departure of the train.");
                System.out.println();  
                System.out.println();
                System.out.println("REFUND IN CASE OF FAILURE OF AIR-CONDITIONING EQUIPMENT ");
                System.out.println();       
                System.out.println("When the air-conditioning has not worked for a portion of the journey, the ref und for such portion of the journey is granted at the destination of the train on production of a certificate of the conductor /guard , if the ticket is presented within twenty hours of the arrival of the train as follows:");
                System.out.println("1) In case of AC first class, the difference between the AC first class fare and first class mail fare.");
                System.out.println("2) In case of AC 2 tier sleeper/AC 3 tier sleeper class, the difference  between the AC 2 tier/AC 3 tier fare and the sleeper class mail /express fare.");
                System.out.println("3) In case of AC chair car class the difference between the AC chair car class and second class mail/express fare.");
                System.out.println("4) In case of Executive class ticket of  Shatabdi trains, the difference between the notified executive class fare for the concerned section and first class mail/express fare for the concerned distance of that section.");
                System.out.println();
                System.out.println();
                System.out.println("REFUND IN CASE PASSENGERS ARE MADE TO TRAVEL IN A LOWER CLASS FOR WANT OF ACCOMMODATION ");
                System.out.println(); 
                System.out.println("If a ticket holder of higher class is made to travel in a lower class for want of accommodation in the class for which the ticket was issued, refund of difference between the fare paid and fare payable shall be granted at the destination station or the originating station as the case may be. The refund at the destination shall be granted only on the production of a certificate from the conductor/.guard/TTE and the ticket is presented within 2days of  the date of issue of the certificate (excluding date of issue) of the arrival of the train at your  destination To claim this refund passenger will have to submit ticket along with the certificate issued by te Traveling Ticket Examiner.");
                System.out.println();
                System.out.println();
                System.out.println("REFUND ON LOST/ MISPLACED TICKETS"); 
                System.out.println();
                System.out.println("No refund is permissible against lost/misplaced tickets. However passenger will be allowed to travel on the reservation  already made on confirmed one or RAC .If the loss of confirmed/RAC ticket is reported before the preparation of the  reservation chart, duplicate ticket will be issued on the collection of the clerkage charge per passenger. If the loss of confirmed/RAC ticket is reported after the preparation of the  reservation chart, duplicate ticket will be issued on the collection of the  50% of the fare . No duplicate ticket will be issued after the preparation of reservation chart in case of RAC ticket . Loss of tickets be reported to railways immediately to prevent fraudulent refunds on lost tickets.");
                System.out.println();
                System.out.println();         
                System.out.println("ISSUE OF DUPLICATE TICKET IN LIEU OF TORN/MUTILATED TICKETS ");
                System.out.println();
                System.out.println("Duplicate ticket can be issued  only in case of  torn/mutilated confirmed/RAC tickets.");
                System.out.println("The duplicate ticket can be issued against torn/mutilated ticket if it is reported to the railway and the passenger can travel on the accommodation reserved by him, by making payment and getting a duplicate ticket as per following table :-");
                System.out.println("A) Before the chart preparation");
                System.out.println("Under  this rule the duplicate ticket (in lieu of lost/misplaced/torn/mutilated/reserved/RAC tickets) will be issued 0on collection of 25% of the fare, after the preparation of  reservation chart. Before chart preparation of the reservation chart on collection of 50% of the fare.No duplicate ticket will be prepared after preparation of reservation chart.in case of RAC tickets.");
                System.out.println("Refund on torn/mutilated ticket is admissible on torn/mutilated if its genuineness and authenticity are verified on the basis of of particulars visible on the face of such ticket .subject to the deduction of cancellation charges as per rules, provided that the authenticity of such a ticket is verified at the station on the basis of particulars visible on the face of ticket.");
                System.out.println("Note: ");
                System.out.println("1) No duplicate ticket against lost RAC ticket is permitted after the chart preparation.");
                System.out.println("2) No duplicate ticket is issued against Wait List lost/torn/mutilated tickets. ");
                System.out.println();       
                System.out.println();        
                System.out.println("REFUND OF DUPLICATE TICKET ");
                System.out.println();       
                System.out.println("If lost tickets are traced and presented along with the duplicate ticket before the departure of the train, refund is permitted for the duplicate ticket after deduction of 5% of the charges paid subject to a min. of Rs. 20/-. Thereafter, original ticket becomes valid for travel as well as refunds.");
                System.out.println();
                System.out.println();
                System.out.println("REFUND ON TICKETS PURCHASED ON CREDIT CARD ");
                System.out.println();
                System.out.println("Tickets purchased on credit cards can be cancelled and Credit Slip obtained only at such Railway Stations where Credit Card counters exist.");
                System.out.println("If you need to cancel your tickets at other stations, where such counters are not available, please cancel your reservation and obtain a Ticket Deposit Receipt. You can then apply to Chief Commercial Manager (Refunds) of the zone, to which the Ticket Deposit Receipt - issuing station belongs.");
                System.out.println();
                System.out.println();
                System.out.println("REFUND ON TATKAL TICKET");
                System.out.println();
                System.out.println("1.A flat refund of 25% of total fare charged on the ticket, excluding Tatkal charges may be granted on cancellation of confirmed Tatkal tickets    which are presented for cancellation upto 24hrs before the schedule departure of train. Thereafter, no refund will be granted on cancellation of confirmed Tatkal ticket except under the conditions prescribed below");
                System.out.println("2.Full refund of fare and Tatkal Charges will be granted on the tickets booked under this scheme in the following circumstances: ");
                System.out.println("  • If the train is delayed by more than 3 hours at the journey originating point of passenger and not the boarding point if the passenger's journey originating point and boarding point are different.");
                System.out.println("  • If the train is to run on diverted route and the passenger is not willing to travel; boarding station or the destination station or both the stations are not on the diverted route");
                System.out.println("  • In case of non attachment of coach in which Tatkal accommodation has been earmarked and the passenger has not been provided accommodation in the same class.");
                System.out.println("  • If the party has been accommodated in lower class and does not want to travel. In case the party travels in lower class,the passenger will be given refund of difference of fare and also the difference of Tatkal charges if any.");
                System.out.println("  • The booking under tatkal scheme will be done only from the originating to terminating point of the train with boarding facility from intermediate station. However zonal railways have been given the discretions of imposing restrictions on tatkal booking regarding defining trains as end to end or keeping it free or imposing distance restriction etc. Keeping in view the over all utilization of the accmmodations available in the train.");                
                System.out.println("3.No refund will,however,be permissible on the reservations made under Tatkal scheme in case the coach, in which accommodation under Tatkal    scheme has been earmarked, is not attached and the accommodation has been provided to the Tatkal passengers in the normal train services in the same class.");
        }
}
        
        

