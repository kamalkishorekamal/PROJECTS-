package table;
public class t1 extends dates
{
    public static int x=0;
    public static String[][] tab_main={
        {"1057","AMRITSAR EXPRESS","DADAR","23:45","AMRITSAR","16:30"},
        {"1058","ASR DR EXPRESS","AMRITSAR","8:35","DADAR","4:00"},
        {"2102","JNANESWARI SUP DL","HOWRAH","22:55","LOKMANYA TILAK","5:45"},
        {"2137","PUNJAB MAIL","MUMBAI CST","19:40","FIROZPUR CANTT","5:40"},
        {"2138","PUNJAB MAIL","FIROZPUR CANTT","21:45","MUMBAI CST","7:35"},
        {"2152","SAMARSATA EXPRESS","HOWRAH","21:15","LOKMANYA TILAK","7:30"},
        {"2262","HOWRAH CSTM DURANT","HOWRAH","8:20","MUMBAI CST","10:30"},
        {"2288","DDN KCVL SUP EXPRESS","DEHARADUN","6:00","KOCHUVELI","16:40"},
        {"2432","TRIVANDRUM RAJDHANI","H NIZAMUDDIN","11:00","TRIVANDRUM CENTRAL","5:45"},
        {"2449","GOA SMPRK K E","MADGAON","11:20","H NIZAMUDDIN","16:50"},
        {"2450","GOA SMPRK K E","H NIZAMUDDIN","7:25","MADGAON","13:15"}, 
        {"2471","SWARAJ EXPRESS","BANDRA TERMINUS","7:55","JAMMU TAWI","14:45"},
        {"2472","SWARAJ EXPRESS","JAMMU TAWI","11:15","BANDRA TERMINUS","18:05"},
        {"2484","ASR KCVL EXPRESS","AMRITSAR","6:05","KOCHUVELI","15:40"},
        {"2618","MNGLA LKSDP EXPRESS","H NIZAMUDDIN","9:20","ERNAKULAM TOWN","10:00"},
        {"2860","GITANJALI EXPRESS","HOWRAH","14:00","MUMBAI CST","21:30"},
        {"2904","GOLDEN TEMPLE MAIL","AMRITSAR","21:25","MUMBAI CENTRAL","5:40"},
        {"2908","MHRST SMPRK K E","H NIZAMUDDIN","21:35","BANDRA TERMINUS","17:50"},
        {"2910","BDTS GARIB RATH","H NIZAMUDDIN","16:40","BANDRA TERMINUS","8:05"},
        {"2926","PASCHIM EXPRESS","AMRITSAR","8:15","BANDRA TERMINUS","15:15"},
        {"2926A","PASCHIM EXPRESS","KALKA","10:20","BANDRA TERMINUS","15:15"},
        {"2952","MUMBAI RAJDHANI","NEW DELHI","16:30","MUMBAI CENTRAL","8:35"},
        {"2954","AG KRANTHI RAJDHANI","H NIZAMUDDIN","16:55","MUMBAI CENTRAL","10:15"},
        {"9020","DEHRADUN EXPRESS","DEHRADUN","10:40","BANDRA TERMINUS","4:30"},
        {"9024","FZR BCT JANTA","FIROZPUR CANTT","4:30","MUMBAI CENTRAL","21:10"}
    };                                      
    
