import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

import static org.mockito.ArgumentMatchers.anyList;


@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Mock
    Feline feline = new Feline();

    @Test
    public void testGetKittenslion() throws Exception {
        Lion lion = new Lion("Самец",  feline);
        Assert.assertEquals(0, lion.getKittens());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.doesHaveMane();
    }

    @Test
    public void testGetFoodLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(anyList(), lion.getFood());
    }

}
