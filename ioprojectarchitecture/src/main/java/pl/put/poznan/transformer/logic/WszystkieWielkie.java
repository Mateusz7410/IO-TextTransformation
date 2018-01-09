package pl.put.poznan.transformer.logic;
/**
 * Dekorator zamieniający wszystkie znaki wyrażenia na wielkie, dekorujący obiekt TText.
 */
class WszystkieWielkie extends TransformedText{

    WszystkieWielkie(Text text) {
        super(text);
    }
    /**
     * Nadpisanie metody z klasy abstrakcyjnej.
     */
    @Override
    protected String getTransformedText(String text){
        return wszystkieWielkie(text);
    }


    /**
     * Metoda zamieniająca wszystkie znaki podanego wyrażenia na wielkie.
     */
    public String wszystkieWielkie(String text)
    {

        text = text.toUpperCase();
        return text;
    }
}

