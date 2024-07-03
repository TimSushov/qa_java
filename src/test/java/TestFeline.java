import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestFeline {

    Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetFamily(){
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens(){
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensCount(){
        Assert.assertEquals(333, feline.getKittens(333));
    }
}
