public class Generators {
    String spacja[] = {""," "};
    String specjalne[] = {"zero","dziesiec","jedenascie","dwanascie","trzynascie","czternascie","pietnascie","szesnascie","siedemnascie","osiemnascie","dziewietnascie","tysiac"};
    //String setki[] = {"sto","dwiescie","trzysta","czterysta","piecset","szescs"};
    String dziesiatki[] = {"","","dwadziescia","trzydziesci","czterdziesci","piecdziesiat","szescdziesiat","siedemdziesiat","osiemdziesiat","dziewiecdziesiat"};
    String jednosci[] = {"" , "jeden" , "dwa" , "trzy" , "cztery" , "piec" , "szesc" , "siedem" , "osiem" , "dziewiec"};
    String numberNumber[] = {"0","1","2","3","4","5","6","7","8","9",
            "10","11","12","13","14","15","16","17","18","19",
            "20","21","22","23","24","25","26","27","28","29",
            "30","31","32","33","34","35","36","37","38","39",
            "40","41","42","43","44","45","46","47","48","49",
            "50","51","52","53","54","55","56","57","58","59",
            "60","61","62","63","64","65","66","67","68","69",
            "70","71","72","73","74","75","76","77","78","79",
            "80","81","82","83","84","85","86","87","88","89",
            "90","91","92","93","94","95","96","97","98","99"
    };
    /*String numberWord[] = {jednosci[0], jednosci[1], jednosci[2], jednosci[3], jednosci[4], jednosci[5], jednosci[6], jednosci[7], jednosci[8], jednosci[9],
            jednosci[10], jednosci[11], jednosci[12], jednosci[13], jednosci[14], jednosci[15], jednosci[16], jednosci[17], jednosci[18], jednosci[19],
            dziesiatki[0], dziesiatki[0] + " " + jednosci[1], dziesiatki[0] + " " + jednosci[2], dziesiatki[0] + " " + jednosci[3], dziesiatki[0] + " " + jednosci[4], dziesiatki[0] + " " + jednosci[5], dziesiatki[0] + " " + jednosci[6], dziesiatki[0] + " " + jednosci[7], dziesiatki[0] + " " + jednosci[8], dziesiatki[0] + " " + jednosci[9],
            dziesiatki[1], dziesiatki[1] + " " + jednosci[1], dziesiatki[1] + " " + jednosci[2], dziesiatki[1] + " " + jednosci[3], dziesiatki[1] + " " + jednosci[4], dziesiatki[1] + " " + jednosci[5], dziesiatki[1] + " " + jednosci[6], dziesiatki[1] + " " + jednosci[7], dziesiatki[1] + " " + jednosci[8], dziesiatki[1] + " " + jednosci[9],
            dziesiatki[2], dziesiatki[2] + " " + jednosci[1], dziesiatki[2] + " " + jednosci[2], dziesiatki[2] + " " + jednosci[3], dziesiatki[2] + " " + jednosci[4], dziesiatki[2] + " " + jednosci[5], dziesiatki[2] + " " + jednosci[6], dziesiatki[2] + " " + jednosci[7], dziesiatki[2] + " " + jednosci[8], dziesiatki[2] + " " + jednosci[9],
            dziesiatki[3], dziesiatki[3] + " " + jednosci[1], dziesiatki[3] + " " + jednosci[2], dziesiatki[3] + " " + jednosci[3], dziesiatki[3] + " " + jednosci[4], dziesiatki[3] + " " + jednosci[5], dziesiatki[3] + " " + jednosci[6], dziesiatki[3] + " " + jednosci[7], dziesiatki[3] + " " + jednosci[8], dziesiatki[3] + " " + jednosci[9],
            dziesiatki[4], dziesiatki[4] + " " + jednosci[1], dziesiatki[4] + " " + jednosci[2], dziesiatki[4] + " " + jednosci[3], dziesiatki[4] + " " + jednosci[4], dziesiatki[4] + " " + jednosci[5], dziesiatki[4] + " " + jednosci[6], dziesiatki[4] + " " + jednosci[7], dziesiatki[4] + " " + jednosci[8], dziesiatki[4] + " " + jednosci[9],
            dziesiatki[5], dziesiatki[5] + " " + jednosci[1], dziesiatki[5] + " " + jednosci[2], dziesiatki[5] + " " + jednosci[3], dziesiatki[5] + " " + jednosci[4], dziesiatki[5] + " " + jednosci[5], dziesiatki[5] + " " + jednosci[6], dziesiatki[5] + " " + jednosci[7], dziesiatki[5] + " " + jednosci[8], dziesiatki[5] + " " + jednosci[9],
            dziesiatki[6], dziesiatki[6] + " " + jednosci[1], dziesiatki[6] + " " + jednosci[2], dziesiatki[6] + " " + jednosci[3], dziesiatki[6] + " " + jednosci[4], dziesiatki[6] + " " + jednosci[5], dziesiatki[6] + " " + jednosci[6], dziesiatki[6] + " " + jednosci[7], dziesiatki[6] + " " + jednosci[8], dziesiatki[6] + " " + jednosci[9],
            dziesiatki[7], dziesiatki[7] + " " + jednosci[1], dziesiatki[7] + " " + jednosci[2], dziesiatki[7] + " " + jednosci[3], dziesiatki[7] + " " + jednosci[4], dziesiatki[7] + " " + jednosci[5], dziesiatki[7] + " " + jednosci[6], dziesiatki[7] + " " + jednosci[7], dziesiatki[7] + " " + jednosci[8], dziesiatki[7] + " " + jednosci[9],
    };*/
    public String[] numberWord=new String[100] ;



    public void generatorLiczb()
    {
        int licznik=0;
        int czyspacja=0;
        String dod = new String();
        for (int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                if (i==0 || j==0)
                {
                    czyspacja=0;
                }
                else
                {
                    czyspacja=1;
                }
                if (i==0 && j==0)
                {
                    dod = specjalne[0];
                }
                else if (j==1)
                {
                    dod = specjalne[1+i];
                }
                else
                {
                    dod = dziesiatki[i] + spacja[czyspacja] + jednosci[j];
                }
                numberWord[licznik]=dod;
                licznik++;
            }
        }
    }
}
