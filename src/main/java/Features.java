

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



    public String zmienLiczbyNaSlowa(String text)
    {
        //te dwie linijki powinny isc na start programu - tworzymy tutaj tablice z ktorych potem mozemy korzystac wielokrotnie
        Generators gen = new Generators();
        gen.generatorLiczb();

        //text = text.replaceAll("[,]1\\s"," i jedna dziesiata ");

        for(int i=99; i>0; i--) {
            text = text.replaceAll(gen.numberNumber[i], gen.numberWord[i]);
        }
        return text;
    }

}
