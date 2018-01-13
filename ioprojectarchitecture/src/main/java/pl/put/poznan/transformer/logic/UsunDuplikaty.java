package pl.put.poznan.transformer.logic;
/**
 * Dekorator usuwający powtarzające się duplikaty, dekorujący obiekt TText.
 */
class UsunDuplikaty extends TransformedText {
    UsunDuplikaty(Text text) {
        super(text);
    }

    /**
     * Nadpisanie metody z klasy abstrakcyjnej.
     */
    @Override
    protected String getTransformedText(String text){
        return usunDuplikaty(text);
    }

    /**
     * Metoda redukująca zbiór powtarzających się pod rząd słów do jednego wystąpienia.
     */
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
