import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransformationsTest {
    @Test
    public void usunDuplikatyTest() throws Exception {
        Assert.assertEquals("xy ab cd", Transformations.usunDuplikaty(new TText("xy ab ab ab cd")).getText());
        Assert.assertEquals("ab cd qw xy qw", Transformations.usunDuplikaty(new TText("ab cd cd qw xy xy qw")).getText());
        Assert.assertEquals("ąę śż źó łń", Transformations.usunDuplikaty(new TText("ąę ąę śż śż źó źó łń łń")).getText());
    }

    @Test
    public void odwrocAngielskie() throws Exception {
        Assert.assertEquals("EkZcEIcyw an YMEiZdej", Transformations.odwrocZnaki(new TText("JeDzIEmy na WYCIeCzke")).getText());
        Assert.assertEquals("KerIm", Transformations.odwrocZnaki(new TText("MirEk")).getText());
    }

    @Test
    public void odwrocSpecjalne() throws Exception {
        Assert.assertEquals("aInALAizD#TSet@TSej!Ot", Transformations.odwrocZnaki(new TText("tO!JESt@TeST#dZIAlaNIa")).getText());
        Assert.assertEquals("+_)(*&^%$#@!", Transformations.odwrocZnaki(new TText("!@#$%^&*()_+")).getText());
    }

    @Test
    public void odwrocPolskie() throws Exception {
        Assert.assertEquals("AkżDŻór aTłÓż", Transformations.odwrocZnaki(new TText("ŻółTA rÓżDżKa")).getText());
        Assert.assertEquals("ąBĘg ĆErż", Transformations.odwrocZnaki(new TText("żREć GĘbą")).getText());
    }

    @Test
    public void naFormatLatexaTest() throws Exception {
        Assert.assertEquals("\\&a\\&b\\& \\&\\& \\&c\\&d\\&", Transformations.naFormatLatexa(new TText("&a&b& && &c&d&")).getText());
        Assert.assertEquals("\\$a\\$ \\$ b\\$c \\$", Transformations.naFormatLatexa(new TText("$a$ $ b$c $")).getText());
        Assert.assertEquals("\\$\\&\\$ \\&\\$\\&", Transformations.naFormatLatexa(new TText("$&$ &$&")).getText());
        Assert.assertEquals("\\$\\n\\&\\n\\n\\$", Transformations.naFormatLatexa(new TText("$\\n&\\n\\n$")).getText());
    }

    @Test
    public void rozwinSkrotTest() throws Exception {
        Assert.assertEquals("Profesor asdfafaasda profesor  profesor Profesor jejea.pl prof.eheh profesor dskfjsfkdProf. heh Profesor alehandro profesor", Transformations.rozwinSkrot(new TText("Prof. asdfafaasda pRoF.  prof. Prof. jejea.pl prof.eheh prof. dskfjsfkdProf. heh Prof. alehandro prof.")).getText());

        Assert.assertEquals("doktor asdfafaasda Doktor doktor alaDr Doktor doktor jojo doktor alehandro doktor Doktor", Transformations.rozwinSkrot(new TText("dr asdfafaasda Dr dr alaDr Dr dr jojo dr alehandro dr Dr")).getText());

        Assert.assertEquals("Na przykład  asdfafaasda Na przykład elonp. Np.jolo Na przykład ehhe na przykład alehandro na przykład", Transformations.rozwinSkrot(new TText("Np.  asdfafaasda Np. elonp. Np.jolo Np. ehhe np. alehandro np.")).getText());

        Assert.assertEquals("i tak dalej asdfafaasda I tak dalej witamitd. i tak dalej Itd.siemka alehandro I tak dalej", Transformations.rozwinSkrot(new TText("itd. asdfafaasda Itd. witamitd. itd. Itd.siemka alehandro Itd.")).getText());

        Assert.assertEquals("Profesor powiedział mi, że na przykład chciałby mieć tytuł Doktor ale nie wiem czy doktor to dla niego nie za dużo i tak dalej", Transformations.rozwinSkrot(new TText("Prof. powiedział mi, że np. chciałby mieć tytuł Dr ale nie wiem czy dr to dla niego nie za dużo itd.")).getText());

    }

    @Test
    public void zwinSkrot() throws Exception {
        Assert.assertEquals("Itp. widziały dzisiaj np. m.in. na przykuad M.in.", Transformations.zwinSkrot(new TText("I tYm poDobNe widziały dzisiaj na przYkłAd między innymi na przykuad MiĘdzy Innymi")).getText());

        Assert.assertEquals("M.in. widziały dzisiaj np. m.in. na przykuad itp.", Transformations.zwinSkrot(new TText("MiĘDzy InnYmi widziały dzisiaj na przYkłAd między innymi na przykuad i tym podobne")).getText());

        Assert.assertEquals("Np. widziały dzisiaj np. m.in. na przykuad np.", Transformations.zwinSkrot(new TText("Na przykład widziały dzisiaj na przYkłAd między innymi na przykuad na przykład")).getText());

    }

    @Test
    public void wszystkieMale() throws Exception {
        Assert.assertEquals("jedziemy na wycieczke", Transformations.wszystkieMale(new TText("JedzIEMy Na wYCIEczkE")).getText());
        Assert.assertEquals("to jest test dzialania, poprawnego dzialania! jest dobrze?", Transformations.wszystkieMale(new TText("tO JESt TeST dZIAlaNIa, PoprawNEGo DZiaLAnia! JESt dOBrZe?")).getText());
        Assert.assertEquals("czy jenkins dziala", Transformations.wszystkieMale(new TText("CZY JENKINS DZIALA")).getText());
    }

    @Test
    public void wszystkieWielkie() throws Exception {
        Assert.assertEquals("JEDZIEMY NA WYCIECZKE", Transformations.wszystkieWielkie(new TText("JedzIEMy Na wYCIEczkE")).getText());
        Assert.assertEquals("TO JEST TEST DZIALANIA, POPRAWNEGO DZIALANIA! JEST DOBRZE?", Transformations.wszystkieWielkie(new TText("tO JESt TeST dZIAlaNIa, PoprawNEGo DZiaLAnia! JESt dOBrZe?")).getText());

    }

    @Test
    public void pierwszeWielkie() throws Exception {
        Assert.assertEquals("Jedziemy Na Wycieczke", Transformations.pierwszeWielkie(new TText("JedzIEMy Na wYCIEczkE")).getText());
        Assert.assertEquals("To Jest Test Dzialania, Poprawnego Dzialania! Jest Dobrze?", Transformations.pierwszeWielkie(new TText("tO JESt TeST dZIAlaNIa, PoprawNEGo DZiaLAnia! JESt dOBrZe?")).getText());

    }

    @Test
    public void zmienLiczbyNaSlowa() throws Exception {
        Assert.assertEquals("dwa plus dwa wynosi cztery", Transformations.zmienLiczbyNaSlowa(new TText("2 plus 2 wynosi 4")).getText());
        Assert.assertEquals("jedenascie i trzydziesci trzy oraz siedemdziesiat dwa", Transformations.zmienLiczbyNaSlowa(new TText("11 i 33 oraz 72")).getText());
        Assert.assertEquals("Ania ma siedemset siedemdziesiat dwa psy", Transformations.zmienLiczbyNaSlowa(new TText("Ania ma 772 psy")).getText());
        Assert.assertEquals("sto czterdziesci dwa krzesla", Transformations.zmienLiczbyNaSlowa(new TText("142 krzesla")).getText());
        Assert.assertEquals("dwadziescia trzy obiady", Transformations.zmienLiczbyNaSlowa(new TText("23 obiady")).getText());
        Assert.assertEquals("jedenascie misek", Transformations.zmienLiczbyNaSlowa(new TText("11 misek")).getText());
    }

    @Test
    public void zmienLiczbyNaSlowa2() throws Exception {
        Assert.assertEquals("jeden i jedna dziesiata zlotego", Transformations.zmienLiczbyNaSlowa(new TText("1.1 zlotego")).getText());
        Assert.assertEquals("dwa i jedna dziesiata", Transformations.zmienLiczbyNaSlowa(new TText("2.1")).getText());
        Assert.assertEquals("dwa i pol", Transformations.zmienLiczbyNaSlowa(new TText("2.5")).getText());
    }

    @Test
    public void zmienLiczbyNaSlowa3() throws Exception {
        Assert.assertEquals("dziewiecdziesiat dwa i trzynascie setnych", Transformations.zmienLiczbyNaSlowa(new TText("92.13")).getText());
        Assert.assertEquals("sto dwadziescia osiem i czterdziesci dwa setne", Transformations.zmienLiczbyNaSlowa(new TText("128.42")).getText());
        Assert.assertEquals("dziewiecset dziewiecdziesiat dziewiec i dziewiecdziesiat dziewiec setnych", Transformations.zmienLiczbyNaSlowa(new TText("999.99")).getText());
    }

    @Test
    public void klikaNaRaz() {
        Text transformedText = new TText("gdy Prof. Adam jedzie na wycieczke 22 grudnia. Dr Kotecki też by chciał ale nie jest dr");
        transformedText = Transformations.rozwinSkrot(transformedText);
        transformedText = Transformations.zmienLiczbyNaSlowa(transformedText);
        transformedText = Transformations.pierwszeWielkie(transformedText);
        Assert.assertEquals("Gdy Profesor Adam Jedzie Na Wycieczke Dwadziescia Dwa Grudnia. Doktor Kotecki Też By Chciał Ale Nie Jest Doktor", transformedText.getText());
    }

}