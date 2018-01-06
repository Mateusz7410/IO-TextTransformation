public class WszystkieMale extends TransformedText {
    WszystkieMale(Text text) {
        super(text);
    }

    @Override
    protected String getTransformedText(String text){
        return wszystkieMale(text);
    }

    public String wszystkieMale(String text)
    {
        text = text.toLowerCase();
        return text;
    }
}
