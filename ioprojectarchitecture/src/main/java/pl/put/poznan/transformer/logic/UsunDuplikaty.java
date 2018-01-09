package pl.put.poznan.transformer.logic;

class UsunDuplikaty extends TransformedText {
    UsunDuplikaty(Text text) {
        super(text);
    }

    @Override
    protected String getTransformedText(String text){
        return usunDuplikaty(text);
    }

    public String usunDuplikaty(String text){
        //a a a b b -> a b
        String[] arr = text.split(" ");
        String result="";
        for (int i = 0; i < arr.length-1; i++) {
            if(!arr[i].equals(arr[i+1])) result += arr[i]+" ";
        }
        return result+arr[arr.length-1];
    }
}
