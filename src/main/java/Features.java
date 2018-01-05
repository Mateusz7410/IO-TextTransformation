

public class Features {

    public String rozwinSkrot(String text){
        //Prof. -> Profesor | prof. -> profesor

        text = text.replaceAll("\\sp[r|R][o|O][f|F]\\.\\s", " profesor ");
        text = text.replaceAll("\\sP[r|R][o|O][f|F]\\.\\s", " Profesor ");
        text = text.replaceAll("\\sP[r|R][o|O][f|F]\\.$", " Profesor");
        text = text.replaceAll("^P[r|R][o|O][f|F]\\.\\s", "Profesor ");
        text = text.replaceAll("\\sp[r|R][o|O][f|F]\\.$", " profesor");
        text = text.replaceAll("^p[r|R][o|O][f|F]\\.\\s", "profesor ");

        //Dr -> Doktor | dr -> doktor

        text = text.replaceAll("\\sd[r|R]\\s", " doktor ");
        text = text.replaceAll("\\sD[r|R]\\s", " Doktor ");
        text = text.replaceAll("\\sd[r|R]$", " doktor");
        text = text.replaceAll("^d[r|R]\\s", "doktor ");
        text = text.replaceAll("\\sD[r|R]$", " Doktor");
        text = text.replaceAll("^D[r|R]\\s", "Doktor ");

        //Np. -> Na przykład | np. -> na przykład

        text = text.replaceAll("\\sn[p|P]\\.\\s", " na przykład ");
        text = text.replaceAll("\\sN[p|P]\\.\\s", " Na przykład ");
        text = text.replaceAll("\\sn[p|P]\\.$", " na przykład");
        text = text.replaceAll("^n[p|P]\\.\\s", "na przykład ");
        text = text.replaceAll("\\sN[p|P]\\.$", " Na przykład");
        text = text.replaceAll("^N[p|P]\\.\\s", "Na przykład ");

        //Itd. -> I tak dalej | itd. -> i tak dalej

        text = text.replaceAll("\\si[t|T][d|D]\\.\\s", " i tak dalej ");
        text = text.replaceAll("\\sI[t|T][d|D]\\.\\s", " I tak dalej ");
        text = text.replaceAll("\\si[t|T][d|D]\\.$", " i tak dalej");
        text = text.replaceAll("^i[t|T][d|D]\\.\\s", "i tak dalej ");
        text = text.replaceAll("\\sI[t|T][d|D]\\.$", " I tak dalej");
        text = text.replaceAll("^I[t|T][d|D]\\.\\s", "I tak dalej ");



        return text;
    }

