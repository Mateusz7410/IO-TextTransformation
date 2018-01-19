package pl.put.poznan.transformer.logic;
/**
 * Dekorator usuwający polskie znaki diakrytyczne, dekorujący obiekt TText.
 */
public class UsunPolskie extends TransformedText{
    UsunPolskie(Text text) {
        super(text);
    }
    /**
     * Nadpisanie metody z klasy abstrakcyjnej.
     */
    @Override
    protected String getTransformedText(String text){
        return usunPolskie(text);
    }

    /**
     * Metoda zamieniająca wszystkie poslkie znaki diakrytyczne na odpowiedniki bez "ogonków".
     */
    public String usunPolskie(String text){
        return text.replace("ą","a").replace("Ą","A").replace("ć","c").replace("Ć","C")
                .replace("ę","e").replace("Ę","E").replace("ł","l").replace("Ł","L").
                        replace("ń","n").replace("Ń","N").replace("ó","o").replace("Ó","O").
                        replace("ś","s").replace("Ś","S").replace("ź","z").replace("Ź","Z").
                        replace("ż","z").replace("Ż","Z");
    }
}
