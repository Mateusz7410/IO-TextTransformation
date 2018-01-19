package pl.put.poznan.transformer.logic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsunPolskieTest {
    @Test
    public void usunPolskieTest(){
        Assert.assertEquals("A a C c E e L l N n O o S s Z z Z z", Transformations.usunPolskie(new TText("Ą ą Ć ć Ę ę Ł ł Ń ń Ó ó Ś ś Ź ź Ż ż")).getText());
    }

    @Test
    public void usunPolskieWZdaniuTest(){
        Assert.assertEquals("Wol go pyta: „Panie chrzaszczu, Po co pan tak brzeczy w gaszczu?", Transformations.usunPolskie(new TText("Wół go pyta: „Panie chrząszczu, Po co pan tak brzęczy w gąszczu?")).getText());
    }

    @Test
    public void usunPolskieTypTest(){
        Assert.assertEquals("Pchnac w te lodz jeza lub osm skrzyn fig.", Transformations.usunPolskie(new TText("Pchnąć w tę łódź jeża lub ośm skrzyń fig.")).getText());
        Assert.assertEquals("Chwyc malzonke, stroj badz plesn z fugi", Transformations.usunPolskie(new TText("Chwyć małżonkę, strój bądź pleśń z fugi")).getText());
        Assert.assertEquals("Tkne loj, wapn. Dosc! Uf! Gryz chleb, miazsz!", Transformations.usunPolskie(new TText("Tknę łój, wapń. Dość! Uf! Gryź chleb, miąższ!")).getText());
        Assert.assertEquals("Strzasc puch nimfy w loj kan? Boze, gledz!", Transformations.usunPolskie(new TText("Strząść puch nimfy w łój kań? Boże, ględź!")).getText());
    }

}