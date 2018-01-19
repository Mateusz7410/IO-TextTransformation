package pl.put.poznan.transformer.logic;

public class UsunPolskie extends TransformedText{
    UsunPolskie(Text text) {
        super(text);
    }

    @Override
    protected String getTransformedText(String text){
        return usunPolskie(text);
    }

    public String usunPolskie(String text){
        return text.replace("ą","a").replace("Ą","A").replace("ć","c").replace("Ć","C")
                .replace("ę","e").replace("Ę","E").replace("ł","l").replace("Ł","L").
                        replace("ń","n").replace("Ń","N").replace("ó","o").replace("Ó","O").
                        replace("ś","s").replace("Ś","S").replace("ź","z").replace("Ź","Z").
                        replace("ż","z").replace("Ż","Z");
    }
}
