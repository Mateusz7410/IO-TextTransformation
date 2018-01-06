abstract class TransformedText implements Text {
    private Text text;

    TransformedText(Text text) {
        this.text = text;
    }

    public String getText() {
        return getTransformedText(text.getText());
    }

    abstract protected String getTransformedText(String text);
}
