import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;


@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Spy
    Feline feline;

    @Test
    public void testGetKittenslion() throws Exception {
        Lion lion = new Lion("Самец",  feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetKittensCountLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens(333);
        Assert.assertEquals(333, lion.getKittens(333));
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.doesHaveMane();
    }

    @Test
    public void testGetFoodLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getFood()).thenReturn(Collections.singletonList("Хищник"));
        Assert.assertEquals(Collections.singletonList("Хищник"), lion.getFood());
    }

}
