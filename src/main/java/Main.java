import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj text: ");
        String text = odczyt.nextLine();
        System.out.println("Podaj przekształcenia :\n" +
                "-pw            Zmiana pierwszych liter na wielkie\n" +
                "-wm            Zmiana wszystkich liter na małe\n" +
                "-ww            Zmiana wszystkich liter na wielkie\n" +
                "-zl            Zamina liczb na forme słowną\n" +
                "-rs            Rozwiń obsługiwane przez nas skróty\n" +
                "-zs            Zwiń obsługiwane przez nas skróty\n" +
                "-fl            Przekształć na forme Latex\n" +
                "-oz            Odwróć ciąg znaków\n" +
                "-ud            Usuń duplikaty\n");
        String przemiany = odczyt.nextLine();
        przemiany = przemiany.replace(" ", "");
        String[] listaPrzemian = przemiany.split("-");

        for(int i=0;i<listaPrzemian.length;i++) {
            if(listaPrzemian[i].equals("pw")){
                text = Transformations.pierwszeWielkie(new TText(text)).getText();
            }
            if(listaPrzemian[i].equals("wm")){
                text = Transformations.wszystkieMale(new TText(text)).getText();
            }
            if(listaPrzemian[i].equals("ww")){
                text = Transformations.wszystkieWielkie(new TText(text)).getText();
            }
            if(listaPrzemian[i].equals("zl")){
                text = Transformations.zmienLiczbyNaSlowa(new TText(text)).getText();
            }
            if(listaPrzemian[i].equals("rs")){
                text = Transformations.rozwinSkrot(new TText(text)).getText();
            }
            if(listaPrzemian[i].equals("zs")){
                text = Transformations.zwinSkrot(new TText(text)).getText();
            }
            if(listaPrzemian[i].equals("fl")){
                text = Transformations.naFormatLatexa(new TText(text)).getText();
            }
            if(listaPrzemian[i].equals("oz")){
                text = Transformations.odwrocZnaki(new TText(text)).getText();
            }
            if(listaPrzemian[i].equals("ud")){
                text = Transformations.usunDuplikaty(new TText(text)).getText();
            }
        }

        System.out.println(text);
    }
}
