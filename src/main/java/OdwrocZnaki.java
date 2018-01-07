class OdwrocZnaki extends TransformedText {
    OdwrocZnaki(Text text) {
        super(text);
    }

    @Override
    protected String getTransformedText(String text){
        return odwrocZnaki(text);
    }

    public String odwrocZnaki(String text){
        //AbCdeFG -> GfEdcBA
        char[] arr = text.toCharArray();
        String result="";
        int end=arr.length-1;
        for (int i = end; i>=0; i--){
            if (Character.isUpperCase(arr[end - i])) result += Character.toUpperCase(arr[i]);
            else result += Character.toLowerCase(arr[i]);
        }
        return result;
    }
}