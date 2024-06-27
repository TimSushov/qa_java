import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Spy
    Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(Collections.singletonList("Хищник"));
        Assert.assertEquals(Collections.singletonList("Хищник"), feline.eatMeat());
    }

    @Test
    public void testGetFamily(){
        feline.getFamily();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens(){
        feline.getKittens();
        Mockito.verify(feline).getKittens(1);
    }

    @Test
    public void testGetKittensCount(){
        feline.getKittens(333);
        Assert.assertEquals(333, feline.getKittens(333));

    }
}
