package pl.put.poznan.transformer.logic;

import org.json.simple.JSONObject;

/**
 * Obsługa logiczna Text Transformera. Zwraca zmieniony tekst w formacie String , wykonując na nim operacje według kolejności użytkownika, do kontrolera.
 */
public class TextTransformer {

    /**
     * Tablica zawierające transformacje do wykonania, podane przez użytkownika.
     */
    private final String[] transforms;

    public TextTransformer(String[] transforms){
        this.transforms = transforms;
    }


    /**
     * Metoda sprawdzająca rodzaj transformacji i wszystkie podane w pętli.
     * Na koniec zwraca przekonwertowany tekst.
     */
    public String transform(String text){
        for(int i=0;i<transforms.length;i++) {
            if(transforms[i].equals("pw")){
                text = Transformations.pierwszeWielkie(new TText(text)).getText();
            }
            if(transforms[i].equals("wm")){
                text = Transformations.wszystkieMale(new TText(text)).getText();
            }
            if(transforms[i].equals("ww")){
                text = Transformations.wszystkieWielkie(new TText(text)).getText();
            }
            if(transforms[i].equals("zl")){
                text = Transformations.zmienLiczbyNaSlowa(new TText(text)).getText();
            }
            if(transforms[i].equals("rs")){
                text = Transformations.rozwinSkrot(new TText(text)).getText();
            }
            if(transforms[i].equals("zs")){
                text = Transformations.zwinSkrot(new TText(text)).getText();
            }
            if(transforms[i].equals("fl")){
                text = Transformations.naFormatLatexa(new TText(text)).getText();
            }
            if(transforms[i].equals("oz")){
                text = Transformations.odwrocZnaki(new TText(text)).getText();
            }
            if(transforms[i].equals("ud")){
                text = Transformations.usunDuplikaty(new TText(text)).getText();
            }
            if(transforms[i].equals("up")){
                text = Transformations.usunPolskie(new TText(text)).getText();
            }
        }
        return text;
    }
}
