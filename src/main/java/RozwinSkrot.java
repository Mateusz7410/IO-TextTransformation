public class RozwinSkrot extends TransformedText{

    RozwinSkrot(Text text) {
        super(text);
    }

    @Override
    protected String getTransformedText(String text){
        return rozwinSkrot(text);
    }

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


}
