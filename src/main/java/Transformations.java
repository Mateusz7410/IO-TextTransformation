public class Transformations {
    public static Text rozwinSkrot(Text text){
        return new RozwinSkrot(text);
    }

    public static Text zwinSkrot(Text text){
        return new ZwinSkrot(text);
    }

    public static Text wszystkieWielkie(Text text){
        return new WszystkieWielkie(text);
    }

    public static Text wszystkieMale(Text text){
        return new WszystkieMale(text);
    }

    public static Text pierwszeWielkie(Text text){
        return new PierwszeWielkie(text);
    }

    public static Text zmienLiczbyNaSlowa(Text text){
        return new ZmienLiczbyNaSlowa(text);
    }
}