    public String zwinSkrot(String text) {
        //i tym podobne (dowolna konfiguracja wielkości liter) -> itp. | Itp.

        text = text.replaceAll("\\si\\s[t|T][y|Y][m|M]\\s[p|P][o|O][d|D][o|O][b|B][n|N][e|E]\\s", " itp. ");
        text = text.replaceAll("\\sI\\s[t|T][y|Y][m|M]\\s[p|P][o|O][d|D][o|O][b|B][n|N][e|E]\\s", " Itp. ");
        text = text.replaceAll("\\si\\s[t|T][y|Y][m|M]\\s[p|P][o|O][d|D][o|O][b|B][n|N][e|E]$", " itp.");
        text = text.replaceAll("^i\\s[t|T][y|Y][m|M]\\s[p|P][o|O][d|D][o|O][b|B][n|N][e|E]\\s", "itp. ");
        text = text.replaceAll("\\sI\\s[t|T][y|Y][m|M]\\s[p|P][o|O][d|D][o|O][b|B][n|N][e|E]$", " Itp.");
        text = text.replaceAll("^I\\s[t|T][y|Y][m|M]\\s[p|P][o|O][d|D][o|O][b|B][n|N][e|E]\\s", "Itp. ");

        //między innymi (dowolna konfiguracja wielkości liter) -> m.in. | M.in.

        text = text.replaceAll("\\sm[i|I][ę|Ę][d|D][z|Z][y|Y]\\s[i|I][n|N][n|N][y|Y][m|M][i|I]\\s", " m.in. ");
        text = text.replaceAll("\\sM[i|I][ę|Ę][d|D][z|Z][y|Y]\\s[i|I][n|N][n|N][y|Y][m|M][i|I]\\s", " M.in. ");
        text = text.replaceAll("\\sm[i|I][ę|Ę][d|D][z|Z][y|Y]\\s[i|I][n|N][n|N][y|Y][m|M][i|I]$", " m.in.");
        text = text.replaceAll("^m[i|I][ę|Ę][d|D][z|Z][y|Y]\\s[i|I][n|N][n|N][y|Y][m|M][i|I]\\s", "m.in. ");
        text = text.replaceAll("\\sM[i|I][ę|Ę][d|D][z|Z][y|Y]\\s[i|I][n|N][n|N][y|Y][m|M][i|I]$", " M.in.");
        text = text.replaceAll("^M[i|I][ę|Ę][d|D][z|Z][y|Y]\\s[i|I][n|N][n|N][y|Y][m|M][i|I]\\s", "M.in. ");

        //na przykład (dowolna konfiguracja wielkości liter) -> np. | Np.

        text = text.replaceAll("\\sn[a|A]\\s[p|P][r|R][z|Z][y|Y][k|K][ł|Ł][a|A][d|D]\\s", " np. ");
        text = text.replaceAll("\\sN[a|A]\\s[p|P][r|R][z|Z][y|Y][k|K][ł|Ł][a|A][d|D]\\s", " Np. ");
        text = text.replaceAll("\\sn[a|A]\\s[p|P][r|R][z|Z][y|Y][k|K][ł|Ł][a|A][d|D]$", " np.");
        text = text.replaceAll("^n[a|A]\\s[p|P][r|R][z|Z][y|Y][k|K][ł|Ł][a|A][d|D]\\s", "np. ");
        text = text.replaceAll("\\sN[a|A]\\s[p|P][r|R][z|Z][y|Y][k|K][ł|Ł][a|A][d|D]$", " Np.");
        text = text.replaceAll("^N[a|A]\\s[p|P][r|R][z|Z][y|Y][k|K][ł|Ł][a|A][d|D]\\s", "Np. ");
        return text;
    }

    public String wszystkieWielkie(String text)
    {
        text = text.toUpperCase();
        return text;
    }

    public String wszystkieMale(String text)
    {
        text = text.toLowerCase();
        return text;
    }

