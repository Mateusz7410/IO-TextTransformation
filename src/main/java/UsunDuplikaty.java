public class UsunDuplikaty extends TransformedText {
    UsunDuplikaty(Text text) {
        super(text);
    }

    @Override
    protected String getTransformedText(String text){
        return usunDuplikaty(text);
    }

    public String usunDuplikaty(String text){
        //TODO
        return text;
    }
}