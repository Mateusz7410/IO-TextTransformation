package pl.put.poznan.transformer.logic;
/**
 * Dekorator zamieniający wszystkie pierwsze znaki w wyrazach na wielkie, dekorujący obiekt TText.
 */
class PierwszeWielkie extends TransformedText{
    PierwszeWielkie(Text text) {
        super(text);
    }

    /**
     * Nadpisanie metody z klasy abstrakcyjnej.
     */
    @Override
    protected String getTransformedText(String text){
        return pierwszeWielkie(text);
    }



    /**
     * Metoda zamieniająca pierwszy znak każdego wyrazu na wielki.
     */
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
}