    public String pierwszeWielkie(String text)
    {
        text = text.toLowerCase();
        String[] arr = text.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
    String dziesiatki[] = {"dwadziescia","trzydziesci","czterdziesci","piecdziesiat","szescdziesiat","siedemdziesiat","osiemdziesiat","dziewiecdziesiat"};
    String jednosci[] = {"zero" , "jeden" , "dwa" , "trzy" , "cztery" , "piec" , "szesc" , "siedem" , "osiem" , "dziewiec",
            "dziesiec","jedenascie","dwanascie","trzynascie","czternascie","pietnascie","szesnascie","siedemnascie","osiemnascie","dziewietnascie"};
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
    String numberWord[] = {jednosci[0],jednosci[1],jednosci[2],jednosci[3],jednosci[4],jednosci[5],jednosci[6],jednosci[7],jednosci[8],jednosci[9],
            jednosci[10],jednosci[11],jednosci[12],jednosci[13],jednosci[14],jednosci[15],jednosci[16],jednosci[17],jednosci[18],jednosci[19],
            dziesiatki[0],dziesiatki[0]+" "+jednosci[1],dziesiatki[0]+" "+jednosci[2],dziesiatki[0]+" "+jednosci[3],dziesiatki[0]+" "+jednosci[4],dziesiatki[0]+" "+jednosci[5],dziesiatki[0]+" "+jednosci[6],dziesiatki[0]+" "+jednosci[7],dziesiatki[0]+" "+jednosci[8],dziesiatki[0]+" "+jednosci[9],
            dziesiatki[1],dziesiatki[1]+" "+jednosci[1],dziesiatki[1]+" "+jednosci[2],dziesiatki[1]+" "+jednosci[3],dziesiatki[1]+" "+jednosci[4],dziesiatki[1]+" "+jednosci[5],dziesiatki[1]+" "+jednosci[6],dziesiatki[1]+" "+jednosci[7],dziesiatki[1]+" "+jednosci[8],dziesiatki[1]+" "+jednosci[9],
            dziesiatki[2],dziesiatki[2]+" "+jednosci[1],dziesiatki[2]+" "+jednosci[2],dziesiatki[2]+" "+jednosci[3],dziesiatki[2]+" "+jednosci[4],dziesiatki[2]+" "+jednosci[5],dziesiatki[2]+" "+jednosci[6],dziesiatki[2]+" "+jednosci[7],dziesiatki[2]+" "+jednosci[8],dziesiatki[2]+" "+jednosci[9],
            dziesiatki[3],dziesiatki[3]+" "+jednosci[1],dziesiatki[3]+" "+jednosci[2],dziesiatki[3]+" "+jednosci[3],dziesiatki[3]+" "+jednosci[4],dziesiatki[3]+" "+jednosci[5],dziesiatki[3]+" "+jednosci[6],dziesiatki[3]+" "+jednosci[7],dziesiatki[3]+" "+jednosci[8],dziesiatki[3]+" "+jednosci[9],
            dziesiatki[4],dziesiatki[4]+" "+jednosci[1],dziesiatki[4]+" "+jednosci[2],dziesiatki[4]+" "+jednosci[3],dziesiatki[4]+" "+jednosci[4],dziesiatki[4]+" "+jednosci[5],dziesiatki[4]+" "+jednosci[6],dziesiatki[4]+" "+jednosci[7],dziesiatki[4]+" "+jednosci[8],dziesiatki[4]+" "+jednosci[9],
            dziesiatki[5],dziesiatki[5]+" "+jednosci[1],dziesiatki[5]+" "+jednosci[2],dziesiatki[5]+" "+jednosci[3],dziesiatki[5]+" "+jednosci[4],dziesiatki[5]+" "+jednosci[5],dziesiatki[5]+" "+jednosci[6],dziesiatki[5]+" "+jednosci[7],dziesiatki[5]+" "+jednosci[8],dziesiatki[5]+" "+jednosci[9],
            dziesiatki[6],dziesiatki[6]+" "+jednosci[1],dziesiatki[6]+" "+jednosci[2],dziesiatki[6]+" "+jednosci[3],dziesiatki[6]+" "+jednosci[4],dziesiatki[6]+" "+jednosci[5],dziesiatki[6]+" "+jednosci[6],dziesiatki[6]+" "+jednosci[7],dziesiatki[6]+" "+jednosci[8],dziesiatki[6]+" "+jednosci[9],
            dziesiatki[7],dziesiatki[7]+" "+jednosci[1],dziesiatki[7]+" "+jednosci[2],dziesiatki[7]+" "+jednosci[3],dziesiatki[7]+" "+jednosci[4],dziesiatki[7]+" "+jednosci[5],dziesiatki[7]+" "+jednosci[6],dziesiatki[7]+" "+jednosci[7],dziesiatki[7]+" "+jednosci[8],dziesiatki[7]+" "+jednosci[9],

    };


    public String zmienLiczbyNaSlowa(String text)
    {
        text = text.replaceAll("[,]1\\s"," i jedna dziesiata ");

        for(int i=99; i>0; i--) {
            text = text.replaceAll(numberNumber[i], numberWord[i]);
        }
        return text;
    }

}
