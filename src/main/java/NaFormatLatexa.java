class NaFormatLatexa extends TransformedText {
    NaFormatLatexa(Text text) {
        super(text);
    }

    @Override
    protected String getTransformedText(String text){
        return naFormatLatexa(text);
    }

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