    public static boolean[][] main_day_class={
        {true,true,true,true,true,true,true,false,true,false,true,false,true,false,false},
        {true,true,true,true,true,true,true,false,true,false,true,false,true,false,false},
        {true,false,true,true,false,false,true,true,true,false,true,false,true,false,false},
        {true,true,true,true,true,true,true,true,true,false,true,false,true,false,false},
        {true,true,true,true,true,true,true,true,true,false,true,false,true,false,false},
        {false,false,false,false,true,true,false,true,true,false,true,false,true,false,false},
        {true,false,false,false,true,false,false,true,true,false,true,false,false,false,true},
        {true,false,false,false,false,false,false,false,false,false,true,false,true,false,false},
        {false,true,true,false,false,false,true,true,true,false,true,false,false,false,false},
        {false,true,true,false,false,false,false,true,true,false,true,false,true,false,false},
        {true,false,false,false,false,true,false,true,true,false,true,false,true,false,false},
        {true,false,false,true,true,false,true,false,true,false,true,false,true,false,false},
        {false,true,true,false,true,true,false,false,true,false,true,false,true,false,false},
        {false,false,false,false,false,false,true,false,true,false,true,false,true,false,false},
        {true,true,true,true,true,true,true,false,true,false,true,false,true,false,false},
        {true,true,true,true,true,true,true,false,true,false,true,false,true,false,false},
        {true,true,true,true,true,true,true,true,true,false,true,false,true,false,false},
        {false,false,false,true,false,false,false,false,true,false,true,false,true,false,false},
        {false,false,false,false,true,false,true,false,false,false,true,false,false,false,false,},
        {true,true,true,true,true,true,true,true,true,false,true,false,false,false,false},
        {true,true,true,true,true,true,true,false,false,false,true,false,true,false,false},
        {true,true,true,true,true,true,true,true,true,false,true,false,false,false,false},
        {true,true,true,true,true,true,true,true,true,false,true,false,false,false,false},
        {true,true,true,true,true,true,true,true,false,false,false,false,true,false,false},
        {false,false,true,true,true,true,true,false,false,false,false,false,true,false,false,}
    };
    public static String[][] t1_seat={
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}                                                                 
    };
    public static String[][] t2_seat={
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}
    };
    public static String[][] t3_seat={
        {"A1","6"},
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}
    };
    public static String[][] t4_seat={
        {"1A","6"},
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}
    };
    public static String[][] t5_seat={
        {"1A","6"},
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}
    };
    public static String[][] t6_seat={
        {"A1","6"},
        {"A2","10"},
        {"A3","12"},                                                                            
        {"SL","14"}
    };
    public static String[][] t7_seat={
        {"1A","6"},
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}
    };
    public static String[][] t8_seat={
        {"A3","12"},
        {"SL","14"}                                                                     
    };
    public static String[][] t9_seat={
        {"A2","10"},
        {"A3","12"},
        {"1A","6"}
    };
    public static String[][] t10_seat={
        {"1A","6"},
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}
    };
    public static String[][] t11_seat={
        {"1A","6"},
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}
    };
    public static String[][] t12_seat={
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}
    };
    public static String[][] t13_seat={
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}                                                         
    };
    public static String[][] t14_seat={
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}
    };
    public static String[][] t15_seat={
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}
    };
    public static String[][] t16_seat={
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}
    };
    public static String[][] t17_seat={
        {"A2","10"},
        {"A3","12"},                                                                                    
        {"SL","14"}
    };
    public static String[][] t18_seat={
        {"1A","6"},
        {"A2","10"},
        {"A3","12"},
        {"SL","14"}
    };
    public static String[][] t19_seat={
        {"A3","12"},
        {"CC","5"}
    };
    public static String[][] t20_seat={
        {"A1","6"},
        {"A2","10"},
        {"A3","12"}
    };
    public static String[][] t21_seat={
        {"A3","12"},
        {"SL","14"}         
    };
    public static String[][] t22_seat={
        {"A2","10"},
        {"A3","12"},
        {"A1","6"}
    };
    public static String[][] t23_seat={
        {"A2","10"},
        {"A3","12"},
        {"A1","6"}
    };
    public static String[][] t24_seat={
        {"A1","6"},
        {"SL","14"}
    };
    public static String[][] t25_seat={
        {"SL","14"}
    };
    public static String[][] Stn_Codes={
        {"ADRA","ADRA"},
        {"AGA","AGRA"},
        {"AK","AKOLA"},
        {"ALD","ALLAHABAD"},
        {"ASN","ASANSOL"},
        {"ASR","AMRITSAR"},
        {"BCT","MUMBAI CENTRAL"},
        {"BD","BADNERA"},
        {"BDC","BANDEL"},
        {"BDTS","BANDRA TERMINUS"},
        {"BRC","VADODARA"},
        {"BSP","BILASPUR"},
        {"BWN","BARDHAMAN"},
        {"CDG","CHANDIGARH"},    
        {"CKP","CHAKRADHARPUR"},
        {"CNB","KANPUR CENTRAL"},
        {"CPA","KANPUR ANWARGANJ"},
        {"CSTM","MUMBAI-CST"},
        {"DGR","DYRGAPUR"},
        {"DHN","DHANBAD"},
        {"DURG","DURG"},
        {"FZR","FIROZPUR CANTT."},
        {"G","GONDIA"},
        {"GAYA","GAYA"},
        {"GMO","GOMOH"},
        {"JSG","JARSUGUDA"},
        {"HWH","HOWRAH"},                                           
        {"KGP","KHARAGPUR"},
        {"KLK","KALKA"},
        {"KOTA","KOTA"},
        {"KYN","KALYAN"},
        {"LC","LUCKNOW CITY"},
        {"LJN","LUCKNOW NE"},
        {"LKO","LUCKNOW NR"},
        {"MGS","MUGHAL SARAI"},
        {"MTJ","MATHURA"},
        {"NDLS","NEW DELHI"},
        {"NGP","NAGPUR"},
        {"NZM","H NIZAMUDDIN"},
        {"PNBE","PATNA JUNCTION"},
        {"R","RAIPUR"},
        {"RNC","RANCHI"},
        {"ROU","ROURKELA"},
        {"SDH","SEALDAH"},
        {"SGNR","SRI GANGA NAGAR"},
        {"ST","SURAT"},
        {"TATA","TATANAGAR/JAMSHEDPUR"},
        {}
    };
    
    public static String t1_reserve[][]=new String[36][11];
    public static String t2_reserve[][]=new String[36][11];
    public static String t3_reserve[][]=new String[42][11];
    public static String t4_reserve[][]=new String[42][11];
    public static String t5_reserve[][]=new String[42][11];
    public static String t6_reserve[][]=new String[42][11];
    public static String t7_reserve[][]=new String[42][11];
    public static String t8_reserve[][]=new String[42][11];
    public static String t9_reserve[][]=new String[26][11];
    public static String t10_reserve[][]=new String[28][11];
    public static String t11_reserve[][]=new String[42][11];
    public static String t12_reserve[][]=new String[36][11];
    public static String t13_reserve[][]=new String[36][11];
    public static String t14_reserve[][]=new String[36][11];
    public static String t15_reserve[][]=new String[36][11];
    public static String t16_reserve[][]=new String[36][11];
    public static String t17_reserve[][]=new String[36][11];                            
    public static String t18_reserve[][]=new String[42][11];
    public static String t19_reserve[][]=new String[17][11];
    public static String t20_reserve[][]=new String[28][11];
    public static String t21_reserve[][]=new String[26][11];
    public static String t22_reserve[][]=new String[28][11];
    public static String t23_reserve[][]=new String[28][11];
    public static String t24_reserve[][]=new String[20][11];
    public static String t25_reserve[][]=new String[14][11];
    
    public static String t1_waiting[][]=new String[36][11];
    public static String t2_waiting[][]=new String[36][11];
    public static String t3_waiting[][]=new String[42][11];
    public static String t4_waiting[][]=new String[42][11];
    public static String t5_waiting[][]=new String[42][11];
    public static String t6_waiting[][]=new String[42][11];
    public static String t7_waiting[][]=new String[42][11];
    public static String t8_waiting[][]=new String[42][11];
    public static String t9_waiting[][]=new String[26][11];
    public static String t10_waiting[][]=new String[28][11];
    public static String t11_waiting[][]=new String[42][11];
    public static String t12_waiting[][]=new String[36][11];
    public static String t13_waiting[][]=new String[36][11];
    public static String t14_waiting[][]=new String[36][11];
    public static String t15_waiting[][]=new String[36][11];
    public static String t16_waiting[][]=new String[36][11];
    public static String t17_waiting[][]=new String[36][11];
    public static String t18_waiting[][]=new String[42][11];
    public static String t19_waiting[][]=new String[17][11];
    public static String t20_waiting[][]=new String[28][11];
    public static String t21_waiting[][]=new String[26][11];
    public static String t22_waiting[][]=new String[28][11];
    public static String t23_waiting[][]=new String[28][11];
    public static String t24_waiting[][]=new String[20][11];
    public static String t25_waiting[][]=new String[14][11];
    
    
    public static String[][] t1_stop={
       {"1","DR","DADAR","Source","23:45","1","0"},
       {"2","THN","THANE","00:08","00:10","2","25"},
       {"3","KYN","KALYAN","00:30","00:35","2","45"},
       {"4","NPNR","NEPANAGAR","08:38","08:40","2","517"},
       {"5","BPL","BHOPAL","15:10","15:15","2","834"},
       {"6","SCI","SANCHI","15:43","15:45","2","878"},
       {"7","JHS","JHANSI","20:20","20:30","2","1125"},
       {"8","GWL","GWALIOR","22:07","22:15","2","1222"},
       {"9","AGC","AGRA CANTT","00:08","00:18","3","1341"},
       {"10","MTJ","MATHURA","01:15","01:25","3","1395"},
       {"11","FDB","FARIDABAD","03:21","03:23","3","1507"},
       {"12","NZM","H NIZMUDDIN","03:45","03:47","3","1528"},
       {"13","NDLS","NEW DELHI","04:10","04:30","3","1535"},
       {"14","PNP","PANIPAT","07:00","07:02","3","1625"},
       {"15","KUN","KARNAL","07:36","07:38","3","1659"},
       {"16","KKDE","KURUKSHETRA","08:22","08:24","3","1692"},
       {"17","PTA","PATIALA","10:53","10:55","3","1787"},
       {"18","LDH","LUDHIANA","13:40","13:50","3","1901"},
       {"19","JUC","JALANDHAR CITY","15:05","15:10","3","1958"},
       {"20","ASR","AMRITSAR","16:30","Destination","3","2037"}
    };
    public static String[][] t2_stop={
        {"1","ASR","AMRITSAR","Source","08:35","1","0"},
        {"2","JUC","JALANDHAR CITY","10:00","10:10","1","79"},
        {"3","LDH","LUDHIANA","11:35","11:55","1","136"},
        {"4","PTA","PATIALA","13:55","13:57","1","251"},
        {"5","KKDE","KURUKSHETRA","16:34","16:36","1","345"},
        {"6","KUN","KARNAL","17:16","17:18","1","379"},
        {"7","PNP","PANIPAT","17:56","17:58","1","413"},
        {"8","NDLS","NEW DELHI","20:20","20:50","1","502"},
        {"9","NZM","H NIZAMUDDIN","21:05","21:07","1","509"},
        {"10","FDB","FARIDABAD","21:25","21:27","1","530"},
        {"11","MTJ","MATHURA","23:45","23:55","1","643"},
        {"12","AGC","AGRA CANTT","00:55","1:05","2","697"},
        {"13","GWL","GWALIOR","3:00","3:08","2","815"},
        {"14","JHS","JHANSI","4:50","5:00","2","912"},
        {"15","BPL","BHOPAL","11:00","11:05","2","1203"},
        {"16","NPNR","NEPANAGAR","17:08","17:10","2","1521"},
        {"17","KYN","KALYAN","2:50","2:55","3","1993"},
        {"18","THN","THANE","3:13","3:15","3","2013"},
        {"19","DR","DADAR","4:00","Destination","3","2037"}
    };
    public static String[][] t3_stop={
     {"1","HWH","HOWRAH JN","SOURCE","22:55","0","1"},
     {"2","KGP","KHARAGPUR JN","00:35","00:40","116","1"},
     {"3","TATA","TATANAGAR JN","02:30","22:35","250","1"},
     {"4","ROU","ROURKELA","04:55","05:02","413","2"},
     {"5","BSP","BILASPUR JN","09:30","09:45","720","2"},
     {"6","DURG","DURGAPUR","12:20","12:25","867","2"},
     {"7","NGP","NAGPUR","16:20","16:30","1131","2"},
     {"8","KYN","KALYAN JN","16:45","16:50","1915","3"},
     {"9","LTT","LOKMANYATILAK T","05:45","Destination","1952","3"}
   };

    public static String[][] t4_stop={
        {"1","CSTM","MUMBAI CST","Source","19:40","1","0"},
        {"2","DR","DADAR","19:53","19:55","1","9"},
        {"3","KYN","KALYAN","20:35","20:40","1","54"},
        {"4","BPL","BHOPAL","9:40","9:45","2","843"},
        {"5","JHS","JHANSI","14:20","14:30","2","1134"},
        {"6","GWL","GWALIOR","16:40","16:45","2","1231"},
        {"7","AGC","AGRA CANTT","17:50","17:55","2","1350"},
        {"8","MTJ","MATHURA","18:47","18:50","2","1403"},
        {"9","FDB","FARIDABAD","20:24","20:26","2","1516"},
        {"10","NZM","H NIZAMUDDIN","20:51","20:53","2","1537"},
        {"11","NDLS","NEW DELHI","21:15","21:50","2","1544"},
        {"12","BTI","BHATINDA","3:40","3:50","3","1842"},
        {"13","FDK","FARIDKOT","4:51","4:53","3","1897"},
        {"14","FZR","FIROZPUR CANTT","05:40","Destination","3","1930"}
    };
    public static String[][]t5_stop={
        {"1","FZR","FIROZPUR CANTT","Source","21:45","1","0"},
        {"2","FDK","FARIDKOT","22:10","22:12","1","33"},
        {"3","BTI","BHATINDA","23:30","23:24","1","88"},
        {"4","ROK","ROHTAK","03:22","03:25","2","315"},
        {"5","NDLS","NEW DELHI","05:00","05:30","2","386"},
        {"6","FDB","FARIDABAD","05:57","05:59","2","414"},
        {"7","MTJ","MATHURA JUNCTION","07:47","07:50","2","527"},
        {"8","AGC","AGRA CANTT","08:50","08:55","2","580"},
        {"9","GWL","GWALIOR","10:35","10:40","2","699"},
        {"10","JHS","JHANSI","12:25","12:35","2","796"},
        {"11","LAR","LALITPUR","13:43","13:45","2","886"},
        {"12","BPL","BHOPAL","16:55","17:00","2","1087"},
        {"13","KYN","KALYAN","06:20","06:25","3","1876"},
        {"14","DR","DADAR","07:13","07:15","3","1921"},
        {"15","CSTM","MUMBAI CST"," 07:35","Destination","3","1930"}
    };
    public static String[][] t6_stop={
        {"1","HWH","HOWRAH JN","Source","21:15","0","1"},
        {"2","KGP","KHARAGPUR JN","23:00","23:05","116","1"},
        {"3","BQA","BANKURA","01:02","01:04","231","2"},
        {"4","ADRA","ADRA JN","01:50","01:55","284","2"},
        {"5","PRR","PURULIA JN","02:38","02:40","323","2"},
        {"6","R","RAIPUR JN","12:45","12:55","960","2"},
        {"7","DURG","DURGAPUR","13:40","13:45","996","2"},
        {"8","NGP","NAGPUR","17:50","18:00","1260","2"},
        {"9","KYN","KALYAN JN","06:25","06:30","2044","3"},
        {"10","LTT","LOKMANYATILAK T","07:30","Destination","2081","3"}
    };
    public static String[][] t7_stop={
        {"1","HWH","HOWRAH","Source","8:20","0","1"},
        {"2","CSTM","MUMBAI CST","10:30","Destination","1968","2"}
    };
    public static String[][] t8_stop={
       {"1","DDN","DEHRADUN","Source","06:00","1","0"},
       {"2","HW","HARIDWAR","07:35","07:43","1","51"},
       {"3","RK","ROORKEE","08:25","08:27","1","93"},
       {"4","MOZ","MUZAFFARPUR","10:46","10:48","1","177"},
       {"5","MTC","MEERUT CITY","11:33","11:35","1","232"},
       {"6","GZB","GHAZIABAD","12:25","12:30","1","280"},
       {"7","NZM","H NIZAMUDDIN","13:25","14:05","1","302"},
       {"8","BRC","VADODARA","04:00","04:20","2","1288"},                           
       {"9","ST","SURAT","06:25","06:30","2","1417"},
       {"10","PNVL","PANVEL","12:25","12:30","2","1699"},
       {"11","MAO","MADGAON","21:10","21:20","2","2396"},
       {"12","CLT","KOZHIKODE","07:00","07:05","3","3052"},
       {"13","ERN","ERNAKULAM TOWN","10:45","10:50","3","3243"},
       {"14","QLN","KOLLAM","14:00","14:05","3","3401"},
       {"15","KCVL","KOCHUVELLI","15:40","Destination","3","3459"}
   };
   public static String[][] t9_stop={
       {"1","NZM","H NIZAMUDDIN","Source","11:00","1","0"},
       {"2","BRC","VADODARA","22:22","22:38","1","986"},
       {"3","PNVL","PANVEL","05:05","05:10","2","1397"},
       {"4","MAO","MADGAON","12:35","12:45","2","2094"},
       {"5","CLT","KOZHIKODE","21:48","21:50","3","2750"},
       {"6","ERS","ERNAKULAM TOWN","01:45","01:50","3","2943"},
       {"7","TVC","TRIVANDRUM CENTRAL","05:45","Destination","3","3149"}
   };
    public static String[][] t10_stop={
        {"1","MAO","MADGAON","Source","11:20","1","0"},
        {"2","PNVL","PANVEL","  19:33","19:38","1","197"},
        {"3","BRC","VADODARA","02:08","02:26","2","1108"},
        {"4","NZM","H NIZAMUDDIN","16:50","Destination","2","2094"}
        };
    public static String[][] t11_stop={
        {"1","NZM","H NIZAMUDDIN","","07:25","1","0"},
        {"2","BRC","VADODARA","21:55","22:13","1","986"},
        {"3","PNVL","PANVEL","05:05","05:10","2","1397"},
        {"4","MAO","MADGAON","13:16","","2","2094"}
        };
    public static String[][] t12_stop={
      {"1","BDTS","BANDRA TERMINUS","","07:55","1","0"},
      {"2","BVI","BORIVALI","08:26","08:28","1","19"},
      {"3","ST","SURAT","11:42","11:47","1","252"},
      {"4","BRC","VADODARA","13:32","13:50","1","381"},
      {"5","MTJ","MATHURA","14:03","14:05","2","1233"},
      {"6","NZM","H NIZAMUDDIN","04:08","04:10","2","1366"},
      {"7","NDLS","NEW DELHI","04:30","04:50","2","1373"},
      {"8","PNP","PANIPAT","06:11","06:13","2","1463"},
      {"9","LDH","LUDHIANA CANTT","09:45","10:05","2","1685"},
      {"10","JRC","JALANDHAR CANTT","10:50","10:55","2","1737"},
      {"11","JAT","JAMMU TAWI","14:45","2","1950"}
      };
    public static String[][] t13_stop={
        {"1","JAT","JAMMU TAWI","","11:15","1","0"},
        {"2","JRC","JALANDHAR CANTT","14:50","14:55","1","213"},
        {"3","LDH","LUDHIANA CANTT","15:45","16:10","1","265"},
        {"4","PNP","PANIPAT","19:35","19:37","1","487"},
        {"5","NDLS","NEW DELHI","21:30","21:50","1","577"},
        {"6","MTJ","MATHURA","00:05","00:10","2","717"},
        {"7","BRC","VADODARA","11:50","12:08","2","1569"},
        {"8","ST","SURAT","14:00","14:05","2","1698"},
        {"9","BVI","BORIVALI","17:21","17:23","2","1931"},
        {"10","BDTS","BANDRA TERMINUS","18:05","","2","1950"}
        };
    public static String[][] t14_stop={
        {"1","ASR","AMRITSAR","Source","06:05","1","0"},
        {"2","BEAS","BEAS","06:33","06:35","1","43"},
        {"3","JUC","JALANDHAR CITY","07:10","07:20","1","79"},
        {"4","LDH","LUDHIANA CANTT","08:10","08:15","1","136"},
        {"5","NDLS","NEW DELHI","13:30","13:50","1","448"},
        {"6","NZM","H NIZAMUDDIN","14:03","14:05","1","455"},
        {"7","BRC","VADODARA","04:00","04:20","2","1440"},
        {"8","ST","SURAT","06:25","06:30","2","1569"},
        {"9","PNVL","PANVEL","12:25","12:30","2","1852"},
        {"10","MAO","MADGAON","21:10","21:20","2","2548"},
        {"11","CLT","KOZHIKODE","07:00","07:05","3","3205"},
        {"12","ERS","ERNAKULAM TOWN","10:55","11:00","3","3398"},
        {"13","ALLP","ALLEPPY","12:05","12:08","3","3455"},
        {"14","KCVL","KOCHUVELI","15:40","","3","3597"}
        };
     public static String[][] t15_stop={
         {"1","NZM","H NIZAMUDDIN","","09:20","1","0"},
         {"2","FDB","FARIDABAD","09:38","09:40","1","21"},
         {"3","MTJ","MATHURA","11:22","11:25","1","134"},
         {"4","AGC","AGRA CANTT","12:20","12:25","1","188"},
         {"5","GWL","GWALIOR","14:00","14:05","1","306"},
         {"6","JHS","JHANSI","15:25","15:35","1","403"},
         {"7","BPL","BHOPAL","19:45","19:55","1","694"},
         {"8","KYN","KALYAN","20:30","20:35","2","1484"},
         {"9","PNVL","PANVEL","09:25","09:30","2","1520"},
         {"10","MAO","MADGAON","19:25","19:35","2","2217"},
         {"11","CLT","KOZHIKODE","05:00","05:05","3","2873"},
         {"12","ERS","ERNAKULAM TOWN","10:00","","3","3066"}
         };
   public static String[][] t16_stop={
     {"1","HWH","HOWRAH JN","","14:00","0","1"},
     {"2","KGP","KHARAGPUR JN","15:40","15:45","116","1"},
     {"3","TATA","TATANAGAR JN","17:30","17:37","250","1"},
     {"4","ROU","ROURKELA","19:50","20:10","413","1"},
     {"5","R","RAIPUR JN","02:20","02:30","831","2"},
     {"6","DURG","DURGAPUR","03:25","03:30","867","2"},
     {"7","NGP","NAGPUR","07:20","07:30","1131","2"},
     {"8","KYN","KALYAN JN","20:05","20:10","1915","2"},
     {"9","DR","DADAR","21:04","21:05","1959","2"},
     {"10","CSTM","MUMBAI CST","21:30","","1968","2"}
 };
      public static String[][] t17_stop={
          {"1","ASR","AMRTSAR","","21:25","1","0"},
          {"2","BEAS","BEAS","21:53","21:55","1","43"},
          {"3","JUC","JALANDHAR CITY","22:33","22:40","1","79"},
          {"4","JRC","JALANDHAR CANTT","22:48","22:50","1","84"},
          {"5","PGW","PHAGWARA","23:02","23:04","1","100"},
          {"6","LDH","LUDHIANA","23:55","00:05","2","136"},
          {"7","MUT","MEERUT CANTT","05:05","05:07","2","440"},
          {"8","GZB","GHAZIABAD","06:15","06:17","2","492"},
          {"9","NZM","H NIZAMUDDIN","06:55","07:45","2","515"},
          {"10","FDB","FARIDABAD","08:03","08:05","2","535"},
          {"11","MTJ","MATHURA","10:10","10:15","2","648"},
          {"12","BRC","VADODARA","23:18","23:36","2","1500"},
          {"13","ST","SURAT","01:30","01:35","3","1629"},
          {"14","DR","DADAR","05:09","05:11","3","1885"},                       
          {"15","BCT","MUMBAI CENTRAL","05:40","","3","1891"}
          };
     public static String[][] t18_stop={
       {"1","NZM","H NIZAMUDDIN","21:35","1","0"},
       {"2","BRC","VADODARA","11:10","11:28","2","986"},
       {"3","BVI","BORIVALI","16:48","16:50","2","1347"},
       {"4","BDTS","BANDRA TERMINUS","17:50","2","1366"}
     };
     public static String[][] t19_stop={
         {"1","NZM","H NIZAMUDDIN","","15:40","1","0"},
         {"2","MTJ","MATHURA","17:10","17:12","1","134"},
         {"3","BRC","VADODARA","02:52","03:09","2","986"},
         {"4","ST","SURAT","04:42","04:45","2","1115"},
         {"5","BDTS","BANDRA TERMINUS","08:05","","2","1366"}
         };
    
    public static String[][] t20_stop={
        {"1","ASR","AMRITSAR","","08:15","1","0"},
        {"2","BEAS","BEAS","08:43","08:45","1","43"},
        {"3","JRC","JALANDHAR CANTT","09:33","09:35","1","84"},
        {"4","PGW","PHAGWARA","09:47","09:49","1","100"},
        {"5","LDH","LUDHIANA","10:35","10:45","1","136"},
        {"6","KKDE","KURUKSHETRA","13:42","13:44","1","291"},
        {"7","KUN","KARNAL","14:11","14:13","1","324"},
        {"8","PNP","PANIPAT","14:44","14:46","1","359"},
        {"9","NDLS","NEW DELHI","16:35","16:55","1","448"},
        {"10","MTJ","MATHURA","19:10","19:15","1","589"},
        {"11","BRC","VADODARA","08:30","08:48","2","1440"},
        {"12","ST","SURAT","10:40","10:45","2","1569"},
        {"13","BVI","BORIVALI","14:18","14:20","2","1802"},
        {"14","ADH","ANDHERI","14:38","14:40","2","1814"},
        {"15","BDTS","BANDRA TERMINUS","15:15","","2","1821"}
        };
   public static String[][] t21_stop={
       {"1","KLK","KALKA","10:20","1","0"},
       {"2","CDG","CHANDIGARH","11:05","11:20","1","38"},
       {"3","KKDE","KURUKSHETRA","13:42","13:44","1","147"},
       {"4","PNP","PANIPAT","14:44","14:46","1","214"},
       {"5","NDLS","NEW DELHI","16:35","16:55","1","303"},
       {"6","FDB","FARIDABAD","17:22","17:24","1","331"},
       {"7","MTJ","MATHURA","19:10","19:15","1","444"},
       {"8","BRC","VADODARA","08:30","08:48","2","1296"},
       {"9","ST","SURAT","10:40","10:45","2","1425"},
       {"10","BVI","BORIVALI","14:18","14:20","2","1658"},
       {"11","ADH","ANDHERI","14:38","14:40","2","1670"},
       {"12","BDTS","BANDRA TERMINUS","15:15","2","1676"},
    };                                                                                          
    public static String[][] t22_stop={
        {"1","NDLS","NEW DELHI","","16:30","0","1"},
        {"2","BRC","VADODRA","03:24","03:40","993","2"},
        {"3","ST","SURAT","05:10","05:13","1122","2"},
        {"4","BCT","MUMBAI CENTRAL","08:35","","1384","2"}
    };                                                                                               
    public static String[][] t23_stop={
        {"1","NZM","H NIZAMUDDIN","","16:55","0","1"},
        {"2","MTJ","MATHURA","18:38","18:40","134","1"},
        {"3","SWM","SAWAI MADHOPUR","20:35","20:37","350","1"},
        {"4","BRC","VADODARA","4:23","4:40","986","2"},
        {"5","ST","SURAT","6:15","6:20","1115","2"},
        {"6","BVI","BORIVALI","9:30","9:32","1347","2"},
        {"7","BCT","MUMBAI CENTRAL","10:15","","1377","2"}
    };
                                                  
   public static String[][] t24_stop={
      {"1","DDN","DEHRADUN","","10:40","0","1"},
      {"2","HW","HARIDWAR JN","12:30","12:50","52","1"},
      {"3","MOZ","MUZAFFARNAGAR","17:42","17:44","191","1"},
      {"4","MTC","MEERUT CITY","18:40","19:20","246","1"},
      {"5","GZN","N GHAZIABAD","20:00","20:02","287","1"},
      {"6","NZM","H NIZAMUDDIN","21:15","21:55","316","1"},
      {"7","FDB","FARIDABAD","22:47","22:49","337","1"},
      {"8","MTJ","MATHURA JN","01:35","01:45","449","2"},
      {"9","SWM","SAWAI MADHOPUR","05:05","05:10","666","2"},
      {"10","BRC","VADODARA JN","20:00","20:10","1301","2"},
      {"11","ST","SURAT","22:30","22:38","1430","2"},
      {"12","BVI","BORIVALI","03:35","03:37","1663","3"},
      {"13","BDTS","BANDRA TERMINUS","04:30","","1682","3"}
  }; 
  public static String[][] t25_stop={
      {"1","FZR","FIROZPUR CANTT","","04:30","0","1"},
      {"2","FDK","FARIDKOT","04:54","04:56","33","1"},
      {"3","ROK","ROHTAK","10:35","10:50","315","1"},
      {"4","NDLS","NEW DELHI","12:35","13:05","386","1"},
      {"5","NZM","H NIZAMUDDIN","13:22","13:27","393","1"},
      {"6","FDB","FARIDABAD","14:18","14:20","414","1"},
      {"7","MTJ","MATHURA","17:00","17:10","527","1"},
      {"8","SWM","SAWAI MADHOPUR","20:50","20:55","743","1"},   
      {"9","BRC","VADODARA","10:50","11:00","1379","2"},
      {"10","ST","SURAT","13:35","13:40","1507","2"},
      {"11","BVI","BORIVALI","19:08","19:10","1740","2"},
      {"12","DR","DADAR","19:46","19:48","1764","2"},
      {"13","BCT","MUMBAI CENTRAL","20:10","","1770","2"}
    };
}
