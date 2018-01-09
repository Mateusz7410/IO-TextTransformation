package pl.put.poznan.transformer.logic;

class WszystkieWielkie extends TransformedText{

    WszystkieWielkie(Text text) {
        super(text);
    }

    @Override
    protected String getTransformedText(String text){
        return wszystkieWielkie(text);
    }

    public String wszystkieWielkie(String text)
    {
        text = text.toUpperCase();
        return text;
    }
}

