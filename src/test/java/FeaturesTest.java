import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class FeaturesTest {
    private Features features;

    @Before
    public void setUp() {
        features = new Features();
    }

    @Test
    public void rozwinSkrotTest() throws Exception {
        Assert.assertEquals("Profesor asdfafaasda profesor  profesor Profesor jejea.pl prof.eheh profesor dskfjsfkdProf. heh Profesor alehandro profesor", features.rozwinSkrot("Prof. asdfafaasda pRoF.  prof. Prof. jejea.pl prof.eheh prof. dskfjsfkdProf. heh Prof. alehandro prof."));

        Assert.assertEquals("doktor asdfafaasda Doktor doktor alaDr Doktor doktor jojo doktor alehandro doktor Doktor", features.rozwinSkrot("dr asdfafaasda Dr dr alaDr Dr dr jojo dr alehandro dr Dr"));

        Assert.assertEquals("Na przykład  asdfafaasda Na przykład elonp. Np.jolo Na przykład ehhe na przykład alehandro na przykład", features.rozwinSkrot("Np.  asdfafaasda Np. elonp. Np.jolo Np. ehhe np. alehandro np."));

        Assert.assertEquals("i tak dalej asdfafaasda I tak dalej witamitd. i tak dalej Itd.siemka alehandro I tak dalej", features.rozwinSkrot("itd. asdfafaasda Itd. witamitd. itd. Itd.siemka alehandro Itd."));

        Assert.assertEquals("Profesor powiedział mi, że na przykład chciałby mieć tytuł Doktor ale nie wiem czy doktor to dla niego nie za dużo i tak dalej", features.rozwinSkrot("Prof. powiedział mi, że np. chciałby mieć tytuł Dr ale nie wiem czy dr to dla niego nie za dużo itd."));

    }

    @Test
    public void zwinSkrot() throws Exception {
        Assert.assertEquals("Itp. widziały dzisiaj np. m.in. na przykuad M.in.", features.zwinSkrot("I tYm poDobNe widziały dzisiaj na przYkłAd między innymi na przykuad MiĘdzy Innymi"));

        Assert.assertEquals("M.in. widziały dzisiaj np. m.in. na przykuad itp.", features.zwinSkrot("MiĘDzy InnYmi widziały dzisiaj na przYkłAd między innymi na przykuad i tym podobne"));

        Assert.assertEquals("Np. widziały dzisiaj np. m.in. na przykuad np.", features.zwinSkrot("Na przykład widziały dzisiaj na przYkłAd między innymi na przykuad na przykład"));

    }

    @Test
    public void wszystkieMale() throws Exception {
        Assert.assertEquals("jedziemy na wycieczke", features.wszystkieMale("JedzIEMy Na wYCIEczkE"));
        Assert.assertEquals("to jest test dzialania, poprawnego dzialania! jest dobrze?", features.wszystkieMale("tO JESt TeST dZIAlaNIa, PoprawNEGo DZiaLAnia! JESt dOBrZe?"));
        Assert.assertEquals("czy jenkins dziala", features.wszystkieMale("CZY JENKINS DZIALA"));
    }

    @Test
    public void wszystkieWielkie() throws Exception {
        Assert.assertEquals("JEDZIEMY NA WYCIECZKE", features.wszystkieWielkie("JedzIEMy Na wYCIEczkE"));
        Assert.assertEquals("TO JEST TEST DZIALANIA, POPRAWNEGO DZIALANIA! JEST DOBRZE?", features.wszystkieWielkie("tO JESt TeST dZIAlaNIa, PoprawNEGo DZiaLAnia! JESt dOBrZe?"));

    }

    @Test
    public void pierwszeWielkie() throws Exception {
        Assert.assertEquals("Jedziemy Na Wycieczke", features.pierwszeWielkie("JedzIEMy Na wYCIEczkE"));
        Assert.assertEquals("To Jest Test Dzialania, Poprawnego Dzialania! Jest Dobrze?", features.pierwszeWielkie("tO JESt TeST dZIAlaNIa, PoprawNEGo DZiaLAnia! JESt dOBrZe?"));

    }

    @Test
    public void zmienLiczbyNaSlowa() throws Exception {
        Assert.assertEquals("dwa plus dwa wynosi cztery", features.zmienLiczbyNaSlowa("2 plus 2 wynosi 4"));
        //Assert.assertEquals("jeden i jedna dziesiata", features.zmienLiczbyNaSlowa("1,1"));
        Assert.assertEquals("jedenascie i trzydziesci trzy oraz siedemdziesiat dwa", features.zmienLiczbyNaSlowa("11 i 33 oraz 72"));
        Assert.assertEquals("Ania ma siedemset siedemdziesiat dwa psy", features.zmienLiczbyNaSlowa("Ania ma 772 psy"));
        Assert.assertEquals("sto czterdziesci dwa krzesla", features.zmienLiczbyNaSlowa("142 krzesla"));
        Assert.assertEquals("dwadziescia trzy obiady", features.zmienLiczbyNaSlowa("23 obiady"));
        Assert.assertEquals("jedenascie misek", features.zmienLiczbyNaSlowa("11 misek"));
    }
}
