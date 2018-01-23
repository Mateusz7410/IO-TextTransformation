package pl.put.poznan.transformer.logic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class MockTest
{
    @Test
    public void MockTest1()
    {
        throws Exception {
        WszystkieWielkie mock=mock(WszystkieWielkie.class);
        when(mock.wszystkieWielkie("mama")).thenReturn("wielkie");
        verify(mock).wszystkieWielkie("mama");
        Assert.assertEquals("MAMA", mock.wszystkieWielkie("mama"));
    }
}