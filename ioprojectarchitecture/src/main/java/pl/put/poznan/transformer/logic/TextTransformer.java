package pl.put.poznan.transformer.logic;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class TextTransformer {

    private final String[] transforms;

    public TextTransformer(String[] transforms){
        this.transforms = transforms;
    }

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
        }
        return text;
    }
}
