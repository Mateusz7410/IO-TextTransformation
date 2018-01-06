public class ZwinSkrot extends TransformedText {
    ZwinSkrot(Text text){
        super(text);
    }

    @Override
    protected String getTransformedText(String text){
        return zwinSkrot(text);
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
}
