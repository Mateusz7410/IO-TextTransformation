package pl.put.poznan.transformer.logic;
/**
 * Klasa która jest dekorowanym obiektem.
 */
class TText implements  Text{
    private String text;

    public TText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
