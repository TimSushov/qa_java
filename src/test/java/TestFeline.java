import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Mock
    Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(Collections.singletonList("Хищник"));
        Assert.assertEquals(Collections.singletonList("Хищник"), feline.eatMeat());
    }

    @Test
    public void testGetFamily(){
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        Assert.assertEquals("Кошачьи", feline.getFamily());

    }

    @Test
    public void testGetKittens(){
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensCount(){
        Mockito.when(feline.getKittens(333)).thenReturn(333);
        Assert.assertEquals(333, feline.getKittens(333));
    }
}
