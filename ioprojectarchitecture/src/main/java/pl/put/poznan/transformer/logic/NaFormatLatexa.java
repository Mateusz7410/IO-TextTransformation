package pl.put.poznan.transformer.logic;
/**
 * Dekorator zamieniający wyrażenie na składnie Latexa, dekorujący obiekt TText.
 */
class NaFormatLatexa extends TransformedText{
    NaFormatLatexa(Text text) {
        super(text);
    }

    /**
     * Nadpisanie metody z klasy abstrakcyjnej.
     */
    @Override
    protected String getTransformedText(String text){
        return naFormatLatexa(text);
    }

    /**
     * Metoda przekształcająca znaki "&" oraz "$" na format obsługiwany przez Latexa tzn.  zamieniająca je na odpowiednio "\&" oraz "\$"
     * & -> \&
     * $ -> \$
     */
    public String naFormatLatexa(String text){
        //& -> \&
        //$ -> \$
        text = text.replaceAll("\\n\\&\\.*", "\\\\&");
        text = text.replaceAll("\\n\\$\\.*", "\\\\\\$");
        text = text.replaceAll("\\.*\\&\\.*", "\\\\&");
        text = text.replaceAll("\\.*\\$\\.*", "\\\\\\$");
        return text;
    }
}
