package pl.put.poznan.transformer.logic;

public class Generators {
    String spacja[] = {""," "};
    String specjalne[] = {"zero","dziesięć","jedenaście","dwanaście","trzynaście","czternaście","piętnaście","szesnaście","siedemnaście","osiemnaście","dziewiętnaście","tysiąc"};
    String setki[] = {"","sto","dwieście","trzysta","czterysta","piecset","szescset","siedemset","osiemset","dziewiecset"};
    String dziesiatki[] = {"","","dwadzieścia","trzydzieści","czterdzieści","pięćdziesiąt","sześćdziesiąt","siedemdziesiąt","osiemdziesiąt","dziewięćdziesiąt"};
    String jednosci[] = {"" , "jeden" , "dwa" , "trzy" , "cztery" , "pięć" , "sześć" , "siedem" , "osiem" , "dziewięć"};



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
    public String[] numberWord=new String[1001] ;
    public String[] numberNumber=new String[1001];




    public void generatorLiczb()
    {
        for (int i=0;i<1001;i++)
        {
            numberNumber[i]=Integer.toString(i);
        }


        int licznik=0;
        int czyspacjadj=0;
        int czyspacjasd=0;
        String dod = new String();
        numberWord[1000]=specjalne[11];
        for (int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                for (int k=0;k<10;k++) {
                    if (j == 0 || k == 0) {
                        czyspacjadj = 0;
                    } else {
                        czyspacjadj = 1;
                    }
                    if ((j==0 && k==0) ||i==0)
                    {
                        czyspacjasd=0;
                    }
                    else
                    {
                        czyspacjasd=1;
                    }
                    if (i == 0 && j == 0 && k == 0) {
                        dod = specjalne[0];
                    } else if (j == 1) {
                        dod = specjalne[1 + k];
                    } else {
                        dod = setki[i] + spacja[czyspacjasd] + dziesiatki[j] + spacja[czyspacjadj] + jednosci[k];
                    }
                    numberWord[licznik] = dod;
                    licznik++;
                }
            }
        }
    }
}
