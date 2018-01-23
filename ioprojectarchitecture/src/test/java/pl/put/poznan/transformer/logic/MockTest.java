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
        TransformedText mock=mock(TransformedText.class);
        when(mock.getText()).thenReturn("dziala");
        verify(mock).getText();
        Assert.assertEquals("dziala", mock.getText());

        /*WszystkieWielkie mock=mock(WszystkieWielkie.class);
        when(mock.wszystkieWielkie(eq("mama"))).thenReturn("MAMA");
        verify(mock).wszystkieWielkie(eq("mama"));
        Assert.assertEquals("MAMA", mock.wszystkieWielkie(eq("mama")));*/
    }
}