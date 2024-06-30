import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class TestLionSexType {

    private String sexLion;
    private boolean hasMane;

    public TestLionSexType(String sexLion, boolean hasMane) {
        this.sexLion = sexLion;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters (name = "{index}:пол животного ({0}) ")
    public static Object[][] TestGetFoodLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetFoodLion() throws Exception {
        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);
        Lion lion = new Lion(sexLion,  felineSpy );
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }

}
