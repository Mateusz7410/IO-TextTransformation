package pl.put.poznan.transformer.logic;
/**
 * Dekorator zamieniający wszystkie znaki wyrażenia na małe, dekorujący obiekt TText.
 */
class WszystkieMale extends TransformedText {
    WszystkieMale(Text text) {
        super(text);
    }

    /**
     * Nadpisanie metody z klasy abstrakcyjnej.
     */
    @Override
    protected String getTransformedText(String text){
        return wszystkieMale(text);
    }


    /**
     * Metoda zamieniająca wszystkie znaki podanego wyrażenia na małe.
     */
    public String wszystkieMale(String text)
    {
        text = text.toLowerCase();
        return text;
    }
}

